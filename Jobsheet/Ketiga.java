import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ketiga {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Checkbox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JCheckBox checkBox1 = new JCheckBox("pilih aku", true);
        JCheckBox checkBox2 = new JCheckBox("pilih dia", true);
        JCheckBox checkBox3 = new JCheckBox("pilih kamu", false);

        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(checkBox3);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
