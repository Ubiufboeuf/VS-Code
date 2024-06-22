import java.util.Scanner;

public class ChatGPT_CyD {

    public static void main(String[] args) {

        System.out.println("¿Cuánta humedad hay hoy?");
        Scanner pregHumedad = new Scanner(System.in);
        int Humedad = pregHumedad.nextInt();

        System.out.println("¿Y cuánto dinero tienes disponible?");
        System.out.println("(Por si te interesa, 1 totafrita cuesta $20, y 1 helado $60)");
        Scanner pregDinero = new Scanner(System.in);
        int Dinero = pregDinero.nextInt();

        boolean satisfecho = false; // Inicializamos satisfecho como false

        if (Humedad >= 80) {
            System.out.println("Está lloviendo");

            if (Dinero >= 20) {
                satisfecho = true; // Establecer satisfecho como true
                System.out.println("Puedes comprarte una tortafrita");
            } else {
                satisfecho = false; // Establecer satisfecho como false
                System.out.println("No puedes comprarte una tortafrita");
            }

        } else {
            System.out.println("No está lloviendo");

            if (Dinero >= 60) {
                System.out.println("Puedes comprarte un helado");
                satisfecho = true; // Establecer satisfecho como true
            } else {
                System.out.println("No puedes comprarte un helado");
                satisfecho = false; // Establecer satisfecho como false
            }
        }

        // Verificamos el valor de satisfecho y mostramos el mensaje correspondiente
        if (satisfecho) {
            System.out.println("Estás satisfecho");
        } else {
            System.out.println("No estás satisfecho");
        }
    
    
        pregDinero.close();
        pregHumedad.close();
    }



}