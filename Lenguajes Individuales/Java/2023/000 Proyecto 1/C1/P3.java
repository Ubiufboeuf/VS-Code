package C1;

import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class P3 {

    public static void main(String[] args) throws InterruptedException, IOException {
        
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        DecimalFormat f1 = new DecimalFormat("#");
        DecimalFormat f2 = new DecimalFormat("#.###");
        DecimalFormat f3 = new DecimalFormat("#.##########");
        Scanner sc = new Scanner(System.in);

        System.out.println("Buenas, comenzamos?");
        String R = sc.nextLine();
        if (R.contains("reglas") || R.contains("ayuda")){
            System.out.println("Se puede elegir cualquier operación, pero no escribir el problema de una, va por partes, y se pueden usar simbolos");
            System.out.println("Escribe \"cls\" para limpiar la terminal");
            String cls = sc.nextLine();
            if (cls.equalsIgnoreCase("cls") || cls.contains("cls")){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
        }
        
        System.out.print("Número 1: ");
        float n1 = sc.nextFloat();
        System.out.print("Número 2: ");
        float n2 = sc.nextFloat();
        System.out.print("Operación: ");
        Scanner sc2 = new Scanner(System.in);
        String op = sc2.nextLine();
        float r;
        switch(op.toLowerCase()){
            case "+":
            case "suma":
                r = n1 + n2;
                System.out.println("Resultado: "+ (f2.format(r)));
                break;
            case "-":
            case "resta":
                r = n1 - n2;
                System.out.println("Resultado: "+ (f2.format(r)));
                break;
            case "*":
            case ".":
            r = n1 * n2;
            System.out.println("Resultado: "+ (f2.format(r)));
                String m = ("multiplicacion");
                if(op.contains(m)){
                    r = n1 * n2;
                    System.out.println("Resultado: "+ (f2.format(r)));
                }
                break;
            case "/":
                break;
        }


        
        sc.close();
    }
}