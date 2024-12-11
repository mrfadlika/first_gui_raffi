import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class DropdownExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dropdown");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(new BorderLayout());
        
        JLabel label = new JLabel("Pilih salah satu:");
        String[] options = { "pilihan 1", "pilihan 2", "pilihan 3" };
        JComboBox<String> dropdown = new JComboBox<>(options);
        
        panel.add(label, BorderLayout.NORTH);
        panel.add(dropdown, BorderLayout.CENTER);
        
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
