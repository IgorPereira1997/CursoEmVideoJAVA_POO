package aula10_11;
import java.util.Random;
public class Aluno extends Pessoa{
    Random gerador = new Random();
    private int matr= gerador.nextInt(1001);
    private String curso;
    public Aluno(String nome, short idade, String sexo, float mensalidade, String curso) {
        super(nome, idade, sexo);
        setMatr(this.matr);
        setCurso(curso);
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void pagarMensalidade(){
        System.out.println("Mensalidade de "+getNome()+" paga!");
    }
}
