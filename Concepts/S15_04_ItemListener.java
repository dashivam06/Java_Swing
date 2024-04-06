import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemListener;
import java.awt.event.ItemListener;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

class MyFrame implements ItemListener {

    public static JCheckBoxMenuItem phone;
    public static JCheckBoxMenuItem desktop;
    public static JTextArea txt;
    
    MyFrame(){        
    //Frame Setup 
    JFrame frame = new JFrame();
    frame.setBounds(200,100,800,500); // Will set the sizing and positioning of the frame
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

    //Adding Menus To The Container
    menu.add(file);
    menu.add(edit);
    menu.add(view);
    menu.add(window);
    menu.add(help);

    JMenuItem f1  = new JMenuItem("New");
    JMenuItem f2 = new JMenuItem("Open");
    JMenuItem f3  = new JMenuItem("Save");


    // Adding Sub MenuItem To File
    file.add(f1);
    file.add(f2);
    file.add(f3);


    //Sub MenuItems 
    JMenu f4  = new JMenu("Save As ");

    JMenuItem sub1 = new JMenuItem("PDF Document");
    JMenuItem sub2 = new JMenuItem("Word Document");
    JMenuItem sub3 = new JMenuItem("Powerpoint Document");

    f4.add(sub1);
    f4.add(sub2);
    f4.add(sub3);
    file.add(f4);




    // Adding MenuItem Of Edit File
    JMenuItem e1 = new JMenuItem("Undo");
    JMenuItem e2 = new JMenuItem("Redo");
    JMenuItem e3 = new JMenuItem("Find & Replace");

    edit.add(e1);
    edit.add(e2);
    edit.add(e3);

        // JCheakBoxMenuItem

     phone = new JCheckBoxMenuItem("Mobile View");
     desktop = new JCheckBoxMenuItem("Desktop View");

     phone.addItemListener(this);
     desktop.addItemListener(this);

    view.add(desktop);
    view.add(phone);

    txt = new JTextArea();
    txt.setBounds(20, 0, 750, 500);
    c.add(txt);


    frame.setJMenuBar(menu);
    frame.setVisible(true);

    }

 

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(phone.isSelected()){
            txt.setText("Smart Phone View Enabled");
        }else{
            txt.setText("Desktop View Enabled ");
        }    }   

        
    }

    public class S15_04_ItemListener {
        public static void main(String[] args) {
            MyFrame frame = new MyFrame();
        }
    }

