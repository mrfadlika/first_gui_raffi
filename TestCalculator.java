import javax.swing.*;
import java.awt.*;

public class TestCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JPanel displayPanel = new JPanel(new BorderLayout());
        JTextField display = new JTextField("0.0", 10);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        displayPanel.add(display, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));

        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.BOLD, 14));
            buttonPanel.add(button);
        }

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(displayPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
