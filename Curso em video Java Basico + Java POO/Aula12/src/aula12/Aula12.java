package aula12;
public class Aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        
        /*m.setPeso(5.7f);
        m.setIdade(8);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();
        
        System.out.println();
        
        c.setPeso(55.3f);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();
        
        System.out.println();*/
        
        k.setPeso(3.94f);
        k.setIdade(5);
        k.setMembros(4);
        /*k.locomover();
        k.alimentar();
        k.emitirSom();
        k.enterrarOsso();
        k.abanarRabo();*/
        k.reagir("olá");
        k.reagir("Vai apanhar");
        System.out.println("");
        k.reagir(11, 45);
        k.reagir(23, 00);
        System.out.println("");
        k.reagir(true);
        k.reagir(false);
        System.out.println("");
        k.reagir(2, 12.5f);
        k.reagir(17, 4.5f);
    }
}
