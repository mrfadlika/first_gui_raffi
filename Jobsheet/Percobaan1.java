import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class BukuTamu {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BUKU TAMU");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        JLabel label1 = new JLabel("BUKU TAMU", JLabel.CENTER);
        JLabel label2 = new JLabel("PENDIDIKAN TUNAS BANGSA", JLabel.CENTER);

        panel.add(label1, BorderLayout.NORTH);
        panel.add(label2, BorderLayout.CENTER);

        frame.add(panel);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
