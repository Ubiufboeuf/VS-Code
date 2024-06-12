package Ejercicio3;

import java.io.IOException;

public class programa {
    
    public static void main(String[] args) throws InterruptedException, IOException {
        ciudad ciudad1 = new ciudad();
        ciudad ciudad2 = new ciudad();
        ciudad ciudad3 = new ciudad();

        ciudad1.setNombre("ciudad1");
        ciudad1.setHabitantes(128391023);
        ciudad1.setDeptoNombre("jq2pwifñwoifj");
        ciudad1.setDeptoCode("#13912");
        
        ciudad2.setNombre("ciudad2");
        ciudad2.setHabitantes(912381);
        ciudad2.setDeptoNombre("depto2supongo");
        ciudad2.setDeptoCode("#13192031");
        
        ciudad3.setNombre("ciudad3");
        ciudad3.setHabitantes(809128091);
        ciudad3.setDeptoNombre("depto4,jajanodepto3");
        ciudad3.setDeptoCode("gfrtyjhnbvfrty");


        new ProcessBuilder("clear").inheritIO().start().waitFor();


        System.out.println("- ciudad1 -");
        System.out.println("Nombre: " + ciudad1.getNombre());
        System.out.println("Habitantes: " + ciudad1.getHabitantes());
        System.out.println("DeptoNombre: " + ciudad1.getDeptoNombre());
        System.out.println("DeptoCode: " + ciudad1.getDeptoCode());
        
        System.out.println();
        
        System.out.println("- ciudad2 -");
        System.out.println("Nombre: " + ciudad2.getNombre());
        System.out.println("Habitantes: " + ciudad2.getHabitantes());
        System.out.println("DeptoNombre: " + ciudad2.getDeptoNombre());
        System.out.println("DeptoCode: " + ciudad2.getDeptoCode());
        
        System.out.println();
        
        System.out.println("- ciudad3 -");
        System.out.println("Nombre: " + ciudad3.getNombre());
        System.out.println("Habitantes: " + ciudad3.getHabitantes());
        System.out.println("DeptoNombre: " + ciudad3.getDeptoNombre());
        System.out.println("DeptoCode: " + ciudad3.getDeptoCode());
        
        System.out.println();
        
    }
}

class ciudad {
    private String nombre;
    private int habitantes;
    private String deptoNombre;
    private String deptoCode;

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getHabitantes() {
        return habitantes;
    }
    
    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }
    
    public String getDeptoNombre() {
        return deptoNombre;
    }
    
    public void setDeptoNombre(String deptoNombre) {
        this.deptoNombre = deptoNombre;
    }
    
    public String getDeptoCode() {
        return deptoCode;
    }
    
    public void setDeptoCode(String deptoCode) {
        this.deptoCode = deptoCode;
    }
    
}