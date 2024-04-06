
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyFrame extends JFrame implements ActionListener { 

    Container c;
    JLabel num1,num2,result;
    JTextField txt1,txt2,answer;
    JButton sum,mul,diff,div;

    MyFrame(String title)
    {
        setTitle(title);
        setBounds(550,200,450,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        

        c = getContentPane();
        c.setLayout(null);
    

        // Initialize JLabel instances
        num1 = new JLabel();
        num2 = new JLabel();
        result = new JLabel();


        num1.setText("First Number  : ");
        num1.setBounds(50, 100, 100, 40);
        c.add(num1);
        num2.setText("Second Number : ");
        num2.setBounds(50, 200, 120, 40);
        c.add(num2);
        

        // Initialize JTextFields
        txt1 = new JTextField();
        txt2 = new JTextField();
        answer = new JTextField();
      
        // TextField
        txt1.setBounds(200,100, 200, 40);
        c.add(txt1);

        txt2.setBounds(200,200, 200, 40);
        c.add(txt2);

        // Buttons 
        sum = new JButton(" + ");
        sum.setBounds(50, 300, 40, 40);
        diff = new JButton(" - ");
        diff.setBounds(150, 300, 40, 40);
        mul = new JButton(" * ");
        mul.setBounds(250, 300, 40, 40);
        div = new JButton(" / ");
        div.setBounds(350, 300, 40, 40);


        result.setText("Result      : ");
        result.setBounds(50, 400, 200, 40);
        c.add(result);


        answer.setBounds(200, 400, 200, 40);
        answer.setEditable(false);
        c.add(answer);

        //Adding Buttons
        c.add(sum);
        c.add(diff);
        c.add(mul);
        c.add(div);

        setVisible(true);

        sum.addActionListener(this);
        diff.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try{
        if(e.getSource()==sum){
            int a=Integer.parseInt(txt1.getText());
            int b=Integer.parseInt(txt2.getText());
            int c = a+b;
            answer.setText(c+"");  // Really Need This Empty Space
        }
        if(e.getSource()==diff){
            int a=Integer.parseInt(txt1.getText());
            int b=Integer.parseInt(txt2.getText());
            int c = a-b;
            answer.setText(c+"");  // Really Need This Empty Space
        }
        if(e.getSource()==mul){
            int a=Integer.parseInt(txt1.getText());
            int b=Integer.parseInt(txt2.getText());
            int c = a*b;
            answer.setText(c+"");  // Really Need This Empty Space
        }
        if(e.getSource()==div){
            int a=Integer.parseInt(txt1.getText());
            int b=Integer.parseInt(txt2.getText());
            int c = a/b;
            answer.setText(c+"");  // Really Need This Empty Space
        }
    }catch(NumberFormatException f){
        answer.setText("Please Enter Integer Values"); 
    }catch(ArithmeticException f){
        answer.setText("Cannot Divide By 0");
    }
} 

  
}

public class S06_SimpleCalculator {
    
    public static void main(String[] args) {
        MyFrame frame = new MyFrame("Calculator");
    }
}
/* 
import java.awt.*;
import javax.swing.*;

class MyFrame extends JFrame {

    Container c;
    JLabel num1, num2, result;
    JTextField txt1, txt2, answer;
    JButton sum, mul, diff, div;


    MyFrame(String title) {
        setTitle(title);
        setBounds(550, 200, 400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        c = getContentPane();
        c.setLayout(null);

        // Initialize JLabel instances
        num1 = new JLabel();
        num2 = new JLabel();
        result = new JLabel();

        num1.setText("First Number  : ");
        num1.setBounds(50, 100, 120, 40);
        c.add(num1);

        num2.setText("Second Number : ");
        num2.setBounds(50, 200, 120, 40);
        c.add(num2);


        // TextField
        txt1 = new JTextField();
        txt1.setBounds(200, 100, 100, 40);
        c.add(txt1);

        txt2 = new JTextField();
        txt2.setBounds(200, 200, 100, 40);
        c.add(txt2);

        // Buttons
        sum = new JButton(" + ");
        sum.setBounds(50, 300, 40, 40);
        diff = new JButton(" - ");
        diff.setBounds(150, 300, 40, 40);
        mul = new JButton(" * ");
        mul.setBounds(250, 300, 40, 40);
        div = new JButton(" / ");
        div.setBounds(350, 300, 40, 40);

        result.setText("Result      : ");
        result.setBounds(50, 400, 100, 40);
        c.add(result);

        answer = new JTextField();
        answer.setBounds(200, 400, 100, 40);
        c.add(answer);

        // Adding Buttons
        c.add(sum);
        c.add(diff);
        c.add(mul);
        c.add(div);
    }
}

public class S06_SimpleCalculator {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame("Calculator");
    }
}
*/