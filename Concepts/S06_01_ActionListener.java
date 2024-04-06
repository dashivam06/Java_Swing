

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame implements ActionListener{

    Container c;
    JButton btn;
    
    MyFrame()
    {
        c=this.getContentPane();
        c.setLayout(null);
        btn= new JButton("Click Me !!");
        btn.setBounds(600,450, 200, 30);
        btn.addActionListener(this);
        c.add(btn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
 
        c.setBackground(Color.GRAY); // For Changing Background Color
    }

}

class S06_01_ActionListener {
        public static void main(String[] args) {
            MyFrame frame = new MyFrame();
            frame.setTitle("Event Listener");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // Note : SetBounds Replaces SetLocation And SetSize Methods
            frame.setSize(900, 600);
            frame.setLocation(100,100);
            frame.setVisible(true);
        }
   
}
