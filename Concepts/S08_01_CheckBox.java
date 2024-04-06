import java.awt.Container;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class S08_01_CheckBox {

    public static void main(String[] args) {
        
            JFrame frame = new JFrame();
            frame.setTitle("Event Listener");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setBounds(100, 100, 600, 500);


        Container c = frame.getContentPane();
        c.setLayout(null);

        JCheckBox c1 = new JCheckBox("Java");
        c1.setBounds(50, 100, 100, 100);
        JCheckBox c2 = new JCheckBox("Python");
        c2.setBounds(200, 100, 100, 100);
        JCheckBox c3 = new JCheckBox("C#");
        c3.setBounds(350, 100, 100, 100);
        JCheckBox c4 = new JCheckBox("C++");
        c4.setBounds(450, 100, 100, 100);


        // Adding To the container
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);

        c1.setSelected(true);
        c1.setEnabled(false);

        frame.setVisible(true);

        }
}
