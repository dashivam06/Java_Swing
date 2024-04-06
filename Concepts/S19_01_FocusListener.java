import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.FocusEvent;
import javax.swing.JFrame;

import javax.swing.JTextField;
import javax.swing.JTextArea;

class MyFrame extends JFrame implements java.awt.event.FocusListener {

    Container c;
    JTextField txtField;
    JTextArea txt;

    MyFrame()
    {
        setBounds(100, 100, 700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Focus Listener");
     

        c = getContentPane();
        c.setLayout(null); 


        txtField = new JTextField();
        txtField.setBounds(50, 200, 100, 40);
        txtField.setBackground(Color.lightGray);
        c.add(txtField);

        txt = new JTextArea();
        txt.setBounds(200, 100, 400, 250);
        txt.setFont(new Font("MV Boli",Font.BOLD,15));
        txt.setBackground(Color.GRAY);

        c.add(txt);

        txtField.addFocusListener(this);

        this.setVisible(true);
  
       

    }

    @Override
    public void focusGained(FocusEvent e) {
        txt.setText(txt.getText()+"\n"+"Focus Gained");

    }

    @Override
    public void focusLost(FocusEvent e) {
        txt.setText(txt.getText()+"\n"+"Focus Lost");
    }


}


public class S19_01_FocusListener  {

public static void main(String[] args) {
    MyFrame frame = new MyFrame();
}

    
}






