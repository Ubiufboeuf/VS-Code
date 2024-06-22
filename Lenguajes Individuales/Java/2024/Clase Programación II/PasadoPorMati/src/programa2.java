import java.util.Scanner;

public class programa2 {
    
    public static String parImpar(){
        
        int numero;
        Scanner pregunto = new Scanner(System.in);
        System.out.println("Ingrese lun numero:");
        numero = pregunto.nextInt();
        int resultado;
        resultado = numero % 2;
        if(numero % 2 == 0){
           return "El numero ingresado es par"; 
        }else{
            return "El numero ingresado es impar";
        }
        
        
    }
        
    public static void main(String[] args){
        System.out.println(parImpar());
    }
}


/*
package ejercicioProcedimiento2;



public class ejercicioFuncion1 {
    
    
} 





 */