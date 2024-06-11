package Ejercicio3;

public class producto {

    String nombre;
    int precioUd;
    int stock;
    String vencimiento;

    public static void main(String[] args) {

        producto producto1 = new producto();
        producto producto2 = new producto();
        producto producto3 = new producto();

        producto1.nombre = "Queso";
        producto1.precioUd = 120;
        producto1.stock = 241;
        producto1.vencimiento = "19/03/2026";

        producto2.nombre = "Leche";
        producto2.precioUd = 90;
        producto2.stock = 294;
        producto2.vencimiento = "23/05/2026";

        producto3.nombre = "Pan";
        producto3.precioUd = 12;
        producto3.stock = 2301;
        producto3.vencimiento = "13/04/2024";

        System.out.println("\n\n\n");

        System.out.println("Producto1");
        System.out.println("Nombre: " + producto1.nombre);
        System.out.println("PrecioUd: " + producto1.precioUd);
        System.out.println("Stock: " + producto1.stock);
        System.out.println("Vencimiento: " + producto1.vencimiento);

        System.out.println();

        System.out.println("Producto2");
        System.out.println("Nombre: " + producto2.nombre);
        System.out.println("PrecioUd: " + producto2.precioUd);
        System.out.println("Stock: " + producto2.stock);
        System.out.println("Vencimiento: " + producto2.vencimiento);

        System.out.println();

        System.out.println("Producto3");
        System.out.println("Nombre: " + producto3.nombre);
        System.out.println("PrecioUd: " + producto3.precioUd);
        System.out.println("Stock: " + producto3.stock);
        System.out.println("Vencimiento: " + producto3.vencimiento);
    }

}
