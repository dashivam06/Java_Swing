import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class S07_01_TextArea {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = frame.getContentPane();
        c.setBackground(Color.BLACK);
        c.setLayout(null);

        JTextArea txt = new JTextArea();
        txt.setBounds(150,100,400,200);
        txt.setFont(new Font("MV Boli", Font.PLAIN, 20));
        txt.setText("// Write Your Comments Here ..");
        txt.setEditable(true);
        txt.setLineWrap(false);  //Line break after reaching the end of the textarea
        c.add(txt);
       
        frame.setVisible(true);

    }
}
