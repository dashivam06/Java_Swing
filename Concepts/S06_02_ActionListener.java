import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {

    JButton btn1 = new JButton("Chad Button");
    JButton btn2 = new JButton("Gay Button");
    JButton btn3 = new JButton("Straight Button");
    Container c;

    MyFrame() {

        // For Button 1
        btn1.setSize(200, 40);
        btn1.setLocation(100, 300);
        btn1.setForeground(Color.MAGENTA);
        btn1.setBackground(Color.RED); // IDK WHY IT NEVER WORKS

        // For Button 2
        btn2.setSize(200, 40);
        btn2.setLocation(300, 300);
        btn2.setForeground(Color.YELLOW);

        // For Button 3
        btn3.setSize(200, 40);
        btn3.setLocation(500, 300);
        btn3.setForeground(Color.BLUE);

        c = this.getContentPane();
        c.setLayout(null);

        // Adding All The Buttons
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);

        // For All Event Listner
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn1) {
            c.setBackground(Color.RED);
        } 
        if (e.getSource() == btn2) {
            c.setBackground(Color.YELLOW);
        } 
        if (e.getSource() == btn3) {
            c.setBackground(Color.BLUE);
        }

    }
}

public class S06_02_ActionListener {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setTitle("Multiple Action Event ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 100, 400, 400);
        frame.setVisible(true);

    }
}