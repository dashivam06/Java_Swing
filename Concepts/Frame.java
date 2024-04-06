
/*
   Java Swing is a set of GUI (Graphical User Interface) components for building desktop applications in Java.
   It is part of the Java Foundation Classes (JFC) and provides a rich set of features for creating and managing user interfaces. 
   Swing is platform-independent and is designed to work across different operating systems without modification.

 * Swing has been a popular choice for developing Java desktop applications for many years. 
 * However, in more recent times, JavaFX has gained attention as an alternative to Swing for 
 * building modern, rich-client applications with improved graphics and multimedia capabilities.
 */

import java.awt.Container; //Container
import javax.swing.ImageIcon;  // ImageIcon
import javax.swing.JFrame;   // JFrame 
 
public class Frame {

    public static void main(String[] args) {
        
        //JFrame = a GUI Window to add components to , Plane Windows With Menu And Options Bar 

        JFrame frame = new JFrame(); //Creates A Frame
        frame.setTitle("JFrame Title Goes Here !!"); //Sets Title To Frame
        frame.setSize(600,500);  //Set Width To The Frame
        frame.setBounds(200, 100, 800, 700);  // Just Combines The Positioning And And Sizing Of The Frame
        frame.setVisible(true);     //Sets Visibility To True ,It Primarly Is False
      
          ImageIcon logo = new ImageIcon(".././Images/logo.jpeg");  // We Created An ImageIcon
          frame.setIconImage(logo.getImage());  // SetIcon Only Takes An Image Parameter So Thats Why We Call Get Image Method
      
      

        // 1) Close Button
        /*So When We Close The Window By closing The Cross Button 
        It Does Not Closes The Window Rather It Hides But We Dont Want That To Happpen 
        So, We Are Gonna Fix this By Setting The Close Operaton To Exit */
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // Default - Hides The Window But Still Running 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Modified  - Exits Ot The Application 

        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Modified - Not Let User to Close The Application From Accidental Pressing Of Cross 

        // 2) Resizable Option 
        /*
         * So On Setting On Mac We See The Setting Cannot Be Resized The Same Goes With This Function 
           Normally When We Click Full Screen Button It Primarly Opens The Window To Full Screen But If We Dont Want tHE Users to be Able To Do That 
           So, We Can Implement This Function To Stop Them From Resizing Our Windows Size
         */
        frame.setResizable(true); // Prevents Frame From Being Resized 

        
        //BackGround Color Chanefe
        //frame.getContentPane().setBackground(Color.green);  //Default Color 
        //frame.getContentPane().setBackground(new Color(72,23,88));  //Custom Color Can Include Hexa ,RGB Anything

        Container bgcontent = frame.getContentPane();  // Contains All The Things Inside Of The Window
        //bgcontent.setBackground(Color.YELLOW);  // Color The Whole Container
 
            
      

      }
}