package aula06;
public class ControleRemoto implements Controlador {
    private boolean ligado;
    private int volume;
    private boolean tocando;
    public ControleRemoto(){
        setVolume(50);
        setTocando(false);
        setLigado(false);
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado()){
            System.out.println("-----MENU-----");
            System.out.print("O controle está ");
            if(this.getLigado())
                System.out.println("ligado!");
            else
                System.out.println("Desligado");
            System.out.print("Volume: "+getVolume()+" ");
            for(int i=0;i<(this.getVolume()/10);i++){
                System.out.print("|");
            }
            System.out.println();
            if(this.getTocando())
                System.out.println("Está reproduzindo algo!");
            else
                System.out.println("Não está reproduzindo nada");
        }
        else
            System.err.println("\nTV está desligada!\n");
    }
    @Override
    public void fecharMenu() {
        if(!this.getLigado())
            System.err.println("\nTV está desligada!\n");
        else
            System.out.println("Fechando menu..... Menu fechado!");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            if(this.getVolume()==100)
                System.err.println("\nVolume no máximo!\n");
            else{
                setVolume(this.getVolume()+1);
                System.out.print("Volume: "+getVolume()+" ");
                for(int i=0;i<(this.getVolume()/10);i++)
                    System.out.print("|");
                System.out.println();
            }
        }else{
            System.err.println("\nTV está desligada!\n");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            if(this.getVolume()==0)
                System.err.println("\nVolume no mínimo!\n");
            else{
                setVolume(this.getVolume()-1);
                for(int i=0;i<(this.getVolume()/10);i++)
                    System.out.print("|");
                System.out.println();
            }
        }else{
            System.err.println("\nTV está desligada!\n");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado()&&(this.getVolume()>0))
            this.setVolume(0);
        else
            this.desligarMudo();
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado()&&(this.getVolume()==0))
            this.setVolume(50);
        else
            this.ligarMudo();
    }

    @Override
    public void play() {
        if(this.getLigado()&&!this.getTocando()){
            this.setTocando(true);
            System.out.println("Playing....");
        }
        else
            this.pause();
    }

    @Override
    public void pause() {
        if(this.getLigado()&&this.getTocando()){
            this.setTocando(false);
            System.out.println("Paused");
        }
        else
            this.play();
    }
}
