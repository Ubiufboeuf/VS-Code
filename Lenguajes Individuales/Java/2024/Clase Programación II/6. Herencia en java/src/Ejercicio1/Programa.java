import java.io.IOException;

public class Programa { 

    public static void main(String[] args) throws InterruptedException, IOException {
        new ProcessBuilder("clear").inheritIO().start().waitFor();

        vehiculo vehiculoPorDefecto = new vehiculo("a", "b", "c") ;
        vehiculoPorDefecto.mostrarInformacion();
        
        auto auto1 = new auto("x", "y", "z", "Rojo");
        auto1.mostrarInformacion();

        moto moto1 = new moto("p", "q", "r", 987);
        moto1.mostrarInformacion();

        camion camion1 = new camion("p", "q", "r", 321);
        camion1.mostrarInformacion();
    }
}

class vehiculo {
    private String marca;
    private String modelo;
    private String matricula;

    public vehiculo () {
    }

    public vehiculo (String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

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
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void mostrarInformacion() {
        System.out.println(
            "- Vehículo por defecto - \n" +
            "Marca: " + this.marca +
            "\nModelo: " + this.modelo +
            "\nMatrícula: " + this.matricula +
            "\n"
        );
    }
}

class auto extends vehiculo {
    private String color;

    public auto(String marca, String modelo, String matricula, String color) {
        super (marca, modelo, matricula);
        this.color = color;
    }

    public String getColor () {
        return color;
    }

    @Override
    public void mostrarInformacion () {
        System.out.println("- Auto 1 - \n"
            + "Marca: " + getMarca() + "\n"
            + "Modelo: " + getModelo() + "\n"
            + "Matrícula: " + getMatricula() + "\n"
            + "Color: " + getColor() + "\n");
    }
}

class moto extends vehiculo {
    private int cm3;

    public moto(String marca, String modelo, String matricula, int cm3) {
        super (marca, modelo, matricula);
        this.cm3 = cm3;
    }

    public int getCm3 () {
        return cm3;
    }

    @Override
    public void mostrarInformacion () {
        System.out.println("- Moto 1 - \n"
            + "Marca: " + getMarca() + "\n"
            + "Modelo: " + getModelo() + "\n"
            + "Matrícula: " + getMatricula() + "\n"
            + "Centímetros cúbicos: " + getCm3() + "\n");
    }
}

class camion extends vehiculo {
    private int capCarga;

    public camion(String marca, String modelo, String matricula, int capCarga) {
        super (marca, modelo, matricula);
        this.capCarga = capCarga;
    }

    public int getCapCarga () {
        return capCarga;
    }

    @Override
    public void mostrarInformacion () {
        System.out.println("- Camión 1 - \n"
            + "Marca: " + getMarca() + "\n"
            + "Modelo: " + getModelo() + "\n"
            + "Matrícula: " + getMatricula() + "\n"
            + "Capacidad de carga: " + getCapCarga() + "kg\n");
    }
}