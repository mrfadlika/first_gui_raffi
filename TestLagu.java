import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestLagu {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Test");
        JLabel label1 = new JLabel("LAGU LAGU INDONESIA");
        JCheckBox checkbox1 = new JCheckBox("cinta gila oleh ungu");
        JCheckBox checkbox2 = new JCheckBox("saat terakhir oleh ST12");
        JCheckBox checkbox3 = new JCheckBox("lupa-lupa ingat oleh kuburan");
        JCheckBox checkbox4 = new JCheckBox("laskar pelangi oleh niji");
        
        Box box = new Box(BoxLayout.Y_AXIS);
        box.add(label1);
        box.add(checkbox1);
        box.add(checkbox2);
        box.add(checkbox3);
        box.add(checkbox4);
        
        frame.add(box);
        frame.pack();
        frame.setSize(400, 500);
        frame.setVisible(true);
    }
}