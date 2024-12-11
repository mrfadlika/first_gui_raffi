import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

public class SaranKritikForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SARAN DAN KRITIK");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(new BorderLayout());
        JLabel label = new JLabel("SARAN DAN KRITIK");
        JTextArea textArea = new JTextArea(10, 30);
        JButton sendButton = new JButton("KIRIM");
        
        panel.add(label, BorderLayout.NORTH);
        panel.add(textArea, BorderLayout.CENTER);
        panel.add(sendButton, BorderLayout.SOUTH);
        
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
