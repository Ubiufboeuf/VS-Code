import java.io.IOException;
import java.util.Scanner;


// Clase y método principal
public class MiPrograma {

    public static void main(String[] args) throws InterruptedException, IOException {

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        // Declarar variable y asignar valor;
        int unNumero;

        unNumero = 30;
        unNumero += 1; // unNumero = unNumero + 16

        // Leer y escribir en pantalla
        Scanner scanner = new Scanner(System.in);
        int otroNumero;

        System.out.println("Ingrese un número");
        otroNumero = scanner.nextInt();

        System.out.println("El número ingresado es: " + otroNumero);

        // Estructura condicional: If - Else
        if (unNumero == otroNumero) {
            System.out.println("Tu número \"" + otroNumero + "\" SI coincide con el valor \"" + unNumero + "\" de la variable \"unNumero\"");
        } else {
            System.out.println("Tu número \"" + otroNumero + "\" NO coincide con el valor \"" + unNumero + "\" de la variable \"unNumero\"");
        }
        
        // Cierre de scanner

        scanner.close();
    }
}