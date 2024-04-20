package ArchivosMasNormales;

import java.io.IOException;
import java.util.Scanner;

public class arraysYPush {

    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        Scanner sc = new Scanner(System.in);
        int[] arrayInt = new int[11];
        int contador = 0;
        
        while(contador<11){
            arrayInt[contador]=0;
            System.out.println(contador);
            contador--;
            Thread.sleep(1000);
            
        }
        System.out.println("Feliz año nuevo xd!!!");
        
        
        sc.close();



    }
}