import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RadioButton");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JRadioButton radioButton1 = new JRadioButton("lagu barat");
        JRadioButton radioButton2 = new JRadioButton("lagu keroncong");
        JRadioButton radioButton3 = new JRadioButton("lagu amerika");

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
