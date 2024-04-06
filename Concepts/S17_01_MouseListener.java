import java.awt.Container;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


class MyFrame extends JFrame implements MouseListener{
    Container c;
    JLabel label;
    JButton btn;
    JTextArea txt;

    MyFrame()
    {
        setBounds(100, 100, 700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("JRadioButton Action Listener");

        c = this.getContentPane();
        c.setLayout(null); 


        //JLabel For Label
        label = new JLabel("POP UP 🥰");
        label.setBounds(70, 100, 100, 40);
        c.add(label);

        //JButton 
        btn = new JButton("Click Me !!");
        btn.setBounds(50, 300, 100, 50);
        c.add(btn);


        txt = new JTextArea();
        txt.setBounds(200, 100, 400, 250);
        txt.setFont(new Font("MV Boli",Font.BOLD,15));
        c.add(txt);


        btn.addMouseListener(this);
        label.addMouseListener(this);
        
        
        setVisible(true);


    }


    // Note : Must Be In A Sequence OtherWise ...

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()==btn){
            txt.setText(txt.getText()+"\n"+"Button is Entered");
        }else if(e.getSource()==label){
            txt.setText(txt.getText()+"\n"+"Label is Entered");
        }    }

        @Override
        public void mousePressed(MouseEvent e) {
            if(e.getSource()==btn){
                txt.setText(txt.getText()+"\n"+"Button is Pressed");
            }else if(e.getSource()==label){
                txt.setText(txt.getText()+"\n"+"Label is Pressed");
            }    }

            @Override
            public void mouseReleased(MouseEvent e) {
                if(e.getSource()==btn){
                    txt.setText(txt.getText()+"\n"+"Button is Released");
                }else if(e.getSource()==label){
                    txt.setText(txt.getText()+"\n"+"Label is Released");
                }    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()==btn){
            txt.setText(txt.getText()+"\n"+"Button is Clicked");
        }else if(e.getSource()==label){
            txt.setText(txt.getText()+"\n"+"Label is Clicked");
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource()==btn){
            txt.setText(txt.getText()+"\n"+"Button is Exited");
        }else if(e.getSource()==label){
            txt.setText(txt.getText()+"\n"+"Label is Exited");
        }    }

        
    
        
    
       
    
    
}

public class S17_01_MouseListener {
    
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}
