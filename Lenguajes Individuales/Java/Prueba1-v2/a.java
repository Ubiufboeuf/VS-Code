import java.util.Scanner;

public class a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        int a = 0;
        int i;
        for (i = 1; i < 6; i++) {
            System.out.println("Ingresa el valor " + i);
            a += scanner.nextInt();
        }
        System.out.println("El resultado de la suma de esos números es " + a);

        scanner.close();
    }
}
