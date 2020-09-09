package aula02;
public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor="azul";
        c1.ponta=0.5f;
        c1.tampada=false;
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        System.out.println("\n\n");
        c2.modelo="hostnet";
        c2.cor="vermelho";
        c2.carga=80;
        c2.ponta=1.0f;
        c2.tampada=true;
        c2.status();
        c2.rabiscar();
    }
}
