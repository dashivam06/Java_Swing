
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JButton;

public class S06_04_ActionListener {

    public static Container c;
     public static void main(String[] args) {
            JFrame frame = new JFrame();
            frame.setTitle("Event Listener");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // Note : SetBounds Replaces SetLocation And SetSize Methods
            frame.setSize(900, 600);
            frame.setLocation(100,100);
            frame.setVisible(true);
            frame.setLayout(null);

            c = frame.getContentPane();

            JButton btn1 = new JButton("Click me For Red  !!"); 
            btn1.setBounds(100,100, 200, 40);
            JButton btn2 = new JButton("Click me For Yellow !!"); 
            btn2.setBounds(300,100, 200, 40);
            JButton btn3 = new JButton("Click me For Green !!"); 
            btn3.setBounds(500,100, 200, 40);
            
            c.add(btn1);
            c.add(btn2);
            c.add(btn3);
            btn1.addActionListener(new RedScreen());
            btn2.addActionListener(new YellowScreen());
            btn3.addActionListener(new GreenScreen());

}

}
class RedScreen implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        S06_04_ActionListener.c.setBackground(Color.RED);
    }
}

class YellowScreen implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        S06_04_ActionListener.c.setBackground(Color.YELLOW);
    }
}

class GreenScreen implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        S06_04_ActionListener.c.setBackground(Color.GREEN);
    }
}