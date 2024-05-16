package Ejercicio5;

import java.io.IOException;

public class programa {
    
    public static void main(String[] args) throws InterruptedException, IOException {

        new ProcessBuilder("clear").inheritIO().start().waitFor();

        consola consola1 = new consola();
        consola consola2 = new consola();
        consola consola3 = new consola();


        consola1.setMarca("Nitendo");
        consola1.setModelo("Swtich Standard");
        consola1.setFechaLanzamiento("3 de marzo de 2017");
        consola1.setComprasAproximadas("139,36 millones de copias aproximadas - enero 2024");
        consola1.setDeseabilidad("9/10");
        
        consola2.setMarca("Microsoft");
        consola2.setModelo("Xbox Series X");
        consola2.setFechaLanzamiento("10 de noviembre de 2020");
        consola2.setComprasAproximadas("+ de 21 millones de copias - enero 2024");
        consola2.setDeseabilidad("0/10");
        
        consola3.setMarca("Sony");
        consola3.setModelo("Play Station 5");
        consola3.setFechaLanzamiento("12 de noviembre de 2020");
        consola3.setComprasAproximadas("54,8 millones de copias aproximadamente - enero 2024");
        consola3.setDeseabilidad("0/10");
        
        
        System.out.println("- consola1 -");
        System.out.println("Marca: " + consola1.getMarca());
        System.out.println("Modelo: " + consola1.getModelo());
        System.out.println("Fecha Lanzamiento: " + consola1.getFechaLanzamiento());
        System.out.println("Compras Aproximadas: " + consola1.getComprasAproximadas());
        System.out.println("Deseabilidad: " + consola1.getDeseabilidad());
        
        System.out.println();
        
        System.out.println("- consola2 -");
        System.out.println("Marca: " + consola2.getMarca());
        System.out.println("Modelo: " + consola2.getModelo());
        System.out.println("Fecha Lanzamiento: " + consola2.getFechaLanzamiento());
        System.out.println("Compras Aproximadas: " + consola2.getComprasAproximadas());
        System.out.println("Deseabilidad: " + consola2.getDeseabilidad());
        
        System.out.println();
        
        System.out.println("- consola3 -");
        System.out.println("Marca: " + consola3.getMarca());
        System.out.println("Modelo: " + consola3.getModelo());
        System.out.println("Fecha Lanzamiento: " + consola3.getFechaLanzamiento());
        System.out.println("Compras Aproximadas: " + consola3.getComprasAproximadas());
        System.out.println("Deseabilidad: " + consola3.getDeseabilidad());
        
        System.out.println();
        
        
    }
}

class consola {
    private String marca;
    private String modelo;
    private String fechaLanzamiento;
    private String comprasAproximadas;
    private String deseabilidad;

    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }
    
    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
    
    public String getComprasAproximadas() {
        return comprasAproximadas;
    }
    
    public void setComprasAproximadas(String comprasAproximadas) {
        this.comprasAproximadas = comprasAproximadas;
    }
    
    public String getDeseabilidad() {
        return deseabilidad;
    }
    
    public void setDeseabilidad(String deseabilidad) {
        this.deseabilidad = deseabilidad;
    }
    
    
}