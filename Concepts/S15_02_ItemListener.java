
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

class MyFrame extends JFrame implements ItemListener {

    JTextArea txt;
    Container c;
    JFrame frame;
    JRadioButton white, tuco, jesse, saul;

    MyFrame() {
        setBounds(100, 100, 700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("JRadioButton Action Listener");

        c = this.getContentPane();
        c.setLayout(null);

        Font font = new Font("MV Boli", Font.PLAIN, 15);

        txt = new JTextArea();
        txt.setBounds(150, 100, 400, 200);
        txt.setEditable(true);
        txt.setFont(font);
        txt.setLineWrap(true);
        txt.setLineWrap(false); // Line break after reaching the end of the textarea
        c.add(txt);

        // JButton for Personality
        white = new JRadioButton("Walter White");
        jesse = new JRadioButton("Jesse Pinkman");
        tuco = new JRadioButton("Tuco Salamance");
        saul = new JRadioButton("Saul Goodman");

        ButtonGroup personality = new ButtonGroup();
        personality.add(saul);
        personality.add(white);
        personality.add(jesse);
        personality.add(tuco);

        c.add(white);
        c.add(saul);
        c.add(jesse);
        c.add(tuco);

        white.setBounds(100, 50, 200, 40);
        jesse.setBounds(500, 50, 200, 40);
        saul.setBounds(100, 400, 200, 40);
        tuco.setBounds(500, 400, 200, 40);

        white.addItemListener(this);
        tuco.addItemListener(this);
        saul.addItemListener(this);
        jesse.addItemListener(this);

        this.setVisible(true);

    }

  

    @Override
    public void itemStateChanged(ItemEvent e) {

        if (e.getSource() == tuco) {
            txt.setText(
                    "Personality: Wild and eccentric\n" +
                            "Net Worth: $2.5 Million\n" +
                            "Role: Street-level Drug Dealer\n");
        }
        if (e.getSource() == white) {
            txt.setText(
                    "Personality: Ambitious and Calculating\n" +
                            "Net Worth: $80 Million\n" +
                            "Role: Methamphetamine Manufacturer\n");
        }
        if (e.getSource() == saul) {
            txt.setText(
                    "Personality: Conflicted and Emotionally Troubled\n" +
                            "Net Worth: $2 Million\n" +
                            "Role: Former Methamphetamine Manufacturer\n");
        }
        if (e.getSource() == jesse) {
            txt.setText(
                    "Personality: Conflicted and Emotionally Troubled\n" +
                            "Net Worth: $2 Million\n" +
                            "Role: Former Methamphetamine Manufacturer\n" +
                            "Background: Originally introduced as a small-time\n methamphetamine manufacturer and user,\n Jesse Pinkman becomes deeply involved in the drug\ntrade. Despite his troubled past, he struggles with his\n conscience and the consequences of his actions.\n");
        }    }

}

class S14_05_IteaddItemListener {

    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
    }
}