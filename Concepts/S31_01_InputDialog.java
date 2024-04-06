import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class S31_01_InputDialog 
{

        public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setBounds(350,100,800,500); 
    frame.setTitle("JPanel Example"); 
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); 

    Container c = frame.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.LIGHT_GRAY);

    JButton btn = new JButton("Click Me ");
    btn.setBounds(350, 200, 100, 40);
    c.add(btn);
    btn.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            String name = JOptionPane.showInputDialog("Enter Your Name :");
            if(name.length()>0){
                System.out.println("Name :  "+ name);
            }else{
                System.out.println("Name :  Not Provided By User ");
            }
            
        }
        
    });


    frame.setVisible(true);
    

        }


    }