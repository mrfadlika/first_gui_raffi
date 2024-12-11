import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Kedua {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contoh");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");
        panel.add(okButton);
        panel.add(cancelButton);
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
