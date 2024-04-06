/*
    Imagine placing components in a row, like words on a line. 
    If the row fills up, it moves to the next line. This is how FlowLayout works. 
    Components are arranged left to right until the row is full, then they continue on the next line.

 * Flow Layout is the Default Layout for JPanel
 * It Sets the Component as it preferred size in java
 * It also set the width of the component acc. to its content 
 * If width of JFrame is less then it shifts the extra components to the next row
 * If width of JFrame of JFrame is more then it aligns the components to the CENTER
 */

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.*;

class MyFrame extends JFrame{

    private JButton b1,b2,b3,b4,b5;
    private Container c ;

    MyFrame(){
        setTitle("Form Layout ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocation(500, 250);

        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT);
        /* 
        FlowLayout flowLayout = new FlowLayout(FlowLayout.RIGHT,30,20);
        flowLayout.setHgap(20);
        flowLayout.setVgap(20);
        */
        
        c=getContentPane();
        c.setLayout(flowLayout);


        b1= new JButton("Button 1");
        b2= new JButton("Extended -- Button 2");
        b3= new JButton("Button 3");
        b4= new JButton("Button 4");
        b5= new JButton("Button 5");

        // c.add(b1, flowLayout);
        // c.add(b2, flowLayout);
        // c.add(b3, flowLayout);
        // c.add(b4, flowLayout);
        // c.add(b5, flowLayout);

        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4,0);
        c.add(b5,0);

        // Note : Only Zero Works and Used To Give Priority

        setVisible(true);

    }
 }
public class S25_01_FlowLayout 
{
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }




}
