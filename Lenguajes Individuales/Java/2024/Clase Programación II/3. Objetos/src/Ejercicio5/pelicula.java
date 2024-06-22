package Ejercicio5;

public class pelicula {

    String title;
    String genero;
    int añoEstreno;
    String director = "Bob Ross";

    public static void main(String[] args) {

        pelicula pelicula1 = new pelicula();
        pelicula pelicula2 = new pelicula();
        pelicula pelicula3 = new pelicula();

        pelicula1.title = "El mundo del mañana";
        pelicula1.genero = "Acción";
        pelicula1.añoEstreno = 2021;
        pelicula1.director = "Stephen King";

        pelicula2.title = "El 5 elemento";
        pelicula2.genero = "Ficción";
        pelicula2.añoEstreno = 2014;

        pelicula3.title = "El mundo del mañana";
        pelicula3.genero = "Aventura";
        pelicula3.añoEstreno = 2012;

        System.out.println("\n\n\n");

        System.out.println("Pelicula 1");
        System.out.println("Título: " + pelicula1.title);
        System.out.println("Género: " + pelicula1.genero);
        System.out.println("Año de estreno: " + pelicula1.añoEstreno);
        System.out.println("Director: " + pelicula1.director);

        System.out.println();

        System.out.println("Pelicula 2");
        System.out.println("Títulr: " + pelicula2.title);
        System.out.println("Génerr: " + pelicula2.genero);
        System.out.println("Año de estrenr: " + pelicula2.añoEstreno);
        System.out.println("Director: " + pelicula2.director);

        System.out.println();

        System.out.println("Pelicula 3");
        System.out.println("Título: " + pelicula3.title);
        System.out.println("Género: " + pelicula3.genero);
        System.out.println("Año de estreno: " + pelicula3.añoEstreno);
        System.out.println("Director: " + pelicula3.director);

    }

}
