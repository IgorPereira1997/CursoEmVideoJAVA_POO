package aula05;
import java.util.Scanner;
public class ContaBancaria {
    Scanner entrada = new Scanner(System.in);
    public int numConta;
    protected String tipoConta;   //cc ou cp
    private String nomeDono;
    private float saldoConta;
    private boolean statusConta;     //aberto = true, fechado = false
    public ContaBancaria(){
        this.setStatusConta(false);
        this.setSaldoConta(0f);
    }
    public void abrirConta(){       // se for cc ganha 50 reais, se for cp ganha 150
        String aux;
        do{
            System.out.print("Que tipo de conta será aberta? "
                    + "(cc para conta corrente e cp para conta poupança): ");
            aux=entrada.nextLine();
            if(!(aux.equals("cc"))&&(!(aux.equals("cp")))) {
                System.err.println("\nERRO! Tipo de Conta inexistente!\n");
            }
        }while(!(aux.equals("cc"))&&(!(aux.equals("cp"))));
        setTipoConta(aux);
        System.out.println("Qual o seu nome? : ");
        setNomeDono(entrada.nextLine());
        if(getTipoConta().equals("cc")){
            setSaldoConta(50f);
            setStatusConta(true);
            System.out.println("Conta criada. Numero da conta: "+getNumConta());
            System.out.println("Saldo (criou conta corrente): "+getSaldoConta());
        }else{
            setSaldoConta(150f);
            setStatusConta(true);
            System.out.println("Conta criada. Numero da conta: "+getNumConta());
            System.out.println("Saldo (criou conta poupança): "+getSaldoConta());
        }
    }
    public void fecharConta(){      // zerar saldo e pagar os débitos
        float aux;
        if(getSaldoConta()>0){
            System.out.println("Aqui está o valor presente na sua conta: "+getSaldoConta());
            System.out.println("Saldo zerado, conta será fechada.");
            setSaldoConta(0);
            setStatusConta(false);
        }else if(getSaldoConta()==0){
            System.out.println("Saldo já zerado, conta será fechada diretamente.");
            setStatusConta(false);
        }else{
            do{
                System.out.println("Você tem débitos de "+getSaldoConta()*(-1)+" a pagar! Deposite o valor anteriormente dito");
                aux = entrada.nextFloat();
                if(aux<=0){
                    System.err.println("Valor inválido! Tente Novamente");    
                }else if (aux < (Math.abs(getSaldoConta()))){
                    setSaldoConta(getSaldoConta()+aux);
                    System.err.println("Valor insuficiente para pagamento de débitos! ainda faltam "+ getSaldoConta());
                }else{
                    setSaldoConta(getSaldoConta()+aux);
                    System.out.println("Débito zerado, conta será fechada.");
                    setStatusConta(false);
                }
            }while(getSaldoConta()==0);
            System.out.println("Entrando com o valor....Debito pago. Conta será fehcada");
        }
        setTipoConta(null);
        setNumConta(0);
    }
    public void depositar(){        // status tem q ser true
        float aux;
        if(getStatusConta()){
            do{
                System.out.print("Entre com o valor desejado para depósito : ");
                aux=entrada.nextFloat();
                if(aux<=0){
                    System.err.println("\n\nValor inválido para depósito!!!\n\n");
                }else{
                    setSaldoConta(getSaldoConta()+aux);
                    System.out.println("Novo saldo: "+getSaldoConta());
                }
            }while(aux<0);
        }else{
            System.err.println("Conta não ativada!");
        }
    }
    public void sacar(){        // status tem q ser true e até saldo o saque
        float aux;
        if(getStatusConta()){
            do{
                System.out.print("Entre com o valor desejado para depósito : ");
                aux=entrada.nextFloat();
                if(aux<=0||aux>getSaldoConta()){
                    System.err.println("\n\nValor inválido para saque (maior que o saldo ou saque negativo)!!!\n\n");
                }else{
                    setSaldoConta(getSaldoConta()+aux);
                    System.out.println("Novo saldo: "+getSaldoConta());
                }
            }while(aux<0);
        }else{
            System.err.println("Conta não ativada!");
        }
    }
    public void pagarMensalidade(){     // conta cc = 12 reais, conta cp = 20 reais. apenas é cobrado quando chamado
        if(getStatusConta()){
            System.out.println("Pagamento da mensalidade sendo realizado....Concluído!");
            if(getTipoConta().equals("cc")){
                setSaldoConta(getSaldoConta()-12);
            }else{
                setSaldoConta(getSaldoConta()-20);
            }
            System.out.println(getSaldoConta());
        }else{
            System.err.println("Conta não ativada!");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public boolean getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }
}
