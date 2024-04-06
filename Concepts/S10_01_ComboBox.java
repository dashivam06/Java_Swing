import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class S10_01_ComboBox {
    public static void main(String[] args) {
        
         // Frame Creation  
        JFrame frame = new JFrame();
        frame.setBounds(400, 100, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        // Container Creation
        Container c = frame.getContentPane();
        c.setLayout(null);


        String country[]= {"Nepal","India","USA","UK","Japan","Korea"};
        JComboBox box = new JComboBox(country);
        box.setBounds(100, 100, 200, 40);
        box.setEditable(false);
        box.addItem("Ukraine");
        box.addItem("Russia");
        box.addItem("Ukraine");
        box.removeItem("Ukraine");  // Deletes The First value
        box.setSelectedIndex(3);
        box.setSelectedItem("USA");
        box.setFont(new Font("Times New Roman", Font.BOLD, 15));
        c.add(box);

              
        JLabel label = new JLabel("Result : ");
        label.setBounds(100, 250, 300, 50);
        c.add(label);

        JButton btn = new JButton("OK");
        btn.setBounds(400,105,130,30);
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String str = (String)box.getSelectedItem();
                // int idx = box.getSelectedIndex();
                String idx = String.valueOf(box.getSelectedIndex());
                label.setText("Result : "+str + " & Selected Index : "+idx);            
            }
            
        });
        c.add(btn);

  




        frame.setVisible(true);
    }
}
