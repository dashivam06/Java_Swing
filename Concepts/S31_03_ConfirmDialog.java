import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class S31_03_ConfirmDialog 
{

        public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setBounds(350,100,800,500); 
    frame.setTitle("JPanel Example"); 
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); 

    Container c = frame.getContentPane();
    c.setLayout(new FlowLayout());
    c.setBackground(Color.LIGHT_GRAY);

    JButton btn1 = new JButton("Info - Message ");
    c.add(btn1);
    btn1.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            int input = JOptionPane.showConfirmDialog(c,"Do You Want To Exit ? ","Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);

            if(input==JOptionPane.YES_OPTION){
                System.out.println("Thank You ,You Can Continue Now.");
            }else if(input==JOptionPane.NO_OPTION){
                System.out.println("Thank You ,You Can Stop Now.");
                System.exit(0);
            }
            else if(input==JOptionPane.CANCEL_OPTION){
                System.out.println("Thank You ,You Can Exit Now.");
            }
            
        }
    });


    frame.setVisible(true);
}
}