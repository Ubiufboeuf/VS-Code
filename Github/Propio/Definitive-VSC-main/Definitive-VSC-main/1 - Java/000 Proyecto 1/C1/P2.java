package C1;

import java.util.Scanner;
import java.io.IOException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.border.Border;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.*;
import com.sun.java.swing.*;

public class P2 {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner sc = new Scanner(System.in);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("Ingrese la contraseña");
        String pass = sc.nextLine();

        if (pass.equals("123abc")){
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            System.out.println("Bienvenido");
        }else{
            System.out.println("Contraseña incorrecta");
        }

        //Etiqueta
        JLabel x = new JLabel("simon");
        x.setText("a");

         JLabel y = new JLabel("b");
        y.setText("youtube.com");
        y.setHorizontalTextPosition(200);
        

        //Ventana
        JFrame frame = new JFrame("");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(x);
        frame.pack();
        frame.setVisible(true);

       


    }
}
