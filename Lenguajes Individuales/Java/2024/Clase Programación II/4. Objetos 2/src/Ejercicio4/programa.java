package Ejercicio4;

import java.io.IOException;

public class programa {
    
    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("clear").inheritIO().start().waitFor();

        estudiante estudiante1 = new estudiante();
        estudiante estudiante2 = new estudiante();
        estudiante estudiante3 = new estudiante();
        estudiante estudiante4 = new estudiante();
        estudiante estudiante5 = new estudiante();
        estudiante estudiante6 = new estudiante();

        curso curso1 = new curso(); // ingenieria industrial
        curso curso2 = new curso(); // mecanica automotriz
        curso curso3 = new curso(); // filosofia

        escuela escuela = new escuela();

        
        estudiante1.setcedula(56942082);
        estudiante1.setnombre("marcos");
        estudiante1.setapellido("hernandez");
        estudiante1.setedad(18);
        estudiante1.setcurso("ingenieria industrial");
        estudiante1.setgrado(3);

        estudiante2.setcedula(46742849);
        estudiante2.setnombre("pedro");
        estudiante2.setapellido("armando");
        estudiante2.setedad(21);
        estudiante2.setcurso("mecanica automotriz");
        estudiante2.setgrado(5);
        
        estudiante3.setcedula(63896637);
        estudiante3.setnombre("matias");
        estudiante3.setapellido("esteban");
        estudiante3.setedad(19);
        estudiante3.setcurso("filosofia");
        estudiante3.setgrado(1);
        
        estudiante4.setcedula(67829678);
        estudiante4.setnombre("laura");
        estudiante4.setapellido("quito");
        estudiante4.setedad(17);
        estudiante4.setcurso("mecanica automotriz");
        estudiante4.setgrado(7);
        
        estudiante5.setcedula(92689538);
        estudiante5.setnombre("paco");
        estudiante5.setapellido("barca");
        estudiante5.setedad(23);
        estudiante5.setcurso("filosofia");
        estudiante5.setgrado(4);
        
        estudiante6.setcedula(79926495);
        estudiante6.setnombre("isabella");
        estudiante6.setapellido("herrera");
        estudiante6.setedad(20);
        estudiante6.setcurso("ingenieria industrial");
        estudiante6.setgrado(6);
        
        
        curso1.setcurso("filosofia");
        curso1.setgrados(4);
        curso1.setdeptos("colonia, montevideo, artigas");
        curso1.setmeses(36);
        
        curso2.setcurso("ingenieria industrial");
        curso2.setgrados(11);
        curso2.setdeptos("cerro largo, durazno, florida");
        curso2.setmeses(108);
        
        curso3.setcurso("mecanica automotriz");
        curso3.setgrados(8);
        curso3.setdeptos("lavalleja, montevideo, canelones");
        curso3.setmeses(88);
        
        
        escuela.setnombre("ENPFM del Uruguay"); // Escuela Nacional Para la Fomentación del Uruguay
        escuela.setinauguracion(2026);
        escuela.setcantidadestudiantes(8641 /* "y aumentando" - pedro gonzales, 2035. */);
        escuela.setdepto("montevideo");
        escuela.setcursos("ingenieri a industrial - mecanica automotriz - filosofia");



        System.out.println("- escuela -");
        System.out.println("nombre: " + escuela.getnombre());
        System.out.println("inauguracion: " + escuela.getinauguracion());
        System.out.println("cantidad de estudiantes: " + escuela.getcantidadestudiantes());
        System.out.println("depto: " + escuela.getdepto());
        System.out.println("cursos: " + escuela.getcursos());
        
        System.out.println();
        

        System.out.println("- curso1 -");
        System.out.println("curso: " + curso1.getcurso());
        System.out.println("grados: " + curso1.getgrados());
        System.out.println("deptos: " + curso1.getdeptos());
        System.out.println("meses: " + curso1.getmeses());
        
        System.out.println();
        
        System.out.println("- curso2 -");
        System.out.println("curso: " + curso2.getcurso());
        System.out.println("grados: " + curso2.getgrados());
        System.out.println("deptos: " + curso2.getdeptos());
        System.out.println("meses: " + curso2.getmeses());
        
        System.out.println();
        
        System.out.println("- curso3 -");
        System.out.println("curso: " + curso3.getcurso());
        System.out.println("grados: " + curso3.getgrados());
        System.out.println("deptos: " + curso3.getdeptos());
        System.out.println("meses: " + curso3.getmeses());
        
        System.out.println();
        
        
        System.out.println("- estudiante estrella 1 -");
        System.out.println("cedula: " + estudiante1.getcedula());
        System.out.println("nombre: " + estudiante1.getnombre());
        System.out.println("apellido: " + estudiante1.getapellido());
        System.out.println("edad: " + estudiante1.getedad());
        System.out.println("curso: " + estudiante1.getcurso());
        System.out.println("grado: " + estudiante1.getgrado());
        System.out.println("promedio de todas las materias: " + estudiante1.getpromedio());
        System.out.println("inasistencias totales" + estudiante1.getinasistencias());
        
        System.out.println();
        
