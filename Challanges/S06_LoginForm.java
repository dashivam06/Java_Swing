
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MyFrame extends JFrame implements ActionListener {
    JLabel label1, label2;
    JTextField txt; // Changed to JTextField for user input
    JPasswordField pass;
    JButton btn;
    Container c;

    MyFrame() {
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocation(500, 200);

        c = getContentPane();
        c.setLayout(null);

        label1 = new JLabel("UserName: ");
        label1.setBounds(50, 50, 200, 30); // Adjusted position
        label2 = new JLabel("Password: ");
        label2.setBounds(50, 100, 200, 30); // Adjusted position

        txt = new JTextField(); // Initialized as JTextField
        txt.setBounds(200, 50, 200, 30); // Adjusted position
        pass = new JPasswordField(); // PasswordField for password input
        pass.setBounds(200, 100, 200, 30); // Adjusted position

        btn = new JButton("Login");
        btn.setBounds(150, 170, 200, 40);

        c.add(label1);
        c.add(label2);
        c.add(txt);
        c.add(pass);
        c.add(btn);


        btn.addActionListener(this);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("User Name : "+txt.getText());
        System.out.println("Password  : "+pass.getText());
    }
}

public class S06_LoginForm {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}


