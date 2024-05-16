package Ejercicio2;

public class programa {

    public static void main(String[] args) {
        libro libro1 = new libro();
        libro libro2 = new libro();
        libro libro3 = new libro();

        libro1.setTitulo("añolifdjas");
        libro1.setAutorNombre("max");
        libro1.setAutorn("carballo");
        libro1.setCode("icpvbhmlncz2fd");
        libro1.setPrecio(125324);

        libro2.setTitulo("oñalñjesni");
        libro2.setAutorNombre("pedro");
        libro2.setAutorn("ciudadvieja");
        libro2.setCode("oaslnlfiwf");
        libro2.setPrecio(1292031);
        
        libro3.setTitulo("aldjfn.esif");
        libro3.setAutorNombre("adoilfjaoñ");
        libro3.setAutorn("aodlifjal");
        libro3.setCode("2o8jidlañid");
        libro3.setPrecio(181239);
        
        
        System.out.println("- libro1 -");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("AutorNombre: " + libro1.getAutorNombre());
        System.out.println("Autorn: " + libro1.getAutorn());
        System.out.println("Code: " + libro1.getCode());
        System.out.println("Precio: " + libro1.getPrecio());
        
        System.out.println();
        
        System.out.println("- libro2 -");
        System.out.println("Titulo: " + libro2.getTitulo());
        System.out.println("AutorNombre: " + libro2.getAutorNombre());
        System.out.println("Autorn: " + libro2.getAutorn());
        System.out.println("Code: " + libro2.getCode());
        System.out.println("Precio: " + libro2.getPrecio());
        
        System.out.println();
        
        System.out.println("- libro3 -");
        System.out.println("Titulo: " + libro3.getTitulo());
        System.out.println("AutorNombre: " + libro3.getAutorNombre());
        System.out.println("Autorn: " + libro3.getAutorn());
        System.out.println("Code: " + libro3.getCode());
        System.out.println("Precio: " + libro3.getPrecio());
        
        System.out.println();
        
        

        
    }
}
