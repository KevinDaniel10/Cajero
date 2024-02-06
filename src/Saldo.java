import com.sun.org.apache.xpath.internal.operations.String;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Saldo {
    public JPanel saldopanel;
    private JButton menuButton;
    public JLabel capital;
    private JButton actualizarButton;

    private String dato;


    public Saldo(double dinero){

        capital.setText(String.valueOf(trasacciones.dinero));
        menuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame2 = new JFrame("Pantalla");
                frame2.setContentPane(new trasacciones().tranpanel);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.setSize(450, 450);
                frame2.setLocationRelativeTo(null);
                frame2.setVisible(true);
                JFrame saldoFrame = (JFrame) SwingUtilities.getWindowAncestor(menuButton);
                saldoFrame.dispose();
            }
        });
        actualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(capital.getText());
                System.out.println(displayd.getText());
                try {
                    double a = Double.parseDouble(capital.getText());
                    double b = Double.parseDouble(displayd.getText());

                    // Realizar la suma
                    double suma = a + b;

                    // Actualizar el JLabel capital con el resultado de la suma
                } catch (NumberFormatException ex) {
                    // Manejar el caso en el que el texto no es un número válido
                    System.err.println("Error: No se pudo convertir el texto a un número entero.");
                }
            }
        });
    }

}

