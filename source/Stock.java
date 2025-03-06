import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class Stock extends JFrame {
    private JPanel panel;
    private JButton clearButton;
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
    private JMenuItem home1;
    private JLabel message;
    private JButton addButton;

    public Stock(){
        JFrame frame = new JFrame();
        frame.setContentPane(panel);
        frame.setBackground(Color.CYAN);
        frame.setTitle("Available Items");
        frame.setSize(530, 680);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);


        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Item Names");
        model.addColumn("Quantity");
        model.addColumn("Item Price");
        model.addColumn("Total Price");

        model.addRow(new Object[]{"Apple", "200 KG", "350", "70000"});
        model.addRow(new Object[]{"Grapes", "180 KG", "250","45000"});
        model.addRow(new Object[]{"Himalayan Kiwi", "250 KG", "400","100000"});
        model.addRow(new Object[]{"Pomegranate", "220 KG", "420","92400"});
        model.addRow(new Object[]{"Dragon Fruit", "260 KG", "550","143000"});
        model.addRow(new Object[]{"Avocado", "300 KG", "580","174000"});
        model.addRow(new Object[]{"Watermelon", "90 KG", "180","16200"});


        model.addRow(new Object[]{"Cake", "200 KG", "600", "120000"});
        model.addRow(new Object[]{"Cookies And Cream", "180 pcs", "85","15300"});
        model.addRow(new Object[]{"Bread", "100 pkt", "55","5500"});
        model.addRow(new Object[]{"Cup Cake", "80 pcs", "25","2000"});
        model.addRow(new Object[]{"Cookies", "200 pkt", "100","20000"});
        model.addRow(new Object[]{"Doughnuts", "50 pcs", "25","1250"});
        model.addRow(new Object[]{"Apple Pie", "60 pcs", "80","4800"});

        model.addRow(new Object[]{"Buffalo Milk", "200 lit", "90", "18000"});
        model.addRow(new Object[]{"Cow Milk", "500 lit", "100","50000"});
        model.addRow(new Object[]{"Paneer", "1200 KG", "600","720000"});
        model.addRow(new Object[]{"Yogurt", "450 lit", "180","81000"});
        model.addRow(new Object[]{"Cheese Spread Cream", "500 KG", "1150","575000"});
        model.addRow(new Object[]{"Cheese Slices", "400 KG", "1350","540000"});
        model.addRow(new Object[]{"Butter", "800 KG", "540","432000"});


        model.addRow(new Object[]{"Coca Cola", "100 ltr", "120", "12000"});
        model.addRow(new Object[]{"Sprite", "120 ltr", "220","26400"});
        model.addRow(new Object[]{"Red Bull", "130 ltr", "110","14300"});
        model.addRow(new Object[]{"Mineral Water", "100 ltr", "30","3000"});
        model.addRow(new Object[]{"Juice Can", "160 ltr", "120","19200"});
        model.addRow(new Object[]{"Royal Stag", "300 ltr", "1300","390000"});
        model.addRow(new Object[]{"Real Mango Juice", "125 ltr", "270","33750"});


        model.addRow(new Object[]{"Normal Rice", "500 KG", "90", "45000"});
        model.addRow(new Object[]{"Basmati Rice", "180 KG", "115","20700"});
        model.addRow(new Object[]{"Long Grain Rice", "210 KG", "170","35700"});
        model.addRow(new Object[]{"Black Lentils", "200 KG", "180","360000"});
        model.addRow(new Object[]{"Yellow Lentils", "260 KG", "170","44200"});
        model.addRow(new Object[]{"Red Kidney Beans", "300 KG", "220","66000"});
        model.addRow(new Object[]{"Chick Peas", "90 KG", "110","9900"});


        model.addRow(new Object[]{"Potato", "100 KG", "60", "6000"});
        model.addRow(new Object[]{"Carrot", "120 KG", "80","9600"});
        model.addRow(new Object[]{"Spinach", "170 KG", "95","16150"});
        model.addRow(new Object[]{"Sponge Gourd", "190 KG", "140","26600"});
        model.addRow(new Object[]{"Onion", "230 KG", "180","41400"});
        model.addRow(new Object[]{"Cabbage", "140 KG", "55","7700"});
        model.addRow(new Object[]{"Fresh Beans", "90 KG", "110","9900"});

        JTable table = new JTable(model);
        table.setBounds(0, 0, 700, 200);
        table.setBackground(new Color(191, 227, 180));
        frame.add(table);

        JScrollPane sp = new JScrollPane(table);
        frame.getContentPane().add(sp, BorderLayout.CENTER);
        frame.add(sp);
        frame.setVisible(true);

        clearButton.addActionListener(e -> model.removeRow(table.getSelectedRow()));

        backButton.addActionListener(e -> {
            Home.main(new String[]{});
            frame.setVisible(false);
        });

        exit.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(null,"Are you sure want to exit?");
            if (result == JOptionPane.YES_NO_OPTION)
            {
                System.exit(0);
            }
        });

        home1.addActionListener(e -> {
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

        addButton.addActionListener(e -> {
            model.addRow(new Object[]{});
        });
    }

    public static void main(String[] args) {
            Stock stock = new Stock();
    }
}
