package aula10_11;
public final class Tecnico extends Aluno{
    private int registroProfissional;
    public Tecnico(String nome, short idade, String sexo, float mensalidade, String curso, int registroProfissional) {
        super(nome, idade, sexo, mensalidade, curso);
        setRegistroProfissional(registroProfissional);
    }
    
    public void praticar(){
        
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
