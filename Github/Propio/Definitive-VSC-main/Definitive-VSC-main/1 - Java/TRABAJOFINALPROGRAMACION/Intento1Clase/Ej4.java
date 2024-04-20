package Intento1Clase;

import java.io.IOException;
import java.util.*;


public class Ej4 {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner sc = new Scanner(System.in);
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();


        System.out.print("Introduce un número: ");
        int num = sc.nextInt();

        System.out.println(num);
        Thread.sleep(100);
        while (num > 0){
            num--;
            System.out.println(num);
            Thread.sleep(100);
        }
        if (num == 0){
            System.out.println("BOOM!");
        }else if (num < 0){
            System.out.println("Debe ser un número mayor a 0");
        }
    }
}
