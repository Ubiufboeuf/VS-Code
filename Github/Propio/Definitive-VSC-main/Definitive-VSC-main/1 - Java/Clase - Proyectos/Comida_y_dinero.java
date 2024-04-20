import java.util.Scanner;

public class Comida_y_dinero {

    public static void main(String[] args) {

        System.out.println("¿Cuánta humedad hay hoy?");
        Scanner pregHumedad = new Scanner(System.in);
        int Humedad = pregHumedad.nextInt();

        System.out.println("¿Y cuánto dinero tienes disponible?");
        System.out.println("(Por si te interesa, 1 totafrita cuesta $20, y 1 helado $60)");
        Scanner pregDinero = new Scanner(System.in);
        int Dinero = pregDinero.nextInt();

        boolean satisfecho;

        
        
        
        if(Humedad>=80){
            System.out.println("Está lloviendo");
            
            if(Dinero>=20){
                System.out.println("Puedes comprarte una tortafrita");
                
                if(satisfecho=true){
                    satisfecho=true;
                    System.out.println("Estás satisfecho");
                }

            }else{
                System.out.println("No puedes comprarte una tortafrita");
                
                if(satisfecho=false){
                    satisfecho=false;
                    System.out.println("No estás satisfecho");
                }

            }


        }else{
            System.out.println("No está lloviendo");

            if(Dinero>=60){
                System.out.println("Puedes comprarte un helado");

            }else{
                System.out.println("No puedes comprarte un helado");

            }


        }











    }


}