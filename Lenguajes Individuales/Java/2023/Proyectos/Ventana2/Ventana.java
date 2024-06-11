//No entendí nada, solo copié todo de un video y si funciona :O

import javax.swing.*;

public class Ventana extends JFrame{

    private JLabel et,et2,et3,et4,et5;
    private JTextField texto,texto2,texto3,texto4,texto5;


    public Ventana(){
        setTitle("Presentacion");
        setLayout(null);

        et = new JLabel("Nombre");
        et.setBounds(10, 20, 100, 35);
        add(et);

        et2 = new JLabel("Apellido");
        et2.setBounds(10, 80, 100, 35);
        add(et2);

        et3 = new JLabel("Edad");
        et3.setBounds(10, 140, 100, 35);
        add(et3);

        et4 = new JLabel("Nacionalidad");
        et4.setBounds(10,200,100,35);
        add(et4);

        et5 = new JLabel("Trabajo");
        et5.setBounds(10,260,100,35);
        add(et5);




        texto = new JTextField("");
        texto.setBounds(110,20,200,35);
        add(texto);

        texto2 = new JTextField("");
        texto2.setBounds(110,80,200,35);
        add(texto2);

        texto3 = new JTextField("");
        texto3.setBounds(110,140,200,35);
        add(texto3);

        texto4 = new JTextField("");
        texto4.setBounds(110,200,200,35);
        add(texto4);

        texto5 = new JTextField("");
        texto5.setBounds(110,260,200,35);
        add(texto5);



    }


    public static void main(String[] args) {

        Ventana ventana = new Ventana();
        ventana.setBounds(0, 0, 500, 400);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);


    }


}