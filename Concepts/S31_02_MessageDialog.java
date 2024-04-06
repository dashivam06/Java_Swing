import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class S31_02_MessageDialog {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(350, 100, 800, 500);
        frame.setTitle("JPanel Example");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        Container c = frame.getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.LIGHT_GRAY);

        JButton btn1 = new JButton("Info - Message ");
        c.add(btn1);
        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(frame, "Smoking Weeds in Public Places is Legal Now . ",
                        "Question Message ", JOptionPane.INFORMATION_MESSAGE);

            }
        });

        JButton btn2 = new JButton("Warning - Message ");
        c.add(btn2);
        btn2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(frame, "Dont Smoke in Funeral Ever Again ? ", "Question Message ",
                        JOptionPane.WARNING_MESSAGE);

            }
        });

        JButton btn3 = new JButton("Plain - Message ");
        c.add(btn3);
        btn3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(frame, "I Admit That I Smoke Weed", "Plain Message ",
                        JOptionPane.PLAIN_MESSAGE);

            }
        });

        JButton btn4 = new JButton("Question - Message ");
        c.add(btn4);
        btn4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(frame, "Wanna Light a Joint Together ?", "Question Message ",
                        JOptionPane.QUESTION_MESSAGE);

            }
        });

        JButton btn5 = new JButton("Error - Message ");
        c.add(btn5);
        btn5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(frame,
                        "Error 404 !!!\nWhile Buying Weed Off Of Dark Web On Black Friday Sale . ", "Question Message ",
                        JOptionPane.ERROR_MESSAGE);

            }
        });

        frame.setVisible(true);

    }

}