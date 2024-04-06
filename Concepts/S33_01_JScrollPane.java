import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


// With Flow Layout


public class S33_01_JScrollPane {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(350, 100, 800, 500);
        frame.setTitle("JPanel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = frame.getContentPane();
        c.setLayout(null); // Set null layout

        JTextArea txt = new JTextArea(10, 20);
        txt.setBackground(Color.GRAY);
        txt.setBounds(10, 10, 760, 440); // Manually set bounds for the text area

        JScrollPane sp = new JScrollPane(txt, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        sp.setBounds(220, 160, 360, 200); // Manually set bounds for the scroll pane
        c.add(sp);

        frame.setVisible(true);
    }
}


/*

// With Null Layout

public class S33_01_JScrollPane 
{

    public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setBounds(350,100,800,500); 
    frame.setTitle("JPanel Example"); 
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); 

    Container c = frame.getContentPane();
    c.setLayout(new FlowLayout());
    // c.setBackground(Color.LIGHT_GRAY);

    JTextArea txt = new JTextArea(10,20);
    // txt.setBounds(220, 160, 360, 200);
    txt.setBackground(Color.GRAY);
    

    JScrollPane sp = new JScrollPane(txt, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    c.add(sp);


    frame.setVisible(true);

        }
    }
     */