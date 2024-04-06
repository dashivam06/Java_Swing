import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.FocusEvent;

import javax.swing.JFrame;

import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.JTextArea;

class MyFrame extends JFrame implements CaretListener {

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

        txtField.addCaretListener(this);

        this.setVisible(true);
  
       

    }

    @Override
    public void caretUpdate(CaretEvent e) {
        txt.setText(txt.getText()+"\n"+"Caret Updated , Dot : "+e.getDot() + ", Mark : "+e.getMark());

    }

}


public class S20_01_CaretListener  {

public static void main(String[] args) {
    MyFrame frame = new MyFrame();
}

    
}






