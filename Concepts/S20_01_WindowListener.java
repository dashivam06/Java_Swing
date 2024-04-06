import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import javax.swing.JTextField;
import javax.swing.JTextArea;

class MyFrame extends JFrame implements WindowListener {

    Container c;
    JTextField txtField;
    JTextArea txt;

    MyFrame()
    {
        setBounds(100, 100, 700, 500);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Window Listener");
    
        c = getContentPane();
        c.setLayout(null); 
        c.setBackground(Color.LIGHT_GRAY);

        this.setVisible(true);
        addWindowListener(this);

  

    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
        dispose(); // Dispose the frame directly
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }


}


public class S20_01_WindowListener  {

public static void main(String[] args) {
    MyFrame frame = new MyFrame();
}

    
}






