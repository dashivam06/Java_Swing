
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


public class Label {
    
    public static void main(String[] args) {

        // JLabel = a GUI Display Area For A String Of Text,an Image ,or Both

        JLabel label = new JLabel();   // Crete A Label 
       
        label.setText("Hey Bro, Do You Even Code ?");  //Set Text Of Label 

        ImageIcon image = new ImageIcon(".././Images/code.png");
        Border border = BorderFactory.createLineBorder(Color.green,3);        

        JFrame frame = new JFrame();
        Container c = frame.getContentPane();
        c.setLayout(null);
        JLabel label1 = new JLabel("😍 Username"); 
        frame.add(label1);
        label1.setFont(new Font("MV Boli",Font.PLAIN,20)); 
        label1.setForeground(Color.CYAN);
        label1.setLayout(null);
        label1.setBounds(200,100 , 600, 500);
        frame.setTitle("Practice Window");
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //frame.setLayout(null);  //By Default It Has A Free layout So The Text Is Always Flowing In The Middle So Set It To False
        frame.setBounds(400,200 , 600, 500);
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //Set Text Left,Right,Center,Right of Image Icon 
        label.setVerticalTextPosition(JLabel.TOP);  //Set Text Top , Center , Button Of ImageIcon
        label.setForeground(Color.CYAN); // Pre Defined Color 
        //label.setForeground(new Color(0x555)); // Pre Defined Color 
        label.setFont(new Font("MV Boli",Font.PLAIN,20)); //set font of text
        label.setIconTextGap(100); //set gap to text and image 
        //label.setBackground(Color.black); //set background color with black it functions when we set opaque to true 
        label.setOpaque(true); //Set Opaque and background image to desired color
        label.setBorder(border);
        //label.setBounds(100,200,350,350);//set x,y position within frame as well as dimensions
        //frame.pack(); //Will Fit All the content inside the window
        frame.add(label); //Add Label And Then Pack 


        label.setVerticalAlignment(JLabel.TOP); //set vertical position of text+icon within label
        label.setHorizontalAlignment(JLabel.RIGHT); //set hoorizonatal Position of icon+text within label
    }
}