        System.out.println("- estudiante estrella 2 -");
        System.out.println("cedula: " + estudiante2.getcedula());
        System.out.println("nombre: " + estudiante2.getnombre());
        System.out.println("apellido: " + estudiante2.getapellido());
        System.out.println("edad: " + estudiante2.getedad());
        System.out.println("curso: " + estudiante2.getcurso());
        System.out.println("grado: " + estudiante2.getgrado());
        System.out.println("promedio de todas las materias: " + estudiante2.getpromedio());
        System.out.println("inasistencias totales" + estudiante2.getinasistencias());
        
        System.out.println();
        
        System.out.println("- estudiante estrella 3 -");
        System.out.println("cedula: " + estudiante3.getcedula());
        System.out.println("nombre: " + estudiante3.getnombre());
        System.out.println("apellido: " + estudiante3.getapellido());
        System.out.println("edad: " + estudiante3.getedad());
        System.out.println("curso: " + estudiante3.getcurso());
        System.out.println("grado: " + estudiante3.getgrado());
        System.out.println("promedio de todas las materias: " + estudiante3.getpromedio());
        System.out.println("inasistencias totales" + estudiante3.getinasistencias());
        
        System.out.println();
        
        System.out.println("- estudiante estrella 4 -");
        System.out.println("cedula: " + estudiante4.getcedula());
        System.out.println("nombre: " + estudiante4.getnombre());
        System.out.println("apellido: " + estudiante4.getapellido());
        System.out.println("edad: " + estudiante4.getedad());
        System.out.println("curso: " + estudiante4.getcurso());
        System.out.println("grado: " + estudiante4.getgrado());
        System.out.println("promedio de todas las materias: " + estudiante4.getpromedio());
        System.out.println("inasistencias totales" + estudiante4.getinasistencias());
        
        System.out.println();
        
        System.out.println("- estudiante estrella 5 -");
        System.out.println("cedula: " + estudiante5.getcedula());
        System.out.println("nombre: " + estudiante5.getnombre());
        System.out.println("apellido: " + estudiante5.getapellido());
        System.out.println("edad: " + estudiante5.getedad());
        System.out.println("curso: " + estudiante5.getcurso());
        System.out.println("grado: " + estudiante5.getgrado());
        System.out.println("promedio de todas las materias: " + estudiante5.getpromedio());
        System.out.println("inasistencias totales" + estudiante5.getinasistencias());
        
        System.out.println();
        
        System.out.println("- estudiante estrella 6 -");
        System.out.println("cedula: " + estudiante6.getcedula());
        System.out.println("nombre: " + estudiante6.getnombre());
        System.out.println("apellido: " + estudiante6.getapellido());
        System.out.println("edad: " + estudiante6.getedad());
        System.out.println("curso: " + estudiante6.getcurso());
        System.out.println("grado: " + estudiante6.getgrado());
        System.out.println("promedio de todas las materias: " + estudiante6.getpromedio());
        System.out.println("inasistencias totales" + estudiante6.getinasistencias());
        
        System.out.println();
    }
}

class estudiante {
    private int cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private String curso;
    private int grado;
    private double promedio = 12.0;
    private int inasistencias = 0;

    public int getcedula() {
        return cedula;
    }
    
    public void setcedula(int cedula) {
        this.cedula = cedula;
    }
    
    public String getnombre() {
        return nombre;
    }
    
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getapellido() {
        return apellido;
    }
    
    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    public int getedad() {
        return edad;
    }
    
    public void setedad(int edad) {
        this.edad = edad;
    }
    
    public String getcurso() {
        return curso;
    }
    
    public void setcurso(String curso) {
        this.curso = curso;
    }
    
    public int getgrado() {
        return grado;
    }
    
    public void setgrado(int grado) {
        this.grado = grado;
    }

    public double getpromedio() {
        return promedio;
    }

    public int getinasistencias() {
        return inasistencias;
    }
}

class curso { // ingenieria industrial, mecanica automotriz, filosofia
    private String curso;
    private int grados;
    private String deptos;
    private int meses;

    public String getcurso() {
        return curso;
    }
    
    public void setcurso(String curso) {
        this.curso = curso;
    }
    
    public int getgrados() {
        return grados;
    }
    
    public void setgrados(int grados) {
        this.grados = grados;
    }
    
    public String getdeptos() {
        return deptos;
    }
    
    public void setdeptos(String deptos) {
        this.deptos = deptos;
    }
    
    public int getmeses() {
        return meses;
    }
    
    public void setmeses(int meses) {
        this.meses = meses;
    }
}

class escuela {
    private String nombre;
    private int inauguracion;
    private int cantidadestudiantes;
    private String depto;
    private String cursos;

    public String getnombre() {
        return nombre;
    }
    
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getinauguracion() {
        return inauguracion;
    }
    
    public void setinauguracion(int inauguracion) {
        this.inauguracion = inauguracion;
    }
    
    public int getcantidadestudiantes() {
        return cantidadestudiantes;
    }
    
    public void setcantidadestudiantes(int cantidadestudiantes) {
        this.cantidadestudiantes = cantidadestudiantes;
    }
    
    public String getdepto() {
        return depto;
    }
    
    public void setdepto(String depto) {
        this.depto = depto;
    }
    
    public String getcursos() {
        return cursos;
    }
    
    public void setcursos(String cursos) {
        this.cursos = cursos;
    }
}

// Este ejercicio me tomó:

// aprox. desde las: 22:45,
// hasta las: 23:27

// tuve que usar snippets personalizados y omitir
// algunas reglas como las mayusculas de los nombres en
// los métodos get y set para programar un poco más rápido