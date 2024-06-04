import java.io.IOException;

public class Programa { 

    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("clear").inheritIO().start().waitFor();

        articulo articuloPorDefecto = new articulo("cosodelcoso", 999);
        articuloPorDefecto.mostrarContenido("art 1");

        System.out.println("\n");
        
        ropa prenda1 = new ropa("prenda", 4534, "grande");
        prenda1.mostrarContenido();

        System.out.println("\n");

        alimento alimento1 = new alimento("pancho", 99, "nunca jsjs");
        alimento1.mostrarContenido();

        System.out.println("\n");

        electrodomesticos electrodomestico1 = new electrodomesticos("microondas", 923, "samsung", "de por vida");
        electrodomestico1.mostrarContenido();

    }
}

class articulo {
    public String nombre;
    public double precio;

    public articulo () {
    }
    
    public articulo (String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void mostrarContenido(String nombre) {
        System.out.println("- " + this.nombre + " -");
        System.out.println("Precio: " + this.precio);
    }
}

class ropa extends articulo {
    private String talle;

    public ropa (String nombre, double precio, String talle) {
        super (nombre, precio);
        this.talle = talle;
    }

    public String getTalle() {
        return talle;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public void mostrarContenido() {
        System.out.println("- " + nombre + " -");
        System.out.println("Precio: " + precio);
        System.out.println("Talle: " + getTalle());
    }
}

class alimento extends articulo {
    private String fechaVencimiento;

    public alimento (String nombre, double precio, String fechaVencimiento) {
        super (nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    
    public void mostrarContenido() {
        System.out.println("- " + nombre + " -");
        System.out.println("Precio: " + precio);
        System.out.println("Fecha de vencimiento: " + getFechaVencimiento());
    }
}

class electrodomesticos extends articulo {
    private String marca;
    private String fechaGarantia;

    public electrodomesticos (String nombre, double precio, String marca, String fechaGarantia) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.fechaGarantia = fechaGarantia;
    }

    public String getNombre () {
        return nombre;
    }

    public double getPrecio () {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getFechaGarantia() {
        return fechaGarantia;
    }
    
    public void mostrarContenido() {
        System.out.println("- " + nombre + " -");
        System.out.println("Precio: " + precio);
        System.out.println("Marca: " + getMarca());
        System.out.println("Fecha de garantía: " + getFechaGarantia());
    }
}