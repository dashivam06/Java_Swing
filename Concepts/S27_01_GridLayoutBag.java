/*
  Similar to GridLayout, but provides more flexibility and control over the
  placement and sizing of components. It allows you to specify constraints for
  each component to control its position, size, and alignment within the
  layout.
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
 
         GridLayout gridLayout = new GridLayout(3,2,10,20);  
         //new GridLayout() = new GridLayout(rows,columns,hgap,vgap)
         /* 
         GridLayout gridLayout = new GridLayout(GridLayout.RIGHT,30,20);
         gridLayout.setHgap(20);
         gridLayout.setVgap(20);
         */
         
         c=getContentPane();
         c.setLayout(gridLayout);
 
 
         b1= new JButton("Button 1");
         b2= new JButton("Extended -- Button 2");
         b3= new JButton("Button 3");
         b4= new JButton("Button 4");
         b5= new JButton("Button 5");


         c.add(b1);
         c.add(b2,1);
         c.add(b3);
         c.add(b4,3);
         c.add(b5,0);
         setVisible(true);
 

     }

    }
     public class S27_01_GridLayoutBag 
     {
         public static void main(String[] args) {
             MyFrame frame = new MyFrame();
         }
     
     
    }
