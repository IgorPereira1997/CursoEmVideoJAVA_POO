package aula12;
public abstract class Animal {
    
    private int idade;
    private float peso;
    private int membros;
    
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

}
