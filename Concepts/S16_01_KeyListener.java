import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

class MyFrame extends JFrame implements KeyListener {

    JMenuItem f1, f2, f3;
    JMenuItem e1, e2, e3;
    JMenuItem sub1, sub2, sub3;
    JTextArea txt;

    MyFrame() {
        // Frame Setup
        JFrame frame = new JFrame();
        frame.setBounds(200, 100, 800, 500); // Will set the sizing and positioning of the frame
        frame.setTitle("Title Goes Here"); // will set the title
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE); // will close the frame when we want to close that
        frame.setLayout(null);

        Container c = frame.getContentPane();
        c.setBackground(Color.LIGHT_GRAY);

        JMenuBar menu = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu view = new JMenu("View");
        JMenu window = new JMenu("Window");
        JMenu help = new JMenu("Help");

        // Adding Menus To The Container
        menu.add(file);
        menu.add(edit);
        menu.add(view);
        menu.add(window);
        menu.add(help);

        f1 = new JMenuItem("New");
        f2 = new JMenuItem("Open");
        f3 = new JMenuItem("Save");

        // Adding Sub MenuItem To File
        file.add(f1);
        file.add(f2);
        file.add(f3);

        // Sub MenuItems
        JMenu f4 = new JMenu("Save As ");
         sub1 = new JMenuItem("PDF Document");
         sub2 = new JMenuItem("Word Document");
         sub3 = new JMenuItem("Powerpoint Document");

        f4.add(sub1);
        f4.add(sub2);
        f4.add(sub3);
        file.add(f4);

        // Adding MenuItem Of Edit File
        e1 = new JMenuItem("Undo");
        e2 = new JMenuItem("Redo");
        e3 = new JMenuItem("Find & Replace");

        edit.add(e1);
        edit.add(e2);
        edit.add(e3);

        frame.setJMenuBar(menu);

        txt = new JTextArea();
        txt.setBounds(20, 10, 750, 400);
        txt.addKeyListener(this);
        c.add(txt);

 
        frame.setVisible(true);

        

    }

   
    @Override
    public void keyTyped(KeyEvent e) {
        txt.setText(txt.getText()+"\n"+"Key Typed : "+e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        txt.setText(txt.getText()+"\n"+"Key Pressed : "+e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        txt.setText(txt.getText()+"\n"+"Key Released : "+e.getKeyChar());
    }
}

public class S16_01_KeyListener {

    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
    }
}
