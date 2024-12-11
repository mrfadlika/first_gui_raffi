import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class BukuTamu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BUKU TAMU");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel headerLabel = new JLabel("BUKU TAMU", JLabel.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        frame.add(headerLabel, gbc);
        
        JLabel subHeaderLabel = new JLabel("PENDIDIKAN TUNAS BANGSA", JLabel.CENTER);
        gbc.gridy = 1;
        frame.add(subHeaderLabel, gbc);
        
        gbc.gridwidth = 1;
        gbc.gridy = 2;
        gbc.gridx = 0;
        frame.add(new JLabel("Nama:"), gbc);
        gbc.gridx = 1;
        JTextField tf1 = new JTextField();
        frame.add(tf1, gbc);

        gbc.gridy = 3;
        gbc.gridx = 0;
        frame.add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        JTextField tf2 = new JTextField();
        frame.add(tf2, gbc);

        gbc.gridy = 4;
        gbc.gridx = 0;
        frame.add(new JLabel("Komentar:"), gbc);
        gbc.gridx = 1;
        JTextField tf3 = new JTextField();
        frame.add(tf3, gbc);

        gbc.gridy = 5;
        gbc.gridx = 1;
        JButton b1 = new JButton("isi buku tamu");
        frame.add(b1, gbc);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
