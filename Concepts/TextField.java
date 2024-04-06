import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextField {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        ImageIcon img = new ImageIcon(".././Images/logo.jpeg");
        frame.setIconImage(img.getImage());
        frame.setBounds(0, 0, 1200,500);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        Container c = frame.getContentPane();

        JTextField textField = new JTextField("Username");
        textField.setBounds(20, 40, 150, 80);
        Font font = new Font("MV Boli",Font.BOLD, 20);
        textField.setFont(font);
        textField.setBorder(null);
        c.add(textField);  //adding to container 
        textField.setForeground(Color.RED);  // changing font color
        textField.setBackground(Color.GRAY);  //canging Background color
        textField.setEditable(false); //Changing editable property of textarea
        
        

    }
}
