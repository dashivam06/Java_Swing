
/*
    Action Listener 
     
     Used When User
        > clicks on a button
        > press enter in a textfield
        > choose a menuitem

     Implementation Techniques
        > ActionListener Interface
        > void actionPerformed()
        > addActionListener()
 */

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame implements ActionListener {

    JButton btn1;
    Container c;

    MyFrame() {

        c = this.getContentPane();
        c.setLayout(null);
        btn1 = new JButton("Chad Button");
        btn1.setSize(200, 40);
        btn1.setLocation(100, 300);
        c.add(btn1);
        btn1.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        btn1.setText("Certified Chad ");
    }

}

public class S14_01_ActionListener {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setTitle("Action Event ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 100, 400, 400);
        frame.setVisible(true);
    }

}
