import java.util.Scanner;

public class Si_Anidado_Notas {

    public static void main(String[] args) {
       
        //Pregunta inicial para saber la nota
        System.out.println("Cual es su nota?");
        Scanner pregNota = new Scanner(System.in);
        int nota = pregNota.nextInt();

        //Todo el revuelto de if's 
        if (nota<=6){
            if(nota<=3){
                System.out.println("Nota: "+nota+" - Alumno Libre");
            }else{
                System.out.println("Nota: "+nota+" - Alumno Reglamentado");
            }
        }else{
            if (nota>6){
                if (nota>=10){
                    System.out.println("Nota: "+nota+" - Alumno Destacado");
                }else{
                    System.out.println("Nota: "+nota+" - Alumno Aprobado");
                }
            }
        }


    }
    
}
