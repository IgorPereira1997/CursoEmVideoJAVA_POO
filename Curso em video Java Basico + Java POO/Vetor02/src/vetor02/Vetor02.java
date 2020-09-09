package vetor02;

import java.util.Calendar;

public class Vetor02 {
    public static void main(String[] args) {
        String mes[]={"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago",
            "Set", "Out", "Nov", "Dez"};
        int dias[]={31,28,31,30,31,30,31,31,30,31,30,31}; 
        Calendar c = Calendar.getInstance();
        if((c.get(Calendar.YEAR))%4==0){
            dias[1]=29;
        }
        for(int i=0;i<mes.length;i++){
            System.out.println("O mês "+mes[i]+" possui "+dias[i]+" dias");
        }
    }
}
