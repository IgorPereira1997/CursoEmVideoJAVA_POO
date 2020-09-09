package aula10_11;
public final class Bolsista extends Aluno{
    private float bolsa;
    
    public Bolsista(String nome, short idade, String sexo, float mensalidade, String curso, float bolsa) {
        super(nome, idade, sexo, mensalidade , curso);
        setBolsa(bolsa);
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(getNome()+" é bolsista, pagamento facilitado!");
    }
    
    public void renovarBolsa(){
        System.out.println("Bolsa de "+getNome()+" renovada!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
