import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

class itemAndQuantity5
{
    int itemPrice, intQuantity, total;
    double dis;
    String discount, quantity;

    public int getItemPrice ()
    {
        if (itemPrice == 0)
        {
            ImageIcon icon = new ImageIcon("src/shopping-bag.png");
            JOptionPane.showMessageDialog(null, "Please select the item.", "Error", 1, icon);
        }
        else if (itemPrice == 1)
        {
            itemPrice = 120;
        }
        else if (itemPrice == 2)
        {
            itemPrice = 220;
        }
        else if (itemPrice == 3)
        {
            itemPrice = 110;
        }
        else if (itemPrice == 4)
        {
            itemPrice = 30;
        }
        else if (itemPrice == 5)
        {
            itemPrice = 120;
        }
        else if (itemPrice == 6)
        {
            itemPrice = 1300;
        }
        else if (itemPrice == 7)
        {
            itemPrice = 270;
        }

        return itemPrice;
    }

    public int getQuantity ()
    {

        if (Objects.equals(quantity, ""))
        {
            ImageIcon quantity_img = new ImageIcon("src/boxes.png");
            JOptionPane.showMessageDialog(null, "Please enter the quantity.", "Error", 1, quantity_img);
        }
        else
        {
            intQuantity = Integer.parseInt(quantity);
        }
        return intQuantity;
    }

    public int totalPriceCalculate ()
    {
        total = getItemPrice() * getQuantity();
        return total;
    }

    public double getDiscount()
    {
        if (Objects.equals(discount, "DISCOUNT10"))
        {
            dis = (0.9) * totalPriceCalculate();
        }
        return dis;
    }
}

public class Drinks extends JFrame{
    private JPanel panel;
    private JComboBox<String> comboBox1;
    private JTextField quantityField;
    private JLabel message;
    private JButton addToCartButton;
    private JButton clearButton;
    private JButton calculatePriceButton;
    private JButton backButton;
    private JMenuBar MenuBar;
    private JMenu Items;
    private JMenuItem shopItem1;
    private JMenuItem shopItem6;
    private JMenuItem shopItem2;
    private JMenuItem shopItem3;
    private JMenuItem shopItem4;
    private JMenuItem shopItem5;
    private JMenuItem viewCart;
    private JMenuItem exit;
    private JMenuItem help;
    private JMenuItem home;
    private JLabel disMsg;
    private JTextField couponCode;

    public Drinks() {
        JFrame frame = new JFrame();
        frame.setContentPane(panel);
        frame.setBackground(Color.CYAN);
        frame.setTitle("Drinks");
        frame.setSize(750, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
//        frame.pack();

        comboBox1.addItem(null);
        comboBox1.addItem("Coca Cola (Rs. 120/ltr)");
        comboBox1.addItem("Sprite (Rs. 220/ltr)");
        comboBox1.addItem("Red Bull (Rs. 110/ltr)");
        comboBox1.addItem("Mineral Water (Rs. 30/ltr)");
        comboBox1.addItem("Juice Can (Rs. 120/ltr)");
        comboBox1.addItem("Royal Stag (Rs. 1300/ltr)");
        comboBox1.addItem("Real Mango Juice (Rs. 270/ltr)");

        calculatePriceButton.addActionListener(e -> {

            itemAndQuantity5 iaq = new itemAndQuantity5();
            iaq.itemPrice = comboBox1.getSelectedIndex();
            iaq.quantity = quantityField.getText();
            iaq.discount = couponCode.getText();

            if (Objects.equals(couponCode.getText(), ""))
            {
                disMsg.setText("");
                message.setText("Your total price is Rs. " + iaq.totalPriceCalculate());
            }
            else if (Objects.equals(couponCode.getText(), "DISCOUNT10"))
            {
                message.setText("Your total price is Rs. " + iaq.totalPriceCalculate());
                disMsg.setText("After discount: Total Price is Rs. " + iaq.getDiscount());
            }
            else
            {
                ImageIcon coupon_img = new ImageIcon("src/coupons.png");
                couponCode.setText("");
                JOptionPane.showMessageDialog(null, "Invalid coupon code.", "Error", 1, coupon_img);
            }
        });

        clearButton.addActionListener(e -> {
            comboBox1.setSelectedIndex(0);
            quantityField.setText("");
            couponCode.setText("");
            message.setText("");
            disMsg.setText("");
        });

        addToCartButton.addActionListener((e -> {
            if (comboBox1.getSelectedIndex() == 0) {
                ImageIcon item_img = new ImageIcon("src/shopping-bag.png");
                JOptionPane.showMessageDialog(null, "Please select the item.", "Error", 1, item_img);
            } else if (Objects.equals(quantityField.getText(), "")) {
                ImageIcon quantity_img = new ImageIcon("src/boxes.png");
                JOptionPane.showMessageDialog(null, "Please enter the quantity.", "Error", 1, quantity_img);
            } else {
                message.setText("Added To Cart!");
            }

        }));

        viewCart.addActionListener(e -> {
            Cart.main(new String[]{});
            frame.setVisible(false);
        });

        exit.addActionListener(e -> {
            ImageIcon exit_img = new ImageIcon("src/exit.png");
            int result = JOptionPane.showConfirmDialog(null,"Are you sure want to exit?",
                    "Exit?", 1, 1, exit_img);
            if (result == JOptionPane.YES_NO_OPTION) {
                System.exit(0);
            }
        });

        home.addActionListener(e -> {
            LandingPage.main(new String[]{});
            frame.setVisible(false);
        });

        help.addActionListener(e -> {
            ImageIcon home_img = new ImageIcon("src/home.png");

            JOptionPane.showMessageDialog(null,"You can go to the home window by clicking on this icon.",
                    "Help", JOptionPane.INFORMATION_MESSAGE, home_img);

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

        shopItem6.addActionListener(e -> {
            RiceCerealsAndPulse.main(new String[]{});
            frame.setVisible(false);
        });

        backButton.addActionListener(e -> {
            Bakery.main(new String[]{});
            frame.setVisible(false);
        });

    }



    public static void main(String[] args)
    {
        Drinks store = new Drinks ();
    }
}
