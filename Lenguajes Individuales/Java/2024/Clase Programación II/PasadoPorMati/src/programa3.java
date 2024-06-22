
import java.util.Scanner;

public class programa3 {
    public static float area(){
        Scanner pregunto = new Scanner(System.in);
        float base;
        float altura;
        float calculoArea;
        System.out.println("-Calculadora area triangulo-");
        System.out.println("Ingrese la base del triangulo:");
        base = pregunto.nextFloat();
        System.out.println("Ingrese la altura del triangulo:");
        altura = pregunto.nextFloat();
        calculoArea = (base * altura) / 2;
        System.out.println("El area del triangulo es:");
        return calculoArea;
        
    }
    public static void main(String[] args) {
        System.out.println(area());
    }
}

/* 

package ejercicioFunciones;
public class ejercicioFuncion2 {
    
    
}



 */