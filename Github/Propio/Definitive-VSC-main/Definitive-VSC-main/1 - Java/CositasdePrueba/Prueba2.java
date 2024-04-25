package CositasdePrueba;
import java.io.IOException;
import java.util.Scanner;

public class Prueba2 {
    public static void main(String[] args) throws InterruptedException, IOException {
        //Inicio de sesión? Voy a ver si puedo, si tengo las CAPACIDADes jssjs

        Scanner sc = new Scanner(System.in);
        int contador = 3;
        String usuarioIngresado;
        String contraseña;
        
        String[] usuarios = new String[5];
        usuarios[0] = "Predeterminado";
        usuarios[1] = "a";
        usuarios[2] = "xd";

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        System.out.println("Bienvenido al simulador de windows 7 :P jsjjsjjs");
        Thread.sleep(1000);
        for (int i = 3; i>=1 && i<=3; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        
        System.out.println("        - Usuarios registrados -");
        System.out.println("");

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] != null)
            System.out.println(i+1 + ". \"" + usuarios[i] + "\"");
        }

        System.out.println("");
        System.out.println("Ingrese el nombre de uruario: ");
        usuarioIngresado = sc.nextLine();
        
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        




        
        
        contador = 0;
        usuarioIngresado = "";
        contraseña = "";
        System.out.print(contraseña+usuarioIngresado+contador);
        sc.close();
    }
}
