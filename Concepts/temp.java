
import javax.swing.*;
import javax.swing.JButton;

public class temp {
    
    private JFrame frame;
    private JLabel nameLabel, mobileLabel, genderLabel, dobLabel, addressLabel;
    private JTextField nameField, mobileField,addressField;
    private JRadioButton maleRadioButton, femaleRadioButton;
    private JComboBox<String> monthComboBox, dayComboBox, yearComboBox;
    private JLabel addressText; 
    private JCheckBox termsCheckBox;
    private JButton submitButton, resetButton;

    public temp() {
        
        frame = new JFrame("Registration Form");
        frame.setSize(400, 300);
        frame.setLayout(null); // Use null layout for setting bounds explicitly

        // Name
        nameLabel = new JLabel("Name:");
        //x-cordinate, y-cordinate, width, height
        nameLabel.setBounds(20, 20, 80, 25);
        nameField = new JTextField();
        nameField.setBounds(120, 20, 200, 25);
        frame.add(nameLabel);
        frame.add(nameField);

        // Mobile
        mobileLabel = new JLabel("Mobile:");
        mobileLabel.setBounds(20, 50, 80, 25);
        mobileField = new JTextField();
        mobileField.setBounds(120, 50, 200, 25);
        frame.add(mobileLabel);
        frame.add(mobileField);

        // Gender
        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20, 80, 80, 25);
        maleRadioButton = new JRadioButton("Male");
        maleRadioButton.setBounds(120, 80, 80, 25);
        femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setBounds(220, 80, 80, 25);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);
        frame.add(genderLabel);
       
        frame.add(maleRadioButton);
        frame.add(femaleRadioButton);

        // DOB
        dobLabel = new JLabel("DOB:");
        dobLabel.setBounds(20, 110, 80, 25);
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] days = new String[31];
        String[] years = new String[101];
        for (int i = 0; i < 31; i++) {
            days[i] = String.valueOf(i + 1);
        }
        for (int i = 0; i < 101; i++) {
            years[i] = String.valueOf(1920 + i);
        }
        monthComboBox = new JComboBox<>(months);
        monthComboBox.setBounds(120, 110, 100, 25);
        dayComboBox = new JComboBox<>(days);
        dayComboBox.setBounds(230, 110, 70, 25);
        yearComboBox = new JComboBox<>(years);
        yearComboBox.setBounds(320, 110, 80, 25);
        frame.add(dobLabel);
        frame.add(monthComboBox);
        frame.add(dayComboBox);
        frame.add(yearComboBox);

        // Address
        addressLabel = new JLabel("Address:");
        addressLabel.setBounds(20, 140, 80, 25);
        addressText = new JLabel();
        addressText.setBounds(120, 140, 200, 25);
        frame.add(addressLabel);
        frame.add(addressText);
        
        
        addressField = new JTextField();
        addressField.setBounds(120, 140, 200, 25);
        frame.add(addressField);

        // Accept Terms and Conditions
        termsCheckBox = new JCheckBox("I accept the terms and conditions");
        termsCheckBox.setBounds(20, 170, 250, 25);
        frame.add(termsCheckBox);

        // Submit Button
        submitButton = new JButton("Submit");
        submitButton.setBounds(20, 200, 100, 25);
        frame.add(submitButton);

        // Reset Button
        resetButton = new JButton("Reset");
        resetButton.setBounds(130, 200, 100, 25);
        frame.add(resetButton);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new temp();
    }
}