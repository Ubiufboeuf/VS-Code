package CpuList.src;
import java.util.Scanner;

class Colores {

    String black = "\033[30m";
    String red = "\033[31m";
    String green = "\033[32m";
    String yellow = "\033[33m";
    String blue = "\033[34m";
    String purple = "\033[35m";
    String cyan = "\033[36m";
    String white = "\033[37m";
    String reset = "\u001B[0m";

    public static void main(String[] args) {
        Colores color = new Colores();
        System.out.println(color.black + "black");
        System.out.println(color.red + "red");
        System.out.println(color.green + "green");
        System.out.println(color.yellow + "yellow");
        System.out.println(color.blue + "blue");
        System.out.println(color.purple + "purple");
        System.out.println(color.cyan + "cyan");
        System.out.println(color.white + "white");
        System.out.println(color.reset + "reset");

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
    }
}