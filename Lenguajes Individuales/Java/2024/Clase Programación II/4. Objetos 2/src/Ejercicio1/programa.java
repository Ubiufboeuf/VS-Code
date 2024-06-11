package Ejercicio1;

import java.io.IOException;

public class programa {
    
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("clear").inheritIO().start().waitFor();
        vehiculo vehiculo1 = new vehiculo();
        vehiculo vehiculo2 = new vehiculo();
        vehiculo vehiculo3 = new vehiculo();
        
        vehiculo1.setMarca("audi");
        vehiculo1.setModelo("ohfnloiq3n");
        vehiculo1.setAño(123123);
        vehiculo1.setColor("rojo");
        vehiculo1.setPrecio(12039);
        
        vehiculo2.setMarca("mercedes");
        vehiculo2.setModelo("benz");
        vehiculo2.setAño(2016);
        vehiculo2.setColor("Carmesí");
        vehiculo2.setPrecio(102983);
        
        vehiculo3.setMarca("volkswagen");
        vehiculo3.setModelo("nalehfn");
        vehiculo3.setAño(2018);
        vehiculo3.setColor("verde");
        vehiculo3.setPrecio(102938);
        
    
        System.out.println("vehiculo1");
        System.out.println("Marca: " + vehiculo1.getMarca());
        System.out.println("Modelo: " + vehiculo1.getModelo());
        System.out.println("Año: " + vehiculo1.getAño());
        System.out.println("Color: " + vehiculo1.getColor());
        System.out.println("Precio: " + vehiculo1.getPrecio());
        
        System.out.println();

        System.out.println("vehiculo2");
        System.out.println("Marca: " + vehiculo2.getMarca());
        System.out.println("Modelo: " + vehiculo2.getModelo());
        System.out.println("Año: " + vehiculo2.getAño());
        System.out.println("Color: " + vehiculo2.getColor());
        System.out.println("Precio: " + vehiculo2.getPrecio());
        
        System.out.println();
        
        System.out.println("vehiculo3");
        System.out.println("Marca: " + vehiculo3.getMarca());
        System.out.println("Modelo: " + vehiculo3.getModelo());
        System.out.println("Año: " + vehiculo3.getAño());
        System.out.println("Color: " + vehiculo3.getColor());
        System.out.println("Precio: " + vehiculo3.getPrecio());
        
        System.out.println();
    }
}
