import javax.swing.*;
import java.awt.*;

public class LandingPage {
    private JPanel panel1;
    private JPanel panel;
    private JMenuBar MenuBar;
    private JMenu Items;
    private JMenuItem shopItem1;
    private JMenuItem shopItem2;
    private JMenuItem shopItem3;
    private JMenuItem shopItem4;
    private JMenuItem shopItem5;
    private JMenuItem shopItem6;
    private JMenuItem exit;
    private JMenuItem help;
    private JMenuItem home;
    private JMenuItem viewCart;
    private JButton fruitButton;
    private JButton vegetableButton;
    private JButton dairyProductsButton;
    private JButton riceCerealsAndPulseButton;
    private JButton drinksButton;
    private JButton bakeryProductsButton;

    public LandingPage()
    {
        JFrame frame = new JFrame();
        frame.setContentPane(panel);
        frame.setBackground(Color.CYAN);
        frame.setTitle("Purchase");
        frame.setSize(750, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

        viewCart.addActionListener(e -> {
            Cart.main(new String[]{});
            frame.setVisible(false);
        });

        exit.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(null,"Are you sure want to Log Out?");
            if (result == JOptionPane.YES_NO_OPTION)
            {
                Home.main(new String[]{});
                frame.setVisible(false);
            }
        });

        shopItem1.addActionListener(e -> {
            Fruits.main(new String[]{});
            frame.setVisible(false);
        });

        shopItem2.addActionListener(e -> {
            Vegetable.main(new String[]{});
            frame.setVisible(false);
        });

        shopItem3.addActionListener(e -> {
            DairyProducts.main(new String[]{});
            frame.setVisible(false);
        });

        shopItem4.addActionListener(e -> {
            Bakery.main(new String[]{});
            frame.setVisible(false);
        });

        shopItem5.addActionListener(e -> {
            Drinks.main(new String[]{});
            frame.setVisible(false);
        });

        shopItem6.addActionListener(e -> {
            RiceCerealsAndPulse.main(new String[]{});
            frame.setVisible(false);
        });


        fruitButton.addActionListener(e -> {
            Fruits.main(new String[]{});
            frame.setVisible(false);
        });

        dairyProductsButton.addActionListener(e -> {
            DairyProducts.main(new String[]{});
            frame.setVisible(false);
        });

        vegetableButton.addActionListener(e -> {
            Vegetable.main(new String[]{});
            frame.setVisible(false);
        });

        bakeryProductsButton.addActionListener(e -> {
            Bakery.main(new String[]{});
            frame.setVisible(false);
        });

        drinksButton.addActionListener(e -> {

            Drinks.main(new String[]{});
            frame.setVisible(false);
        });

        riceCerealsAndPulseButton.addActionListener(e -> {
            RiceCerealsAndPulse.main(new String[]{});
            frame.setVisible(false);
        });
    }

    public static void main(String[] args) {
        new LandingPage();
    }
}
