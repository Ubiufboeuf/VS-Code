package CositasdePrueba;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Prueba3 {

    public static void main(String[] args) {
        // Declaramos una ventana
        JFrame ventana = new JFrame("Ventana nueva");

        // Ajustamos el tamaño de la ventana para una pantalla de 1280 x 720p
        ventana.setSize(1280, 720);

        // Ajustamos el fondo de la ventana a blanco
        ventana.getContentPane().setBackground(Color.WHITE);

        // Ajustamos la ventana a pantalla completa
        ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);

        // Si la ventana no se puede ajustar a pantalla completa, ajustamos su tamaño y ubicación para mantener la relación de aspecto
        if (!ventana.isDisplayable()) {
            int ancho = 1280;
            int alto = 720;
            int margen = 300;
            int anchoSinMargen = ancho - 2 * margen;
            int altoSinMargen = alto * anchoSinMargen / ancho;
            ventana.setBounds(0, 0, anchoSinMargen, altoSinMargen);
        }

        // Centramos la ventana en el centro de alto y ancho de la pantalla
        ventana.setLocationRelativeTo(null);

        // Creamos un botón
        JButton boton = new JButton("Botón 1");
        boton.setBackground(Color.BLUE);

        // Ajustamos el tamaño del botón para que no ocupe toda la pantalla
        boton.setBounds(0, 0, 100, 50);

        // Ajustamos el botón para que esté centrado en la ventana
        boton.setLocation(ventana.getWidth() / 2 - boton.getWidth() / 2, ventana.getHeight() / 2 - boton.getHeight() / 2);

        // Agregamos el botón a la ventana
        ventana.add(boton);

        // Escuchamos los eventos del botón
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Creamos una nueva ventana
                JFrame ventana2 = new JFrame("Hola");

                // Ajustamos el tamaño de la ventana
                ventana2.setSize(200, 100);

                // Ajustamos el fondo de la ventana
                ventana2.getContentPane().setBackground(Color.WHITE);

                // Agregamos un label a la ventana
                JLabel label = new JLabel("Hola");
                ventana2.add(label);

                // Mostramos la ventana
                ventana2.setVisible(true);

                // Hacemos que la ventana desaparezca a los 3 segundos
                Timer timer = new Timer(3000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ventana2.dispose();
                    }
                });
                timer.start();
            }
        });

        // Mostramos la ventana
        ventana.setVisible(true);
    }
}
