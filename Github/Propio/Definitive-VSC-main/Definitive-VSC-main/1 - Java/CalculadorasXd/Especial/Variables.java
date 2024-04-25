package CalculadorasXd.Especial;

public class Variables {

    Colores color = new Colores();

    String anim = "|/-\\";
    String operadores[] = { "Suma                |  (suma, +)", "Resta               |  (resta, -)",
            "Multiplicación      |  (mult, *)", "División            |  (div, /)", "Potencia            |  (pot, ^)",
            "Raíz                |  (raiz, 0.x^)", "Obtener información |  (info)",
            "Volver al Menú      |  (salir)" };
    String opcion;
    float aa;
    float bb;
    float cc;
    float dd;
    float ee;
    float ff;
    String cantVars; // Cantidad de variables
    String pregVolver = "1";
    boolean inicio = true;
    boolean suma = false;
    String info[] = { "Desarrollo               |  (dev)",
            "Información Matemática   |  (math info)   " + color.red + " - En desarrollo" + color.reset,
            "Ayuda                    |  (help)   " + color.red + " - En desarrollo" + color.reset };
    String opInfo;
    int whileFinal;
}
