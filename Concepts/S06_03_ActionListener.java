
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;



class S06_03_ActionListener {
        public static void main(String[] args) {
            JFrame frame = new JFrame();
            frame.setTitle("Event Listener");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // Note : SetBounds Replaces SetLocation And SetSize Methods
            frame.setSize(900, 600);
            frame.setLocation(100,100);
            frame.setVisible(true);

            Container c = frame.getContentPane();
            c.setLayout(null);

            JButton btn = new JButton("Click Me !! 🥰🥰");
            btn.setBounds(250, 300, 250, 40);
            c.add(btn);

            btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    c.setBackground(Color.BLACK);
                }
            });
            
        }
   
}
