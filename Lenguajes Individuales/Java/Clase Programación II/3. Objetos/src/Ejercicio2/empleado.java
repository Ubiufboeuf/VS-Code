package Ejercicio2;

public class empleado {
    
    String nombre;
    String apellido;
    String cargo;
    float salario;
    String departamento;

    public static void main(String[] args) {
        
        empleado empleado1 = new empleado();
        empleado empleado2 = new empleado();
        empleado empleado3 = new empleado();


        empleado1.nombre = "Matías";
        empleado1.apellido = "García";
        empleado1.cargo = "Limpieza";
        empleado1.salario = 3000f;
        empleado1.departamento = "Salto";

        empleado2.nombre = "Axel";
        empleado2.apellido = "García";
        empleado2.cargo = "Administrador de proyectos";
        empleado2.salario = 24000f;
        empleado2.departamento = "Colonia";

        empleado3.nombre = "Pedro";
        empleado3.apellido = "Pirez";
        empleado3.cargo = "Limpieza";
        empleado3.salario = 3000f;
        empleado3.departamento = "Montevideo";


        System.out.println("\n\n\n");

        System.out.println("Empleado1");
        System.out.println("Nombre: " + empleado1.nombre);
        System.out.println("Apellido: " + empleado1.apellido);
        System.out.println("Cargo: " + empleado1.cargo);
        System.out.println("Salario: " + empleado1.salario);
        System.out.println("Departamento: " + empleado1.departamento);

        System.out.println();

        System.out.println("Empleado2");
        System.out.println("Nombre: " + empleado2.nombre);
        System.out.println("Apellido: " + empleado2.apellido);
        System.out.println("Cargo: " + empleado2.cargo);
        System.out.println("Salario: " + empleado2.salario);
        System.out.println("Departamento: " + empleado2.departamento);

        System.out.println();

        System.out.println("Empleado3");
        System.out.println("Nombre: " + empleado3.nombre);
        System.out.println("Apellido: " + empleado3.apellido);
        System.out.println("Cargo: " + empleado3.cargo);
        System.out.println("Salario: " + empleado3.salario);
        System.out.println("Departamento: " + empleado3.departamento);

    }
    

}
