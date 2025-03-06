import javax.swing.*;
import java.awt.*;

public class Home {
    private JPanel panel;
    private JButton loginButton;
    private JButton createNewAccountButton;
    private JTextField username;
    private JPasswordField password;
    private JComboBox<String> role;

    public Home()
    {
        JFrame frame = new JFrame();
        frame.setContentPane(panel);
        frame.setBackground(Color.CYAN);
        frame.setTitle("HomePage");
        frame.setSize(600, 450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

        role.addItem("Customer");
        role.addItem("Admin");

        loginButton.addActionListener(e -> {
            int r = role.getSelectedIndex();

            if (r == 0)
            {
                try {
                    String usernameText = username.getText();
                    String passwordText = String.valueOf(password.getPassword());
                    if (usernameText.equals("sushant_shrestha1") && passwordText.equals("$t0r3/19")) {
                        LandingPage.main(new String[]{});
                        frame.setVisible(false);
                    } else if (usernameText.equals("rahulwasti") && passwordText.equals("9818220764")) {
                        LandingPage.main(new String[]{});
                        frame.setVisible(false);
                    } else if (usernameText.equals("adnan6220") && passwordText.equals("9809164623")) {
                        LandingPage.main(new String[]{});
                        frame.setVisible(false);
                    } else if (usernameText.equals("aabesh") && passwordText.equals("9817956071")) {
                        LandingPage.main(new String[]{});
                        frame.setVisible(false);
                    } else if (usernameText.equals("sisam") && passwordText.equals("insane@9810")) {
                        LandingPage.main(new String[]{});
                        frame.setVisible(false);
                    } else if (usernameText.equals("sangita") && passwordText.equals("sangita123")) {
                        LandingPage.main(new String[]{});
                        frame.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong username or password!");
                    }
                }
                catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }

            else
            {
                String usernameText = username.getText();
                String passwordText = String.valueOf(password.getPassword());
                try {
                    if (usernameText.equals("admin") && passwordText.equals("admin")) {
                        Stock.main(new String[]{});
                        frame.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Wrong username or password!");
                    }
                }
                catch (Exception ex) {
                    throw new RuntimeException(ex);
                }

            }
        });

        createNewAccountButton.addActionListener(e -> {
            CreateNewAccount.main(new String[]{});
            frame.setVisible(false);
        });
    }

    public static void main(String[] args) {
        new Home();
    }
}
