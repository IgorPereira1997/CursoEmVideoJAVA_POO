package aula10_11;
public class Aula10 {
    public static void main(String[] args) {
        Visitante p1 = new Visitante("Fulano", (short)20, "M");
        Bolsista p2 = new Bolsista("Lari", (short)25, "F", 1200f , "ENG COMP", 50.0f);
        Tecnico p5 = new Tecnico("Igor", (short)21, "M", 1200f, "TEC COMP", 123456);
        Professor p3 = new Professor("Gerturmino", (short)67, "M", "Programação", 4000f);
        Funcionario p4 = new Funcionario("Lara Croft", (short)19, "F", "Direção", true );
        
        p2.pagarMensalidade();
        
        
        
    }
}
