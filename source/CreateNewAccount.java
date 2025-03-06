import javax.swing.*;
import java.awt.*;

public class CreateNewAccount extends JFrame {
    private JTextField fName;
    private JTextField LName;
    private JTextField phone;
    private JTextField email;
    private JButton registerButton;
    private JPasswordField pass;
    private JPanel registerPanel;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JRadioButton otherRadioButton;
    private JButton backButton;

    public CreateNewAccount()
    {
        JFrame frame = new JFrame();
        frame.setContentPane(registerPanel);
        frame.setTitle("Create new account!");
        frame.setBackground(Color.CYAN);
        frame.setSize(650, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

        ButtonGroup btn = new ButtonGroup();
        btn.add(maleRadioButton);
        btn.add(femaleRadioButton);
        btn.add(otherRadioButton);

        registerButton.addActionListener(e -> {
            String pass1 = String.valueOf(pass.getPassword());
           if (fName.getText().length() == 0){
               JOptionPane.showMessageDialog(fName,"Please enter your first name");
           }
           else if (LName.getText().length() == 0)
           {
               JOptionPane.showMessageDialog(LName, "Please enter your last name");
           }
           else if (phone.getText().length() == 0)
           {
               JOptionPane.showMessageDialog(phone, "Please enter your phone number.");
           }
           else if (email.getText().length() == 0)
           {
               JOptionPane.showMessageDialog(email, "Please enter your email address.");
           }
           else if (pass1.equals(""))
           {
               JOptionPane.showMessageDialog(pass, "Please enter your password.");
           }
           else
           {
              Fruits.main(new String[]{});
              frame.setVisible(false);
           }
        });

        backButton.addActionListener(e -> {
            Home.main(new String[]{});
            frame.setVisible(false);
        });
    }
    public static void main(String[] args) {
        CreateNewAccount form = new CreateNewAccount();
    }
}


