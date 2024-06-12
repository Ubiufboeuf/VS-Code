package CpuList.src;
import java.util.Scanner;

public class Back {

    Colores color = new Colores();
    Scanner sc = new Scanner(System.in);
    String marca;
    String Ifam;
    boolean bucle = true;
    boolean bucle2 = true;
    boolean bucle3 = true;
    String Iser;
    String cmdNoEnd;
    String ICi9Name0[] = { color.cyan + "Intel® Core™ i9 processor 14900K " + color.reset,
            color.cyan + "Intel® Core™ i9 processor 13900K " + color.reset,
            color.cyan + "Intel® Core™ i9 processor 14900KS" + color.reset };
    /*
     * "        Nombre de producto      |   Fecha de    |   Cantidad    |   Frecuencia    |  Intel        |   Gráficos del"
     * "                                |   lanzamiento |   de núcleos  |   turbo máxima  |  Smart Caché  |   procesador"
     * "--------------------------------|---------------|---------------|-----------------|---------------|"
     */
    String ICi9Fecha[] = { "Q4'23       |", "hoy", "c", "d" };
    String ICi9Core0[] = { "8P + 16E    |", "32", "a" };
    String ICi9GHz00[] = { "6.0 GHz       |", "4,0 GHz", "s" };
    String ICi9Cache[] = { "36 MB            |", "32MB", "k" };
    String ICi9GPU00[] = { "Intel® UHD Graphics 770", "Intel Iris Xe", "f" };

}