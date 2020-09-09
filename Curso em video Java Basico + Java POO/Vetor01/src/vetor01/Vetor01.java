package vetor01;

import java.util.Arrays;

public class Vetor01 {
    public static void main(String[] args) {
        //int n[] = new int[4];
        int n[]= {3,4,5,6,7,10};
        int pos = Arrays.binarySearch(n, 10);
        System.out.println(pos);
        System.out.println("Tamanho de n: "+n.length);
        Arrays.sort(n);
        for(int valor: n){
            System.out.print(valor + " ");
        }
        System.out.println();
        Arrays.fill(n, 0);
        
        for(int i=0;i<6;i++){
            System.out.print(n[i]+ " ");
        }
    }
}
