import java.util.Scanner;

public class App3 {

    public static void main(String[] args) {

        System.out.println("Hola, como te llamas?");
        try (Scanner sc = new Scanner(System.in)) {
            String i=sc.nextLine();
            System.out.println("Hola " + i);
        }
    }
}