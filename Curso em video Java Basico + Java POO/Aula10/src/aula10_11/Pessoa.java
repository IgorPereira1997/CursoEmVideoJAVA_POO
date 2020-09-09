package aula10_11;
public abstract class Pessoa {
    private String nome;
    private short idade;
    private String sexo;
    
    public Pessoa(String nome, short idade, String sexo){
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public short getIdade() {
        return idade;
    }

    public void setIdade(short idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public final void fazerAniversario(){
        System.out.println("\nFeliz aniversário!!!!\n");
        setIdade((short)(getIdade()+1));
    }
}
