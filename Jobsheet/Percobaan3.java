import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class WisataJogjakarta {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("WISATA JOGJAKARTA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("WISATA JOGJAKARTA", SwingConstants.CENTER);
        frame.add(titleLabel, BorderLayout.NORTH);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(1, 2));

        JPanel kulinerPanel = new JPanel();
        kulinerPanel.setLayout(new GridLayout(4, 1));
        kulinerPanel.setBorder(BorderFactory.createTitledBorder("wisata kuliner"));

        JRadioButton soto = new JRadioButton("soto", true);
        JRadioButton bakso = new JRadioButton("bakso");
        JRadioButton rujak = new JRadioButton("rujak");

        ButtonGroup group = new ButtonGroup();
        group.add(soto);
        group.add(bakso);
        group.add(rujak);

        kulinerPanel.add(soto);
        kulinerPanel.add(bakso);
        kulinerPanel.add(rujak);

        mainPanel.add(kulinerPanel);

        JPanel alamPanel = new JPanel();
        alamPanel.setLayout(new GridLayout(4, 1));
        alamPanel.setBorder(BorderFactory.createTitledBorder("wisata alam"));

        JCheckBox merapi = new JCheckBox("gunung merapi");
        JCheckBox kaliurang = new JCheckBox("kaliurang");
        JCheckBox parangtritis = new JCheckBox("parangtritis");

        alamPanel.add(merapi);
        alamPanel.add(kaliurang);
        alamPanel.add(parangtritis);

        mainPanel.add(alamPanel);

        frame.add(mainPanel, BorderLayout.CENTER);

        frame.pack();
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
