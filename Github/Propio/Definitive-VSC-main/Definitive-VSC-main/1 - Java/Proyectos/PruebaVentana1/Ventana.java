import javax.swing.*;

public class Ventana extends JFrame{

    private JLabel etiqueta;
    private JTextField texto;

    public Ventana(){
        setTitle("Hola");
        setLayout(null);

        etiqueta=new JLabel("Nombre:");
        etiqueta.setBounds(10, 20, 200, 35);
        add(etiqueta);

        texto=new JTextField("");
        texto.setBounds(100,20,300,35);
        add(texto);
    }


    public static void main(String[] args) {

        Ventana ventana = new Ventana();
        ventana.setBounds(0, 0, 500, 300);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}