
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.*;

public class MyButton {
    
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setTitle("JButton Practice Window");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1200, 600);
        frame.setLayout(null);
        
        

        // Image -- Icon 
        ImageIcon pic = new ImageIcon(".././Images/logo.jpeg");
        frame.setIconImage(pic.getImage());

        Container c = frame.getContentPane();
        c.setLayout(null);


        // JButton 
        JButton btn = new JButton("Click Me !!");
        btn.setSize(200,40);
        btn.setLocation(100,100);
        c.add(btn);
        
        //Font 
        Font font = new Font("MV Boli",Font.BOLD, 20);
        btn.setFont(font);

        //Change Text Dynamically 
        btn.setText("My Button !!");

        //Changing Color 
        btn.setForeground(Color.MAGENTA);
        btn.setBackground(Color.GREEN);  // Not Changing IDK Why

        //Changing Cursor Action 
        Cursor cur = new Cursor(Cursor.HAND_CURSOR);
        //Cursor cur = new Cursor(Cursor.CROSSHAIR_CURSOR);
        //Cursor cur = new Cursor(Cursor.WAIT_CURSOR);
        btn.setCursor(cur);


        //Set Enable And Disable Button
        btn.setEnabled(false);
        btn.setEnabled(true);

        //Visiblility Of Buton 
        btn.setVisible(false);
        btn.setVisible(true);

        //Passing image To The Button
        ImageIcon img = new ImageIcon(".././Images/Moai.png");
        Image original = img.getImage();
        Image resizable = original.getScaledInstance(50, 30, original.SCALE_SMOOTH);
        ImageIcon resized = new ImageIcon(resizable);
        JButton btn1 = new JButton(resized);
        btn1.setSize(resized.getIconWidth(),resized.getIconHeight());
        btn1.setLocation(100,200);
        c.add(btn1);

        frame.setVisible(true);
    }


}
