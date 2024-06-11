package CositasdePrueba;
import java.io.IOException;
import java.util.Scanner;

public class Prueba1 {
    public static void main(String[] args) throws InterruptedException, IOException {
        //Intento de hacer un "limpiador" de la terminal por parte del usuraio

        Scanner sc = new Scanner(System.in);


        System.out.println("Quieres limpiar la terminal? 1. Si - 2. No");
        int a = sc.nextInt();

        if (a==1){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }else{
            System.out.println("Ok");
        }

        //Ok, esto fué muy al pedo xD

        sc.close();
    }
}
