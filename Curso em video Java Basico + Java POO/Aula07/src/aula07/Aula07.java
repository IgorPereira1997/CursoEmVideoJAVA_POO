package aula07;
public class Aula07 {
    public static void main(String[] args) {   
        Lutador l1 = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 1, 2);
        Lutador l2 = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 3, 2);
        Lutador l3 = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f,12,1,2);
        Lutador l4 = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 2, 0);
        Lutador l5 = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 3, 4);
        Lutador l6 = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 4, 2);
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l1, l3);
        UEC01.lutar();
        
    }
}
