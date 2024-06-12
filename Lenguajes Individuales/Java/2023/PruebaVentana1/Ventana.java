import java.awt.Color;

import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;

import org.w3c.dom.css.RGBColor;

//Esto es una clase
public class Ventana extends JFrame{

    //Esto son objetos
    private JLabel etiqueta;
    private JTextField texto;
    private JButton button;
    
    //Esto es el objeto ventana
    public Ventana(){
        //Este es el nombre de la ventana
        setTitle("Hola");
        //Creo que esto define el estilo de la ventana (no se como modificarlo)
        setLayout(null);

        //Esto es un string no modificable (como un CDT), osea, es un mensaje
        etiqueta=new JLabel("Nombre:");
        etiqueta.setBounds(10, 20, 200, 35);
        add(etiqueta);
        
        //Esta linea permite escribir en el cuadro de texto (CDT) y tambien puede mostrar algo por defecto
        texto=new JTextField("");
        //Coordenadas y tamaño del cuadro de texto
        texto.setBounds(100,20,300,35);
        //Esto crea el cuadro de texto (creo)
        add(texto);

        texto=new JTextField("");
        texto.setBounds(100, 60, 300, 35);
        texto.setBackground(Color.cyan);
        add(texto);

        button=new JButton("-button-");
        button.setBounds(100, 100, 300, 35);
        add(button);
    }


    public static void main(String[] args) {

        //Esto define el tamaño y coordenadas de la ventana en general
        Ventana ventana = new Ventana();
        ventana.isBackgroundSet(Color.cyan);
        ventana.setBounds(0, 0, 500, 300);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        
    }


    private void isBackgroundSet(Color cyan) {
    }


    
}