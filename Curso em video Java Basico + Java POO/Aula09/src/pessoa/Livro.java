package pessoa;
import java.util.Random;
public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private short totPaginas;
    private short pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    Random gerador = new Random();
    public Livro(String titulo, String autor, short totPaginas, Pessoa leitor ){
        setTitulo(titulo);
        setAutor(autor);
        setTotPaginas(totPaginas);
        setLeitor(leitor);
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public short getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(short totPaginas) {
        this.totPaginas = totPaginas;
    }

    public short getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(short pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    public void detalhes(){
        System.out.println("###### LIVRO ######");
        System.out.println("Nome: "+getTitulo());
        System.out.println("Autor: "+getAutor());
        System.out.println("Total de páginas: "+getTotPaginas());
        System.out.println("Página atual: "+getPagAtual());
        if(!isAberto())
            System.out.println("Livro está fechado");
        else
            System.out.println("Livro está aberto");
        System.out.println("Quem está lendo: "+getLeitor().getNome());
        System.out.println("Idade: "+getLeitor().getIdade());
        System.out.println("Sexo: "+getLeitor().getSexo());
    }

    @Override
    public void abrir() {
        if(!isAberto()){
            setAberto(true);
            setPagAtual((short)1);
            System.out.println("\nLivro foi aberto!\n");
        }else
            System.err.println("\nLivro já aberto!\n");
    }

    @Override
    public void fechar() {
        if(isAberto()){
            setAberto(false);
            setPagAtual((short)1);
            System.out.println("\nLivro foi fechado\n");
        }else
            System.err.println("\nLivro já fechado!\n");
    }

    @Override
    public void folhear() {
        do{
            setPagAtual((short)(gerador.nextInt(getTotPaginas()+1)));
        }while(getPagAtual()==0);
    }

    @Override
    public void avancarPag() {
        if(getPagAtual()<getTotPaginas())
            setPagAtual((short)(getPagAtual()+1));
        else
            System.err.println("\nVocê já está na última página!\n");
    }

    @Override
    public void voltarPag() {
        if(getPagAtual()>1)
            setPagAtual((short)(getPagAtual()-1));
        else
            System.err.println("\nVocê já está na primeira página!\n");
    }
}
