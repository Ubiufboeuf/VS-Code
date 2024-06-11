package ArchivosMasNormales;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class arrayBard {

    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arregloN = new ArrayList<>();

        System.out.println(arregloN.size());
        arregloN.add(sc.nextInt());
        System.out.println(arregloN.size());

        arregloN.add(sc.nextInt());

        System.out.println(arregloN);
    }
}