package aula04;
public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
    public Caneta(String c, String m, float p){       //construtor
        this.tampada();
        this.modelo=m;
        this.cor=c;
        this.ponta=p;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo=m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta=p;
    }
    public void tampada(){
        this.tampada=true;
    }
    public void destampar(){
        this.tampada=false;
    }
    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: "+this.getModelo());
        System.out.println("Ponta: "+this.getPonta());
        System.out.println("Cor: "+this.cor);
        System.out.println("Tampada: "+this.tampada);
    }
}
