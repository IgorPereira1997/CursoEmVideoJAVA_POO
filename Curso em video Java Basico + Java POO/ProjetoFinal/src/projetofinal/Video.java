package projetofinal;
public class Video implements AcoesVideo{
    
    private String titulo;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    private int avaliacao;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao=1;
        this.views=0;
        this.curtidas=0;
        this.reproduzindo=false;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", views=" + views + ", curtidas=" + curtidas + ", reproduzindo=" + reproduzindo + ", avaliacao=" + avaliacao + '}';
    }
    
    @Override
    public void play() {
        if(!isReproduzindo()){
            setReproduzindo(true);
            System.out.println("Vídeo reproduzindo...");
        }else
            System.err.println("\nJá está reproduzindo!\n");
    }

    @Override
    public void pause() {
        if(isReproduzindo()){
            setReproduzindo(false);
            System.out.println("Vídeo pausado");
        }else
            System.err.println("\nJá está pausado!\n");
    }

    @Override
    public void like() {
        setCurtidas(getCurtidas()+1);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova=0;
        nova = (int)((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }
    
}
