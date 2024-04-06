/*
    BorderLayout: Think of your container as a compass: North, South, East, West, and Center. 
    You can only place one component in each direction. The "Center" component fills the remaining 
    space in the middle, while the other components stick to their respective sides.

    Note : If Nothing is placed to the right and left the center occupies all the space remaining

*/

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;

class MyFrame extends JFrame  

{
    Container c;
    JButton btn1, btn2,btn3,btn4,btn5;

    MyFrame()

    {
        setTitle("Border Layout ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocation(300, 100);

        BorderLayout borderLayout = new BorderLayout();
        
        // BorderLayout borderLayout = new BorderLayout(10,2);     
        //  Setting Border Layout With Horizantal & Vertical Spacing

        borderLayout.setHgap(10);        // Horizontal Gapping
        borderLayout.setVgap(5);        //  Vertical Gapping

        c = getContentPane();
        c.setLayout(borderLayout);

        btn1 = new JButton("North");
        btn2 = new JButton("Right_Side");
        btn3 = new JButton("Center");
        btn4 = new JButton("Left_Side");
        btn5 = new JButton("Botton");

        c.add(btn1,borderLayout.PAGE_START);
        c.add(btn2,borderLayout.LINE_START);
        c.add(btn3,borderLayout.CENTER);
        c.add(btn4,borderLayout.LINE_END);
        c.add(btn5,borderLayout.PAGE_END);

        setVisible(true);
    }

}


public class S24_01_BorderLayout 
{

    public static void main(String[] args) 
    {

        MyFrame frame = new MyFrame();

    }
}
