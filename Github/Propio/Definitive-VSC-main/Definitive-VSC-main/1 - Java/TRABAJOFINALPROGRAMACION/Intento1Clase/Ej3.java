package Intento1Clase;

import java.io.IOException;
import java.util.*;

public class Ej3 {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner sc = new Scanner(System.in);
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();

        System.out.print("Introduce un número: ");
        int num = sc.nextInt();

        if (num > 21){
            System.out.println("\""+ num + "\" es mayor que 21");
        }else if (num == 21){
            System.out.println("\""+ num + "\" es igual que 21");
        }else{
            System.out.println("\""+ num + "\" es menor que 21");
        }
        
    }
}
