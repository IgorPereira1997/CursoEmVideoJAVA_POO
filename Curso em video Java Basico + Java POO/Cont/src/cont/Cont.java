package cont;
public class Cont {
    public static void main(String[] args) {
        for(int cc=1;cc<10;cc++){
            if(cc==2||cc==3||cc==3){
                continue;
            }
            if(cc==7){
                break;
            }
            System.out.println("Cambalhota "+cc);
        }
    } 
}
