package aula10_11;
public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
    public Professor(String nome, short idade, String sexo, String especialidade, float salario) {
        super(nome, idade, sexo);
        setEspecialidade(especialidade);
        setSalario(salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void receberAum(float aumento){
        if(aumento>0){
            setSalario(getSalario()+aumento);
            System.out.println("Aumento de salário da ordem de "+aumento+" realizado com sucesso");
        }else
            System.err.println("\nImpossivel fazer aumento negativo!\n");
    }
    
}
