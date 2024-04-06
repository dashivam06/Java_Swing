import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.*;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Math {

    public static void main(String[] args) {

        MyFrame frame = new MyFrame();

    }

    public static double pow(double base, int exponent) {
        if (exponent == 0) {
            return 1.0;
        } else if (exponent < 0) {
            // Handle negative exponents using Math.pow for efficiency and edge cases
            return 1.0 / Math.pow(base, -exponent);
        } else {
            double result = 1.0;
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
            return result;
        }
    }

}

class MyFrame extends JFrame  {

    JLabel success, failure, totaltrial, favoutcome, range;
    JTextField successtxt, failuretxt, totaltrialtxt, favoutcomtxt, range1txt, range2txt;
    JTextArea txtarea;
    JCheckBox terms;
    JButton submit,submit1;
    Container c;
    
    ImageIcon logo = new ImageIcon(".././Images/logo.jpeg");  // We Created An ImageIcon
   

    // For Factorials
    public static int factorial(int number) {
        int factorialvalue = 1;
        for (int i = number; i > 1; i--) {
            factorialvalue *= i;
        }
        return factorialvalue;
    }

    // For Combination
    public static int combination(int number1, int number2) {

        int numerator = factorial(number1);
        int denominator = factorial(number2) * factorial(number1 - number2);

        if (number1 < number2 || number1 < 0 || number2 < 0) {
            System.out.println("INVALID INPUT : Numbers must be non-negative integers and num1 >= num2\" ");
            return -1;
        } else {
            return numerator / denominator;
        }

    }

    // For Permutation
    public static int permutation(int number1, int number2) {

        if (number1 < number2 || number1 < 0 || number2 < 0) {
            System.out.println("INVALID INPUT : Numbers must be non-negative integers and num1 >= num2\" ");
            return -1;
        } else {
            return factorial(number1) / factorial(number1 - number2);
        }
    }

    // For Bionomial Theorem
    public static float bionomialProbability(float p, float q, int r, int n) {

        float comb = combination(n, r);
        float bionomialValue = (float) (comb * Math.pow((double) p, r) * Math.pow(q, n - r));
        return bionomialValue;

    }

    MyFrame() {
        setTitle("Bionominal Probability");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocation(300, 100);
        setIconImage(logo.getImage());

        c = getContentPane();
        c.setLayout(null);

        Font font = new Font("Times New Roman", Font.BOLD, 18);
        Font fontbtn = new Font("san serif", Font.BOLD, 15);
        Font right = new Font("Verdana", Font.BOLD, 15);
        // For success
        success = new JLabel("Success Rate : ");
        success.setBounds(50, 50, 200, 40);
        c.add(success);
        success.setFont(font);

        successtxt = new JTextField();
        successtxt.setBounds(200, 55, 200, 35);
        c.add(successtxt);

        // For failure Number
        failure = new JLabel("Failure Rate :");
        failure.setBounds(50, 100, 200, 40);
        c.add(failure);
        failure.setFont(font);

        failuretxt = new JTextField();
        failuretxt.setBounds(200, 105, 200, 35);
        c.add(failuretxt);

        // For totaltrial
        totaltrial = new JLabel("Total Trial   : ");
        totaltrial.setBounds(50, 150, 200, 40);
        c.add(totaltrial);
        totaltrial.setFont(font);

        totaltrialtxt = new JTextField();
        totaltrialtxt.setBounds(200, 155, 200, 35);
        c.add(totaltrialtxt);

        range = new JLabel("Range ");
        range.setBounds(200, 200, 150, 40);
        c.add(range);
        range.setFont(font);

        range1txt = new JTextField();
        range1txt.setBounds(90, 200, 80, 35);
        c.add(range1txt);

        range2txt = new JTextField();
        range2txt.setBounds(290, 200, 80, 35);
        c.add(range2txt);

             // For Submit Button
             submit1 = new JButton("Calculate With Range");
             submit1.setBounds(50, 270, 400, 50);
             submit1.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    float p = Float.parseFloat(successtxt.getText());
                    float q = Float.parseFloat(failuretxt.getText());
                    int n = Integer.parseInt(totaltrialtxt.getText());
                    int r1= Integer.parseInt(range1txt.getText());
                    int r2= Integer.parseInt(range2txt.getText());
                    float bio=0;
        
                    for(int i=r1;i<=r2;i++){
                        bio +=bionomialProbability(p, q, i, n);
                        
                 }
                    txtarea.setText("\n"+("-".repeat(60) +"\n\n Bionomial Probability : "+bio));
                    favoutcomtxt.setText("");
                        }
                
             });
             c.add(submit1);

        // For favoutcome
        favoutcome = new JLabel("Success Outcome :");
        favoutcome.setBounds(50, 350, 200, 40);
        c.add(favoutcome);
        favoutcome.setFont(font);

        favoutcomtxt = new JTextField();
        favoutcomtxt.setBounds(200, 350, 200, 40);
        c.add(favoutcomtxt);

        
        // For Submit Button
        submit = new JButton("Calculate Directly");
        submit.setBounds(50, 400, 400, 50);
        submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                float p = Float.parseFloat(successtxt.getText());
                float q = Float.parseFloat(failuretxt.getText());
                int n = Integer.parseInt(totaltrialtxt.getText());
                int r = Integer.parseInt(favoutcomtxt.getText());
                float result = bionomialProbability(p, q, r, n);
                txtarea.setText(("\n"+"-".repeat(60) +"\n\n Bionomial Probability : "+result+"\nPermutation : "+
                        permutation(n, r))+"\nCombination : "+combination(n, r)+"\n\n"+"-".repeat(60));

                range1txt.setText("");
                range2txt.setText("");

                            }
            
        });
        c.add(submit);

        // For Right TextArea Portion
        txtarea = new JTextArea();
        txtarea.setBounds(500, 50, 350, 400);
        txtarea.setFont(right);
        txtarea.setBackground(Color.LIGHT_GRAY);
        txtarea.setForeground(Color.DARK_GRAY);
        c.add(txtarea);

        setVisible(true);
    }

   

}
   
    

