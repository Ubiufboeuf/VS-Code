import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        Boolean bucle = true;

        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        Object[] opcionesBotones = { "SI", "NO"};

         int mensajeInicio = JOptionPane.showOptionDialog(null , "¿Eres un robot?" , null , JOptionPane.YES_NO_CANCEL_OPTION , JOptionPane.QUESTION_MESSAGE, null , opcionesBotones, opcionesBotones[0]);
        
         if(mensajeInicio == 0 || mensajeInicio == 1){

            while(bucle==true){ 

                int x = (int) (screenSize.getWidth() * numeroAleatorio /100);
                int y = (int) (screenSize.getHeight() * numeroAleatorio /100);
                JFrame frame = new JFrame("¡ERROR!");
                JLabel label = new JLabel("010010101010010110101101 010010101010010110101101 010010101010010110101101 010010101010010110101101");
                frame.setSize(1000,1);
                frame.add(label);
                frame.setLocation(new Point(x, y));
                frame.setVisible(true);
            }
        }
    }
}
