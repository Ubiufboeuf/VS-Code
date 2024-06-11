import java.util.Scanner;

public class programa1 {
    public static void multiplicacion(int numero1, int numero2){
        
        int resultado;
        resultado = numero1 * numero2;
        System.out.println("El resultado de la multiplicacion es: "+resultado);

    }
    
     public static void main(String[] args){
         
        int numero1;
        int numero2;
        Scanner pregunto = new Scanner(System.in);
        System.out.println("Ingrese los valores de los numeros: ");
        System.out.println("Numero 1");
        numero1 = pregunto.nextInt();
        System.out.println("Numero 2");
        numero2 = pregunto.nextInt();
        multiplicacion(numero1, numero2);
        
     }
}
