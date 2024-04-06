
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class PasswordField {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        ImageIcon img = new ImageIcon(".././Images/logo.jpeg");
        frame.setIconImage(img.getImage());
        frame.setBounds(0, 0, 1200,500);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        Container c = frame.getContentPane();

        JPasswordField p1 = new JPasswordField("1234455");
        p1.setBounds(100, 100, 150, 50);        
        p1.setEchoChar('#');  // Replace The Dots For Password Encryption To Any other Character
        c.add(p1);

        JPasswordField p2 = new JPasswordField();
        p2.setText("Password");
        p2.setBounds(100, 200, 150, 50);        
        c.add(p2);
        p2.setEchoChar((char)0); // will show password
        // p2.setEditable(false);
    }
    
}
