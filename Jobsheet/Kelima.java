import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MENU MASAKAN");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("MENU MASAKAN", SwingConstants.CENTER);
        label.setFont(new Font("Serif", Font.BOLD, 24));

        panel.add(label);
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
