package CalculadorasXd.CHETAS_GOD;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.IOException;  

public class Calculadora {
    public static void main(String[] args) throws IOException, InterruptedException {
        
        Scanner buscador = new Scanner(System.in);
        
        DecimalFormat formato1 = new DecimalFormat("#");
        DecimalFormat formato2 = new DecimalFormat("#,###");
        DecimalFormat formato3 = new DecimalFormat("#,###.###");
        
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("¿Quieres probar una calculadora?");
        System.out.println("Cualquier respuesta que no sea un \"no\" hará comenzar la calculadora");
        String rN1 = buscador.nextLine();
        switch (rN1){
            case "debug.config":
                System.out.print("Escriba un código: ");
                String dc = buscador.nextLine();
                switch (dc){
                    case "#00000001":
                    System.out.println("Aún no se como hacer configuraciones desde aquí :/");
                    break;
                }
                System.out.println("gg");
                break;
            case "no":
            case "No":
            case "nO": 
            case "NO":
                System.out.println("Ok, buen día");
                break;
            default:
        
       
        
            
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                
                System.out.println("Hay 2 opciones para usar la calculadora:");
                System.out.println("Opción 1 o (1) - Escribir números y luego la operación aritmética, puede ser en símbolos (+, -, *, /...)");
                System.out.println("Opción 2 o (2) - Escribir un número, la operación, el siguiente número, y así hasta que quieras");
                String opcion = buscador.nextLine();

                if (opcion.contains("1")){
                        System.out.print("Número 1: ");
                        double n1=buscador.nextDouble();
                        System.out.print("Número 2: ");
                        double n2=buscador.nextDouble();
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        
                        System.out.println("¿Qué operación quieres realizar?");
                        System.out.println("1. Suma (+)");
                        System.out.println("2. Resta (-)");
                        System.out.println("3. Multiplicación (* o .)");
                        System.out.println("4. División (/)");
                        System.out.println("5. Potencia (^)");
                        System.out.println("6. Raíz (no me deja poner el símbolo xdddd)");
                        Scanner pregunton = new Scanner(System.in);
                        String simb=pregunton.nextLine();
                        double r;
                        double r1;
                        double r2;
                        switch (simb.toLowerCase()){
                            case "1":
                            case "+":
                            case "suma":
                                r=n1+n2;
                                System.out.println(formato2.format(n1) + " + " + formato2.format(n2) + " = " + formato2.format(r));
                            break;

                            case "2":
                            case "-":
                            case "resta":
                                r=n1-n2;
                                System.out.println(formato2.format(n1) + " - " + formato2.format(n2) + " = " + formato2.format(r));
                            break;

                            case "3":
                            case "*":
                            case ".":
                            if(simb.startsWith("mult")){
                                r=n1*n2;
                                System.out.println(formato2.format(n1) + " * " + formato2.format(n2) + " = " + formato2.format(r));
                            }
                            break;

                            case "4":
                            if(simb.startsWith("div")){
                                r=n1/n2;
                                System.out.println(formato2.format(n1) + " / " + formato2.format(n2) + " = " + formato2.format(r));
                            }
                            break;

                            case "5": System.out.println(formato2.format(n1) + " ^ " + formato2.format(n2) + " = " + Math.pow(n1, n2));
                            break;

                            case "6": r1 = Math.sqrt(n1); r2 = Math.sqrt(n2);
                            System.out.println("La raíz de " + n1 + " es: " + r1);
                            System.out.println("La raíz de " + n2 + " es: " + r2);
                            break;
                        }
                

                    
                }if (opcion.startsWith("2") || opcion=="(2)") {
                    System.out.println("En desarrollo :P");
                }            
                
                
            


            
        }
    }
}