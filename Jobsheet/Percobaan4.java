import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.SwingConstants;

public class MaskapaiPenerbangan {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("MASKAPAI PENERBANGAN DI INDONESIA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel titleLabel = new JLabel("MASKAPAI PENERBANGAN DI INDONESIA", SwingConstants.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        frame.add(titleLabel, gbc);

        gbc.gridwidth = 1;
        gbc.gridy = 1;
        gbc.gridx = 0;
        frame.add(new JLabel("Nama maskapai penerbangan:"), gbc);
        gbc.gridx = 1;
        String[] maskapaiOptions = {"garuda indonesia", "merpati", "citilink"};
        JComboBox<String> maskapaiDropdown = new JComboBox<>(maskapaiOptions);
        frame.add(maskapaiDropdown, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        frame.add(new JLabel("Jam keberangkatan:"), gbc);
        gbc.gridx = 1;
        String[] jamOptions = {"jam 07.00", "jam 09.00", "jam 11.00"};
        JList<String> jamList = new JList<>(jamOptions);
        frame.add(new JScrollPane(jamList), gbc);

        frame.pack();
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
