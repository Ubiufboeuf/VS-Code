package Ejercicio1;

public class vehiculo {
    private String marca = "clasico";
    private String modelo;
    private int año;
    private String color;
    private int precio;

    public String getMarca(){
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    public int getAño() {
        return año;
    }
    
    public String getColor() {
        return color;
    }

    public int getPrecio() {
        return precio;
    }


    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    

    

}




