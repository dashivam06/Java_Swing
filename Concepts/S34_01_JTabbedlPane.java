import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;


// With Flow Layout


public class S34_01_JTabbedlPane {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(350, 100, 800, 500);
        frame.setTitle("JTabbed Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = frame.getContentPane();
        c.setLayout(null); // Set null layout

        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(150, 150, 250, 250);
        c.add(tp);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        panel1.add(new JLabel("This Is The First JLabel And JFrame "));
        panel2.add(new JLabel("This Is The Second JLabel And JFrame "));
        panel3.add(new JLabel("This Is The Third JLabel And JFrame "));


        tp.add("First",panel1);
        tp.add("Second",panel2);
        tp.add("Third",panel3);



        frame.setVisible(true);


    }
}