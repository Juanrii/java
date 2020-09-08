import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Boton {
    private JButton button;
    private JPanel panelMain;

    public Boton() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello World!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicacion Ventana");
        frame.setContentPane(new Boton().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setBounds(350, 100, 400, 550);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null); //no importan las coordenadas, siempre al centro
        frame.setResizable(false); //modificar el tamano
    }
}
