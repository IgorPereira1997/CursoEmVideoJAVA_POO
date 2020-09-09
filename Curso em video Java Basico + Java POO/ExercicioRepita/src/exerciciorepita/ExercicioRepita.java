package exerciciorepita;
import javax.swing.JOptionPane;
public class ExercicioRepita {
    public static void main(String[] args) {
        int n, s=0, qtdVal=0, totalPares=0, totalImpares=0, plus100=0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um número <br><em>(Valor 0 interrompe)</em></html>"));
            s+=n;
            if(n%2==0){
                totalPares++;
            }else{
                totalImpares++;
            }
            if(n>100){
                plus100++;
            }
            qtdVal++;
        }while(n != 0);
        s/=qtdVal;
        JOptionPane.showMessageDialog(null, "<html>Resultado:<br><hr>"
                +"<br>Total de Valores: "+qtdVal
                +"<br>Total de Pares: "+totalPares
                +"<br>Total de Ímpares: "+totalImpares
                +"<br>Acima de 100: "+plus100
                +"<br>Média dos valores: "+s, "Resultado Final", JOptionPane.INFORMATION_MESSAGE);
    }
}
