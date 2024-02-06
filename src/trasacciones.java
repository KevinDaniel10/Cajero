import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class trasacciones extends Saldo{
    public JPanel tranpanel;
    private JRadioButton verSaldoRadioButton;
    private JRadioButton retiroRadioButton;
    private JRadioButton depósitoRadioButton;
    private JRadioButton salirRadioButton;

    public static double dinero=500;

    public trasacciones()  {

        verSaldoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        retiroRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame tranFrame = (JFrame) SwingUtilities.getWindowAncestor(retiroRadioButton);
                tranFrame.dispose();
                JFrame frame2 = new JFrame("Pantalla");
                frame2.setContentPane(new retiro(trasacciones.dinero).retiropanel);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.setSize(450, 450);
                frame2.setLocationRelativeTo(null);
                frame2.setVisible(true);
            }
        });
        depósitoRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame2 = new JFrame("Pantalla");
                frame2.setContentPane(new deposito().depositopanel);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.setSize(450, 450);
                frame2.setLocationRelativeTo(null);
                frame2.setVisible(true);
                JFrame tranFrame = (JFrame) SwingUtilities.getWindowAncestor(depósitoRadioButton);
                tranFrame.dispose();
            }
        });
        salirRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame tranFrame = (JFrame) SwingUtilities.getWindowAncestor(salirRadioButton);
                tranFrame.dispose();
                JLabel messageLabel = new JLabel("¡Muchas Gracias¡ Vuelva pronto");
                messageLabel.setHorizontalAlignment(SwingConstants.CENTER);
                JOptionPane optionPane = new JOptionPane(messageLabel);
                JDialog dialog = optionPane.createDialog(null, "Saliendo");
                dialog.setPreferredSize(new Dimension(450, 450));
                dialog.pack();
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);
            }
        });
    }
}
