import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class LogIn extends JFrame {
    private JPanel contentPane;
    private JTextField textFieldUsername;
    private JPasswordField passwordField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LogIn frame = new LogIn();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public LogIn() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 960, 540);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setBounds(536, 210, 100, 14);
        contentPane.add(lblUsername);

        textFieldUsername = new JTextField();
        textFieldUsername.setBounds(651, 207, 150, 20);
        contentPane.add(textFieldUsername);
        textFieldUsername.setColumns(10);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(536, 250, 100, 14);
        contentPane.add(lblPassword);

        passwordField = new JPasswordField();
        passwordField.setBounds(651, 247, 150, 20);
        contentPane.add(passwordField);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(587, 290, 100, 30);
        contentPane.add(btnLogin);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon(LogIn.class.getResource("/image/Healthy Sleeping Schedule and Routine.png")));
        lblNewLabel.setBounds(0, 0, 944, 501);
        contentPane.add(lblNewLabel);

        // Action listener for the login button
        btnLogin.addActionListener(e -> {
            String username = textFieldUsername.getText();
            String password = new String(passwordField.getPassword());

            if (username.equals("CHARLES ESTRELLON") && password.equals("123456789")) {
                JOptionPane.showMessageDialog(null, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(null, "Login failed. Please check your credentials.");
            }

            // Clear fields
            textFieldUsername.setText("");
            passwordField.setText("");
        });
    }
}
