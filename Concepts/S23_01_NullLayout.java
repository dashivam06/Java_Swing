/*
 * In Swing, a "null layout" refers to the absence of any layout manager for a
 * container. When you set a container's layout manager to null, it means you're
 * taking full control over the positioning and sizing of its child components.
 * You are responsible for specifying the exact coordinates and dimensions of
 * each component within the container.
 */


import javax.swing.*;
import javax.swing.JButton;

public class S23_01_NullLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Null Layout Example");

        // Set null layout for the frame's content pane
        frame.setLayout(null);

        // Create and position components manually
        JLabel label = new JLabel("Enter your name:");
        JTextField textField = new JTextField();
        JButton button = new JButton("Submit");

        // Set the bounds (x, y, width, height) for each component
        label.setBounds(20, 20, 150, 30);
        textField.setBounds(180, 20, 150, 30);
        button.setBounds(100, 70, 100, 30);

        // Add components to the frame's content pane
        frame.add(label);
        frame.add(textField);
        frame.add(button);

        frame.setSize(350, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
