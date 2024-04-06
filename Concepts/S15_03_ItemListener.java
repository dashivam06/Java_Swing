import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrame extends JFrame implements ItemListener {

    JLabel label, label1;
    Container c;
    JMenuBar menuBar;
    JMenu menu1, menu2, menu3;
    JTextArea txt;
    JCheckBox java, python, javascript, rust, golang;

    MyFrame() {

        setBounds(100, 100, 700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("CheckBox Action Listener");
        this.setVisible(true);
        menuBar = new JMenuBar();
        menu1 = new JMenu("File ");
        menu2 = new JMenu("Edit");
        menu3 = new JMenu("View ");
        this.setJMenuBar(menuBar);
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);

        c = this.getContentPane();
        c.setLayout(null);

        label = new JLabel();
        label.setText("Select Your Programming Skills :");
        label.setBounds(100, 50, 300, 40);

        label1 = new JLabel("Selected Programming Skills : ");
        label1.setBounds(100, 200, 300, 20);

        // CheckBox
        java = new JCheckBox("Java");
        python = new JCheckBox("Python");
        javascript = new JCheckBox("JavaScript");
        rust = new JCheckBox("Rust");
        golang = new JCheckBox("GoLang");

        java.setBounds(350, 50, 150, 40);
        python.setBounds(500, 50, 150, 40);
        javascript.setBounds(650, 50, 150, 40);
        rust.setBounds(800, 50, 150, 40);
        golang.setBounds(950, 50, 150, 40);

        c.add(java);
        c.add(javascript);
        c.add(python);
        c.add(rust);
        c.add(golang);

        java.addItemListener(this);
        python.addItemListener(this);
        golang.addItemListener(this);
        javascript.addItemListener(this);
        rust.addItemListener(this);

        c.add(label1);
        c.add(label);

        txt = new JTextArea("\n\nProgramming Skills :");
        txt.setBounds(350, 200, 300, 300);
        txt.setFont(new Font("Times New Roman", Font.BOLD, 15));
        c.add(txt);

    }

 

    @Override
    public void itemStateChanged(ItemEvent e) {
        // Clear the text area before appending the selected skills
        txt.setText("\n\nProgramming Skills:");
        txt.append("\n" + "-".repeat(60));

        if (java.isSelected()) {
            txt.append("\nJava");
        }
        if (python.isSelected()) {
            txt.append("\nPython");
        }
        if (javascript.isSelected()) {
            txt.append("\nJavaScript");
        }
        if (rust.isSelected()) {
            txt.append("\nRust");
        }
        if (golang.isSelected()) {
            txt.append("\nGoLang");
        }
    }

}

public class S15_03_ItemListener {

    public static void main(String[] args) {

        MyFrame frame = new MyFrame();

    }

}
