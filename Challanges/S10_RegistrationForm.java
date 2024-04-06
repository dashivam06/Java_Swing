import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class S10_RegistrationForm {

    public static void main(String[] args) {

        MyFrame frame = new MyFrame();

    }

}

class MyFrame extends JFrame implements ActionListener {

    JLabel name, mobile, gender, DOB, address, registration;
    JTextField nametxt, mobtxt, addresstxt, screen;
    JComboBox drp1, drp2, drp3;
    JRadioButton btn1, btn2;
    JTextArea txtarea;
    JCheckBox terms;
    JButton submit;
    Container c;

    MyFrame(){
        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocation(300, 100);

        c = getContentPane();
        c.setLayout(null);

        Font font = new Font("Times New Roman", Font.BOLD, 20);
        Font fontbtn = new Font("san serif",Font.BOLD,15);
        Font right = new Font("Verdana", Font.BOLD,15);
        // For Name 
        name = new JLabel("Name ");
        name.setBounds(50, 50, 100, 40);
        c.add(name);
        name.setFont(font);

        nametxt = new JTextField();
        nametxt.setBounds(200, 50, 200, 35);
        c.add(nametxt);


        // For Mobile Number 
        mobile = new JLabel("Mobile ");
        mobile.setBounds(50, 100, 100, 40);
        c.add(mobile);
        mobile.setFont(font);

        mobtxt = new JTextField();
        mobtxt.setBounds(200, 100, 200, 35);
        c.add(mobtxt);


        // For Gender 
        gender = new JLabel("Gender ");
        gender.setBounds(50, 150, 100, 40);
        c.add(gender);
        gender.setFont(font);

        // For Radio Button
        btn1 = new JRadioButton(" Male");
        btn2 = new JRadioButton(" Female");
        btn1.setBounds(200, 150, 100, 40);
        btn2.setBounds(300, 150, 100, 40);
        ButtonGroup gen = new ButtonGroup();
        gen.add(btn1);
        gen.add(btn2);
        c.add(btn1);
        c.add(btn2);
        btn1.setSelected(true);
        btn1.setFont(fontbtn);
        btn2.setFont(fontbtn);


        //For Date Of Birth
        DOB = new JLabel("DOB");
        DOB.setBounds(50, 200, 100, 40);
        DOB.setFont(font);
        c.add(DOB);

        String[] date = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20",
        "21","22","23","24","25","26","27","28","29","30","31"};
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] year = {"2022", "2023", "2024", "2025"}; 

        drp1 = new JComboBox(date);
        drp2 = new JComboBox(month);
        drp3 = new JComboBox(year);

        drp1.setBounds(200, 200,70, 50);
        drp2.setBounds(270, 200, 100, 50);
        drp3.setBounds(370, 200, 100, 50);

        c.add(drp1);
        c.add(drp2);
        c.add(drp3);

        
        // For Address 
        address = new JLabel("Address ");
        address.setBounds(50, 250, 100, 40);
        c.add(address);
        address.setFont(font);

        addresstxt = new JTextField();
        addresstxt.setBounds(200, 250, 200, 40);
        c.add(addresstxt);

        // For Terms And Conditions
        terms = new JCheckBox("I agree to Terms & Conditions");
        terms.setBounds(100, 330, 300, 40);
        terms.setFont(fontbtn);
        c.add(terms);

        // For Submit Button
        submit = new JButton("Submit");
        submit.setBounds(200, 400, 100, 50);
        submit.addActionListener(this);
        c.add(submit);
        
        // For Registration
        registration = new JLabel("Note : ");
        registration.setBounds(50, 500, 400, 50);
        registration.setFont(new Font("Times New Roman", Font.BOLD,20));
        registration.setForeground(Color.RED);
        c.add(registration);


        // For Right TextArea Portion 
        txtarea  = new JTextArea();
        txtarea.setBounds(500,50,350,400);
        txtarea.setFont(right);
        txtarea.setBackground(Color.LIGHT_GRAY);
        txtarea.setForeground(Color.DARK_GRAY);
        c.add(txtarea);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    if(terms.isSelected()){

        String Name = nametxt.getText();
        String Mobile = mobtxt.getText();
        String Gender;
        if(btn1.isSelected()){
            Gender = "Male";
        }else if(btn2.isSelected()){
            Gender = "Female";
        }else{
            Gender = "Cannot Say";
        }
        String Address = addresstxt.getText();
        String DateOfBirth = drp3.getSelectedItem()+"/"+drp2.getSelectedItem()+"/"+drp1.getSelectedItem();

        txtarea.setText("\n"+"Personal Form Details : "+"\n"+"\n"+"\n"+"Name : "+Name+"\n"+"\n"+"Date Of Birth : "+DateOfBirth+"\n"+"\n"+"Gender : "+Gender+"\n"+"\n"+"Mobile :"+Mobile+"\n"+"\n"+"Address : "+Address);
        registration.setText("Note : Form Filled Successfully . ");
    }
    else 
    { 
        txtarea.setText("");
        registration.setText("Note : Accept Terms & Conditions First ");
    }

}

}