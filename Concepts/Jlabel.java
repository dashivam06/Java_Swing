
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jlabel {
    public static void main(String[] args) {
        
    ImageIcon img = new ImageIcon(".././Images/logo.jpeg"); //For Dock's IconImage 
    
    //Frame Setup 
    JFrame frame = new JFrame();
    frame.setVisible(true);
    frame.setBounds(200,100,800,500); // Will set the sizing and positioning of the frame
    frame.setTitle("Title Goes Here"); // will set the title 
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); // will close the frame when we want to close that 
    frame.setIconImage(img.getImage());
    frame.setLayout(null);

    Container c = frame.getContentPane();
    //c.setBackground(Color.RED);

// Uncomments All This To Get a Clear Idea Of EveryThing

/* 
    //Setting A Text To The Label
    JLabel label = new JLabel("Who's This Pokemon :"); // creating a label 
    label.setBounds(100, 50, 300, 50); 
    //label.setText("You Username : "); // adding texts to label
    c.add(label); // adding label to the frame container
    //Configuring font
    Font font = new Font("Times New Roman",Font.ITALIC, 30);
    label.setFont(font);

*/

/* 
    // Setting an Image To a Label 
    ImageIcon pic = new ImageIcon(".././Images/charizard.png");
    JLabel label1 = new JLabel(pic);
    //label1.setBounds(100, 200, 100, 100);  //Its Manually setting size 
    label1.setBounds(0, 00, pic.getIconWidth(), pic.getIconHeight());  // Its Setting Size with the image size itself
    c.add(label1);
*/
/* 

    //Adding Image An Text Together in JLabel
    ImageIcon textwithpic = new ImageIcon(".././Images/pokemon.png");
    JLabel label2 = new JLabel("Balbasor : ",textwithpic,JLabel.RIGHT);
    label2.setBounds(0, 100, 500, 100);
    c.add(label2);

*/
/*
    //Resizing Image In JLabel  &&  Adding Both Text And Image in JLabel
    ImageIcon original = new ImageIcon(".././Images/pokemon.png");
    Image originalImage = original.getImage();
    Image resizedimg = originalImage.getScaledInstance(700, 400, originalImage.SCALE_SMOOTH);
    ImageIcon resized = new ImageIcon(resizedimg);
    JLabel label3 = new JLabel("",resized,JLabel.RIGHT); //Will Position itself With JLabel Width
    label3.setBounds(0, 0, 800, 500);
    c.add(label3);
*/
    ImageIcon icon = new ImageIcon(".././Images/travisscott.png");
    Image origial = icon.getImage();
    Image resize = origial.getScaledInstance(90,90,origial.SCALE_SMOOTH);
    ImageIcon resizedimg2 = new ImageIcon(resize);
    JLabel label4 = new JLabel("Travis Scott",resizedimg2,JLabel.RIGHT);
    label4.setBounds(10, 10, 300, 700);
    Font font1 = (new Font("MV Boli",Font.PLAIN,30)); 
    label4.setFont(font1);
    c.add(label4);

    }
}
