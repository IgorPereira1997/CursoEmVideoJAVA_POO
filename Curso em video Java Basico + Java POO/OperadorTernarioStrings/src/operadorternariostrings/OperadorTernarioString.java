package operadorternariostrings;

import static java.util.Arrays.equals;

public class OperadorTernarioString {
    public static void main(String[] args) {
        String nome1 = "Igor", nome2="Igor", nome3="Igor";
        String res = nome1.equals(nome3)?"igual":"diferente";
        if((nome1.equals(nome2))&&(nome1.equals(nome3))){
            System.out.println("Delicia");
        }
        System.out.println(res);
    }  
}
