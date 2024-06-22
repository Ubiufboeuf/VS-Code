package CalculadorasXd.CHETAS_GOD;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora2 extends JFrame {
    private JTextField textField;
    private double resultado;

    public Calculadora2() {
        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String[] botones = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String boton : botones) {
            JButton btn = new JButton(boton);
            btn.addActionListener(new BotonListener());
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
    }

    private class BotonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String comando = e.getActionCommand();

            if ("0123456789.".contains(comando)) {
                textField.setText(textField.getText() + comando);
            } else if ("+-*/".contains(comando)) {
                resultado = Double.parseDouble(textField.getText());
                textField.setText("");
            } else if ("=".equals(comando)) {
                double segundoNumero = Double.parseDouble(textField.getText());
                switch (String.valueOf(resultado)) {
                    case "+":
                        resultado += segundoNumero;
                        break;
                    case "-":
                        resultado -= segundoNumero;
                        break;
                    case "*":
                        resultado *= segundoNumero;
                        break;
                    case "/":
                        if (segundoNumero != 0) {
                            resultado /= segundoNumero;
                        } else {
                            textField.setText("Error");
                            return;
                        }
                        break;
                    default:
                        resultado = segundoNumero;
                        break;
                }
                textField.setText(String.valueOf(resultado));
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculadora2 calculadoraGUI = new Calculadora2();
            calculadoraGUI.setVisible(true);
        });
    }
}