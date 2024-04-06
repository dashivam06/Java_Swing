
/*

CardLayout: Think of a deck of cards where only one card is visible at a time. 
CardLayout allows you to stack multiple components on top of each other, like cards in a deck. 
You can switch between components, showing only one at a time

1) Single Panel Display: Only one panel is visible at a time.
2) Dynamic Panel Switching: You can switch between panels dynamically during runtime.
3) Identification by Keys: Each panel is associated with a unique string key.
4) Commonly Used for Wizards and Tabs: Ideal for creating wizard-style interfaces or 
    tabbed dialogs where users navigate through different views.
*/


import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class S29_01_CardLayout 
{
    public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setBounds(350,100,800,500); 
    frame.setTitle("JPanel Example"); 
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); 
    frame.setVisible(true);

    Container c = frame.getContentPane();
    c.setBackground(Color.LIGHT_GRAY);
    CardLayout cardLayout = new CardLayout();
    c.setLayout(cardLayout);


    // For Buttons 
    JButton btn1 =  new JButton("Button 1");
    JButton btn2 =  new JButton("Button 2");
    JButton btn3 =  new JButton("Button 3");
    JButton btn4 =  new JButton("Button 4");

    c.add(btn1,"1");
    c.add(btn2,"2");
    c.add(btn3,"3");
    c.add(btn4,"4");
    
    cardLayout.next(c);
    cardLayout.previous(c);
    cardLayout.first(c);
    cardLayout.last(c);
    cardLayout.show(c,"3");

    }
}