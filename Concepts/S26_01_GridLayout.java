/*

 1 . Just Like Flow Layout,
        Grid Layout also sets the components left to right in a flow.
 2 . In grid Layout all the available space is consumed by the components.
 3 . Grid Layout can be divided into the form of rows and columns.
 4 . In Grid Layout the all the components have the same size.
 
    GridLayout: Components are arranged in a grid of rows and columns, 
    with each cell in the grid containing exactly one component. 
    GridLayout is useful when you want to arrange components in a uniform grid.

 * 
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
 
         GridBagLayout gridBagLayout = new GridBagLayout();

         GridBagConstraints gbc = new GridBagConstraints();  // Used For Positioning Elements Like Index values
         
         c = getContentPane();
         c.setLayout(gridBagLayout);
 
 
         b1= new JButton("Button 1");
         b2= new JButton("Button 2");
         b3= new JButton("Button 3");
         b4= new JButton("Extended -- Button 4");
         b5= new JButton("Button 5");

         gbc.fill = GridBagConstraints.HORIZONTAL;
        //  gbc.fill = GridBagConstraints.VERTICAL;
         gbc.weightx=0.5;  //Request For Extra
         gbc.gridx = 0;
         gbc.gridy = 0;
         c.add(b1,gbc);

         gbc.gridx = 1;
         gbc.gridy = 0;
         c.add(b2,gbc);

        //  gbc.weightx=0;  // Reset Value 0;
         gbc.gridx = 2;
         gbc.gridy = 0;
         c.add(b3,gbc);

         gbc.gridwidth  = 3; // Accuire Three columns 
         gbc.gridx = 0;
         gbc.gridy = 1;
         gbc.ipady = 40 ; // Just Like padding
         c.add(b4,gbc);

         gbc.gridwidth  = 2; // Accuire Two columns & gridheigth for rows
         gbc.gridx = 1;
         gbc.gridy = 2;
         gbc.ipady = 0 ;  //  Sets the Default size of horional Padding 
         gbc.anchor = GridBagConstraints.PAGE_END;  // Set anchor to bottom for Button 5
         gbc.weighty= 1;
         c.add(b5,gbc);
 
 
         pack();
         setVisible(true);
 
     }
  }
 public class S26_01_GridLayout 
 {
     public static void main(String[] args) {
         MyFrame frame = new MyFrame();
     }
 
 
 
 
 }
 