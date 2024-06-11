package EJercicio5;

import java.io.IOException;

public class programa {
    // Esto está para no cambiar el
    // nombre del archivo.
}

/* 
    No sé por qué se crean los atributos de la clase 'perro'
    si al final el método principal sólo muestra
    o más bien, solo comprueba el funcionamiento del
    procedimiento 'ladrar()'.
    O al menos eso se pide.

    Y tampoco sé por qué se crea un objeto, ¿por que hacerlo?
*/



class perro {
    private String nombre;
    private int edad;
    private String raza;
    
    public static void ladrar() {
        System.out.println("*ladrido*");
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("clear").inheritIO().start().waitFor();
        perro Perro = new perro();

        Perro.ladrar();
    }
}