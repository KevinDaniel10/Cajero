import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Objects;

public class login extends Saldo{
    private JPasswordField display;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton ingresarButton;
    private JButton borrarButton;
    private JButton corregirButton;
    public JPanel cajeropanel;
    private JButton a1Button;

    public login() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a2Button.getText());

            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a3Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a6Button.getText());
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a9Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText(display.getText()+a0Button.getText());
            }
        });
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String contra="1234";
                if (Objects.equals(display.getText(), contra)) {
                    JFrame frame2 = new JFrame("Pantalla");
                    frame2.setContentPane(new trasacciones().tranpanel);
                    frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame2.setSize(450, 450);
                    frame2.setLocationRelativeTo(null);
                    frame2.setVisible(true);
                    JFrame loginFrame = (JFrame) SwingUtilities.getWindowAncestor(ingresarButton);
                    loginFrame.dispose();
                } else {
                    // Etiqueta para el mensaje
                    JLabel messageLabel = new JLabel("¡Contraseña incorrecta¡ Vuelva a intentarlo");
                    messageLabel.setHorizontalAlignment(SwingConstants.CENTER);
                    // Mostrar el diálogo con la etiqueta
                    JOptionPane optionPane = new JOptionPane(messageLabel, JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog(null, "Error");
                    dialog.setPreferredSize(new Dimension(450, 450));
                    dialog.pack();
                    dialog.setVisible(true);
                    display.setText("");
                }
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String backspace = null;

                if (display.getText().length() > 0) {
                    StringBuilder strB = new StringBuilder(display.getText());
                    strB.deleteCharAt(display.getText().length() -1);
                    backspace= String.valueOf(strB);
                    display.setText(backspace);
                }

            }
        });
        corregirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
            }
        });
    }
}
