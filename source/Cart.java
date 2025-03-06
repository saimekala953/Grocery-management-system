import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
public class Cart extends JFrame{

    private JPanel panel;
    private JButton purchaseButton;
    private JButton clearButton;
    private JButton calculateTotalButton;
    private JButton backButton;
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
    private JLabel message;

    public Cart()
    {
        JFrame frame = new JFrame();
        frame.setContentPane(panel);
        frame.setBackground(Color.CYAN);
        frame.setTitle("My Cart");
        frame.setSize(550, 450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
//        frame.pack();

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Item Names");
        model.addColumn("Quantity");
        model.addColumn("Item Price");
        model.addColumn("Discount");
        model.addColumn("Total Price");

        model.addRow(new Object[]{"Apple", "3", "350", "10%", "945"});
        model.addRow(new Object[]{"Onion", "2", "180", "0%", "360"});
        model.addRow(new Object[]{"Cow Milk", "5", "100", "10%", "450"});
        model.addRow(new Object[]{"CAKE", "1", "600", "10%", "540"});
        model.addRow(new Object[]{"Coca Cola", "2", "120", "0%", "240"});
        model.addRow(new Object[]{"Basmati Rice", "25", "115", "10%", "2587.5"});
        model.addRow(new Object[]{"Grand Total", "", "", "", "5122.5"});

        JTable table = new JTable(model);
        table.setBounds(0, 0, 600, 200);
        frame.add(table);

        JScrollPane sp = new JScrollPane(table);
        frame.add(sp);
        frame.setVisible(true);

        purchaseButton.addActionListener(e -> {
            String[] payment = {"Esewa", "Khalti", "Mobile Banking"};
            ImageIcon i = new ImageIcon("src/cashless-payment.png");
           int selection = JOptionPane.showOptionDialog(null,
                   "Select payment option.", "Payment",
                   0, 3, i, payment, payment[2]);

           if (selection == 0)
           {
               ImageIcon icon = new ImageIcon("src/QR.jpg");
               JOptionPane.showMessageDialog(null,"Scan to pay.",
                       "QR Code", JOptionPane.INFORMATION_MESSAGE, icon);

           }

            else if (selection == 1)
            {
                ImageIcon icon = new ImageIcon("src/QR.jpg");
                JOptionPane.showMessageDialog(null,"Scan to pay.",
                        "QR Code", JOptionPane.INFORMATION_MESSAGE, icon);
            }

            else if (selection == 2)
            {
                ImageIcon icon = new ImageIcon("src/QR.jpg");
                JOptionPane.showMessageDialog(null,"Scan to pay.",
                        "QR Code", JOptionPane.INFORMATION_MESSAGE, icon);
            }

            JOptionPane.showMessageDialog(null, "Purchased Successfully!");
            model.setRowCount(0);
        });

        clearButton.addActionListener(e -> model.setRowCount(0));

        backButton.addActionListener(e -> {
            RiceCerealsAndPulse.main(new String[]{});
            frame.setVisible(false);
        });

        exit.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(null,"Are you sure want to exit?");
            if (result == JOptionPane.YES_NO_OPTION)
            {
                System.exit(0);
            }
        });

        home.addActionListener(e -> {
            LandingPage.main(new String[]{});
            frame.setVisible(false);
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

    }

    public static void main(String[] args) {
        Cart cart = new Cart();
    }
}