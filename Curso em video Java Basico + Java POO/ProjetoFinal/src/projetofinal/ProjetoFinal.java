package projetofinal;
public class ProjetoFinal {
    public static void main(String[] args) {
        Video v[]= new Video[3];
        v[0]=new Video("Aula 1 de POO");
        v[1]=new Video("Aula 12 de PHP");
        v[2]=new Video("Aula 10 de HTML5");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0]=new Gafanhoto("Geturmino", 24, "M", "EstranhoG");
        g[1]=new Gafanhoto("Scarlett", 29, "F", "GostosaToda");
        
        System.out.println("\nVIDEOS\n--------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGAFANHOTOS\n-------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        
        Visalizacao vis[]  = new Visalizacao[5];
        vis[0] = new Visalizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new Visalizacao(g[0], v[1]);
        vis[1].avaliar(87.0f);
        System.out.println(vis[1].toString());
    }
}
