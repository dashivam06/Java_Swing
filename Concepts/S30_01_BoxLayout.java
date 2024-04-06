/*
 
Imagine stacking components in a single column or row, like stacking books on a shelf. 
BoxLayout arranges components either vertically or horizontally, one after the other. 
Components can be stretched to fill available space or kept at their preferred size.

 */

import java.awt.*;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class S30_01_BoxLayout 
{

        public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setBounds(350,100,800,500); 
    frame.setTitle("JPanel Example"); 
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); 

    Container c = frame.getContentPane();
    c.setBackground(Color.LIGHT_GRAY);
    // BoxLayout boxLayout = new BoxLayout(c, BoxLayout.X_AXIS);
    BoxLayout boxLayout = new BoxLayout(c, BoxLayout.Y_AXIS);
    c.setLayout(boxLayout);


    // For Buttons 
    JButton btn1 =  new JButton("Button 1");
    JButton btn2 =  new JButton("Button 2");
    JButton btn3 =  new JButton("Button 3");
    JButton btn4 =  new JButton("Button 4");

    // For Right And Left Alignment
    btn1.setAlignmentX(Component.RIGHT_ALIGNMENT);
    btn2.setAlignmentX(Component.RIGHT_ALIGNMENT);
    btn3.setAlignmentX(Component.RIGHT_ALIGNMENT);
    btn4.setAlignmentX(Component.RIGHT_ALIGNMENT);

    // btn4.setAlignmentX(Component.LEFT_ALIGNMENT);
    // btn4.setAlignmentX(Component.CENTER_ALIGNMENT);

    //Add Spaces Between button

    c.add(btn1,"1");
    c.add(btn2,"2");
    c.add(Box.createRigidArea(new Dimension(20,80))); // Add Spaces
    c.add(btn3,"3");
    c.add(btn4,"4");


    frame.setVisible(true);

}

}
