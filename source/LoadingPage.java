import javax.swing.*;
import java.awt.*;

public class LoadingPage {
    private JPanel panel1;
    private JProgressBar progressBar1; 

    public LoadingPage()
    {
        assert progressBar1 != null;
        progressBar1.setValue(0);
        progressBar1.setStringPainted(true);

        JFrame frame = new JFrame();
        frame.setContentPane(panel1);
        frame.setTitle("Loading...");
        frame.setBackground(Color.CYAN);
        frame.setSize(650, 450);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

            int counter = 0;
            while (counter <= 100)
            {
                progressBar1.setValue(counter);
                try
                {
                    Thread.sleep(50);
                }

                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                counter += 1;
                if (counter == 100)
                {
                    Home.main(new String[]{});
                    frame.setVisible(false);
                }
            }
    }

    public static void main(String[] args) {
        LoadingPage lp = new LoadingPage();
    }
}
