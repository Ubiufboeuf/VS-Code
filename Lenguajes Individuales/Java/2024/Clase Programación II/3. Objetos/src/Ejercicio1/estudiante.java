package Ejercicio1;

/**
 * Ejercicio1
 */
public class estudiante {

    String nombre;
    int edad;
    String curso;
    int promedio;

    public static void main(String[] args) {

        estudiante estudiante1 = new estudiante();
        estudiante estudiante2 = new estudiante();
        estudiante estudiante3 = new estudiante();

        estudiante1.nombre = "Paco";
        estudiante1.edad = 16;
        estudiante1.curso = "2ºBA";
        estudiante1.promedio = 11;

        estudiante2.nombre = "Marta";
        estudiante2.edad = 19;
        estudiante2.curso = "3ºBA";
        estudiante2.promedio = 9;

        estudiante3.nombre = "Antonio";
        estudiante3.edad = 17;
        estudiante3.curso = "2ºBA";
        estudiante3.promedio = 12;

        System.out.println("\n\n\n");

        System.out.println("Estudiante 1");
        System.out.println("Nombre: " + estudiante1.nombre);
        System.out.println("Edad: " + estudiante1.edad);
        System.out.println("Curso: " + estudiante1.curso);
        System.out.println("Promedio: " + estudiante1.promedio);

        System.out.println();

        System.out.println("Estudiante 2");
        System.out.println("Nombre: " + estudiante2.nombre);
        System.out.println("Edad: " + estudiante2.edad);
        System.out.println("Curso: " + estudiante2.curso);
        System.out.println("Promedio: " + estudiante2.promedio);

        System.out.println();

        System.out.println("Estudiante 3");
        System.out.println("Nombre: " + estudiante3.nombre);
        System.out.println("Edad: " + estudiante3.edad);
        System.out.println("Curso: " + estudiante3.curso);
        System.out.println("Promedio: " + estudiante3.promedio);

    }

}