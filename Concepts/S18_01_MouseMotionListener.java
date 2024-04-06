import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

class MyFrame extends JFrame implements MouseMotionListener {
    Container c;
    JLabel label;
    JTextArea txt;

    MyFrame() {
        setBounds(100, 100, 700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("JRadioButton Action Listener");

        c = this.getContentPane();
        c.setLayout(null);

        // JLabel For Label
        label = new JLabel("POP UP 🥰");
        label.setBounds(70, 100, 100, 40);
        c.add(label);

        txt = new JTextArea();
        txt.setBounds(200, 100, 400, 250);
        txt.setFont(new Font("MV Boli", Font.BOLD, 15));
        c.add(txt);

        label.addMouseMotionListener(this);

        setVisible(true);

    }

    @Override
    public void mouseDragged(MouseEvent e) {

        txt.setText(txt.getText()+"\n"+"Mouse Dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        txt.setText(txt.getText()+"\n"+"Mouse Moved");
    }

    
    


}

public class S18_01_MouseMotionListener {

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}
