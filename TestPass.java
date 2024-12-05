import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestPass {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JButton");
        frame.setLayout(new FlowLayout());
        
        JLabel lblPassword = new JLabel("Masukkan password anda:");
        
        JPasswordField passwordField = new JPasswordField(15);
        
        JButton btnShowPassword = new JButton("Lihat Password");
        
        btnShowPassword.addActionListener(new ActionListener() {
            boolean isShowing = false;
            
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isShowing) {
                    passwordField.setEchoChar('•');
                    btnShowPassword.setText("Lihat Password");
                } else {
                    passwordField.setEchoChar((char)0); 
                    btnShowPassword.setText("Sembunyikan Password");
                }
                isShowing = !isShowing;
            }
        });
        
        frame.add(lblPassword);
        frame.add(passwordField);
        frame.add(btnShowPassword);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}