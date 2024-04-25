package CalculadorasXd.CHETAS_GOD;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class App4 {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Como te llamas?");
        try (Scanner pregunton = new Scanner(System.in)) {
            String Nombre=pregunton.nextLine();
            System.out.println("Cual es tu apellido?");
                String Apellido=pregunton.nextLine();
                
                System.out.println("Escriba la nota de 1 calificacion (1/3)");
                int Nota1=pregunton.nextInt();
                System.out.println("Escriba la nota de 1 calificacion (2/3)");
                int Nota2=pregunton.nextInt();
                System.out.println("Escriba la nota de 1 calificacion (3/3)");
                int Nota3=pregunton.nextInt();
                
                int promNotas = (Nota1 + Nota2 + Nota3) /3;

                System.out.println("Cuantos años tienes?");
                int Edad=pregunton.nextInt();
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();

            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();

                System.out.println("Nombre: " + Nombre);
                System.out.println("Apellido: " + Apellido);
                System.out.println("Edad: " + Edad);
                System.out.println("Notas: " + Nota1 + ", " + Nota2 + ", " + Nota3);
                System.out.println("Promedio: " + promNotas);

                if (promNotas>=8){
                    System.out.println("Aprobado");
                    System.out.println("_________________________");
                }else{
                    System.out.println("Reprobado");
                    System.out.println("_________________________");
                
            }
            
            System.out.println("Quieres ver el siguiente mensaje? (Si, tengo que preguntar)");
            System.out.println("1. No");
            System.out.println("2. Si");
            int respuesta = pregunton.nextInt();
            
            switch (respuesta) {
                case 1: System.out.println("Ok");
                    
                    break;
            
                case 2:
                System.out.println("Quieres probar una calculadora? Está en desarrollo :3");
                System.out.println("Perdón por el orden de los números");
            System.out.println("1. Si");
            System.out.println("2. No");
            int r = pregunton.nextInt();
            
                    switch (r) {
                        case 1:
                            DecimalFormat formato1 = new DecimalFormat("#.###");

                            try (Scanner buscador = new Scanner(System.in)) {
                                int simb;
                                float num1;
                                float num2;
                                float res;
                                double res2;
                                
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("Elige una opcion (solo el numero sirve):");
                                System.out.println("1 - Suma");
                                System.out.println("2 - Resta");
                                System.out.println("3 - Multiplicacion");
                                System.out.println("4 - Division");
                                System.out.println("5 - Elevado");
                                System.out.println("6 - Raiz cuadrada");
                                System.out.print("Opcion: ");
                                simb = buscador.nextInt();

                                
                                num1 = buscador.nextFloat();
                                
                                num2 = buscador.nextFloat();


                                switch (simb) {
                                    case 1:
                                        DecimalFormat formato2 = new DecimalFormat("#");

                                        System.out.print("Número 1: ");
                                        num1 = buscador.nextFloat();
                                        System.out.print("Núemero 2: ");
                                        num2 = buscador.nextFloat();
                                        res=num1+num2;
                                        System.out.println("Resultado: " +(formato2.format(res)));
                                        break;
                                    case 2:
                                        res=num1-num2;
                                        System.out.println("Resultado: " +res);
                                        break;
                                    case 3:
                                        res=num1*num2;
                                        System.out.println("Resultado: " +res);
                                        break;
                                    case 4:
                                        res=num1/num2;
                                        System.out.println("Resultado: " +res);
                                        break;
                                    case 5:
                                        res2 = Math.pow(num1, num2);
                                        System.out.println("Resultado: " +res2);
                                        break;
                                    case 6:
                                        res2 = Math.sqrt(num1);
                                        System.out.println("Resultado: " +(formato1.format(res2)));
                                        break;


                                }
            
                                break;
                }                                    case 2: System.out.println("Ok");
                break;

                    
            }
            
            
            }
        }
    }
}