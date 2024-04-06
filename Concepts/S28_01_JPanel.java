/*
  A Panel is a lightweight container that can hold and organize other Swing components,
  such as buttons, labels, text fields, and more. It's a way to group related components together within a user interface.
 */

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class S28_01_JPanel 
{
    public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setBounds(200,100,800,500); 
    frame.setTitle("JPanel Example"); 
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); 
    frame.setLayout(null);

    Container c = frame.getContentPane();
    c.setBackground(Color.LIGHT_GRAY);

    //Panel 1 
    // First Panel Will OverLap 

    JPanel panel1 = new JPanel();
    panel1.setBounds(0, 0, 600, 400);
    panel1.setBackground(Color.BLACK);
    c.add(panel1);
    panel1.setLayout(null);  // To Not OverLap the Other Panel After This Set Bound To Other Panel


    //Panel 2  

    JPanel panel2 = new JPanel();
    panel2.setBounds(0, 0, 300, 300);
    panel2.setBackground(Color.RED);
    panel2.setLayout(null);
    panel1.add(panel2);


    JButton btn1 = new JButton("Button");
    btn1.setBounds(40, 150, 200, 40);
    c.add(btn1);
    panel2.add(btn1);


    frame.setVisible(true);

    }


}
