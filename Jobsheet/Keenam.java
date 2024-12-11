import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulir Aplikasi Tabungan");
        
        JPanel mainPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        
        JLabel lblNama = new JLabel("Nama");
        JLabel lblAlamat = new JLabel("Alamat");
        JLabel lblTelp = new JLabel("No Telp");
        JLabel lblKodePos = new JLabel("Kode Pos");
        
        JTextField txtNama = new JTextField(15);
        JTextField txtAlamat = new JTextField(15);
        JTextField txtTelp = new JTextField(15);
        JTextField txtKodePos = new JTextField(15);
        
        mainPanel.add(lblNama);
        mainPanel.add(txtNama);
        mainPanel.add(lblAlamat);
        mainPanel.add(txtAlamat);
        mainPanel.add(lblTelp);
        mainPanel.add(txtTelp);
        mainPanel.add(lblKodePos);
        mainPanel.add(txtKodePos);
        
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}