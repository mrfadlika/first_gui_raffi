import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class ListBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("list box");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        JLabel label = new JLabel("pilih salah satu:");
        String[] options = { "Malang", "Surabaya", "Bandung", "Bogor" };
        JList<String> list = new JList<>(options);

        panel.add(label, BorderLayout.NORTH);
        panel.add(list, BorderLayout.CENTER);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
