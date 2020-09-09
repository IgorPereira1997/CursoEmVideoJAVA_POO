package aula07;
import java.util.Random;
public class Luta {
    Random gerador = new Random();
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    public void marcarLuta(Lutador desafiante,Lutador desafiado){
        if((desafiante.getNome()).equals(desafiado.getNome())){
            setDesafiado(null);
            setDesafiante(null);
            setAprovada(false);
            System.err.println("\nLuta não pode ser marcada (Desafiado=Desafiante)\n");
        }
        else if(!((desafiante.getCategoria()).equals(desafiado.getCategoria()))||(desafiante.getCategoria()).equals("Inválido")||(desafiado.getCategoria()).equals("Inválido")){
                setDesafiado(null);
                setDesafiante(null);
                setAprovada(false);
                System.err.println("\nLuta não pode ser marcada (Lutadores de categorias diferentes ou inválidas)!\n");
        } 
        else{
            setDesafiado(desafiado);
            setDesafiante(desafiante);
            setAprovada(true);
        }        
    }
    public void lutar(){
        if(!isAprovada()){
            System.err.println("\nLuta não pode acontecer (não está aprovada)\n\n");
        }else{
            System.out.println("\n#### DESAFIANTE ####");
            getDesafiante().apresentar();
            System.out.println("\n#### DESAFIADO ####");
            getDesafiado().apresentar();
            int vencedor =gerador.nextInt(3);
            switch(vencedor){
                case 0:     //Empate
                    System.out.println("Empate!\n");
                    getDesafiante().empatarLuta();
                    getDesafiado().empatarLuta();
                    break;
                case 1:         //Ganhou Desafiante
                    System.out.println("Desafiante ("+getDesafiante().getNome()+") ganhou!!\n");
                    getDesafiante().ganharLuta();
                    getDesafiado().perderLuta();
                    break;
                case 2:         //Ganhou Desafiado
                    System.out.println("Desafiado ("+getDesafiado().getNome()+") ganhou!!\n");
                    getDesafiante().perderLuta();
                    getDesafiado().ganharLuta();
                    break;    
            }  
        }
    }
}
