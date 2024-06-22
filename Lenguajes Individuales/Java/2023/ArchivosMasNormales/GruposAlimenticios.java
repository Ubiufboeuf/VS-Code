package ArchivosMasNormales;

import java.io.IOException;
import java.util.Scanner;

public class GruposAlimenticios {

    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        Scanner pregunton = new Scanner(System.in);
        String[] Vegetales = {"Tomate", "Lechuga", "Zanahoria"};
        int contVeg = 0;
        String[] Lácteos = {"Yogúr", "Queso", "Leche"};
        int contLác = 0;
        String[] Cárnicos = {"Paté", "Costillas", "Alita"};
        int contCár = 0;
        String[] Cereales = {"Kellogg's", "Arroz", "Harina"};
        int contCer = 0;

        int respuesta = 6;

        System.out.println("Elige 1 de los siguientes grupos alimenticios:");
        while (respuesta>5 || respuesta<1) {
            
        
        System.out.println("1. Vegetales");
        System.out.println("2. Lácteos");
        System.out.println("3. Cárnicos");
        System.out.println("4. Cereales");
        System.out.println("5. Salir");
        respuesta = pregunton.nextInt();

        switch (respuesta){
            case 1:
                System.out.println(Vegetales[0]);
                break;
            case 2:
                System.out.println(Lácteos[0]);
                break;
            case 3:
                System.out.println(Cárnicos[0]);
                break;
            case 4:
                System.out.println(Cereales[0]);
                break;
            case 5:
                System.out.println("Ok, chau");
                break;
            default:
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
                System.out.println("Opción invalida, vuelva a elegir");
                break;
            
        }

    }
    pregunton.close();
}
}