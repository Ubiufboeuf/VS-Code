package CpuList.src;
import java.io.*;
import java.util.Scanner;
import org.fusesource.jansi.AnsiColor;

public class Pruebas {
    public static void main(String[] args) {
        // Creamos un objeto Console
        Console console = System.console();

        // Creamos un objeto AnsiColor
        AnsiColor color = AnsiColor.RED;

        // Establecemos el color del texto
        console.printf("%sEste texto es de color rojo.%s\n", color, color.RESET);
    }
}