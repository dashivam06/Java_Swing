
/*
    Action Listener 
     
     Used When User
        > clicks on a button
        > press enter in a textfield
        > choose a menuitem

     Implementation Techniques
        > ActionListener Interface
        > void actionPerformed()
        > addActionListener()
 */

 import java.awt.Container;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import javax.swing.JFrame;
import javax.swing.JTextField;
 
 class MyFrame extends JFrame implements ActionListener {
 
     JTextField txt;
     Container c;
 
     MyFrame() {
         c = this.getContentPane();
         c.setLayout(null);
         txt = new JTextField();
         txt.setSize(200, 40);
         txt.setLocation(100, 150);
         c.add(txt);
         txt.addActionListener(this);
 
     }
 
     @Override
     public void actionPerformed(ActionEvent e) {
        String temptxt = txt.getText();
        txt.setText(temptxt.toUpperCase());
    }
 
 }
 
 public class S14_02_ActionListener {
     public static void main(String[] args) {
         MyFrame frame = new MyFrame();
         frame.setTitle("Action Event ");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setBounds(200, 100, 400, 400);
         frame.setVisible(true);
     }
 
 }
 