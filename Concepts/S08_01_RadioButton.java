import java.awt.Container;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class S08_01_RadioButton {
    
    public static void main(String[] args) {
        
        // Frame Creation  
        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        // Container Creation
        Container c = frame.getContentPane();
        c.setLayout(null);

        // RadioButton Creation
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(100, 100, 200, 40);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(300, 100, 200, 40);

        // ButtonGroup For Single Selection
        ButtonGroup gen = new ButtonGroup();
        gen.add(male);
        gen.add(female);

        // Sub Buttons
        JRadioButton insta = new JRadioButton("Instagram");
        insta.setBounds(50, 300, 100, 40);
        JRadioButton facebook = new JRadioButton("FaceBook");
        facebook.setBounds(200, 300, 100, 40);
        JRadioButton telegram = new JRadioButton("Telegram");
        telegram.setBounds(350, 300, 100, 40);
        JRadioButton reddit = new JRadioButton("Reddit");
        reddit.setBounds(500, 300, 100, 40);
        JRadioButton twitter = new JRadioButton("Twitter");
        twitter.setBounds(650, 300, 100, 40);
        

        // ButtonGroup For Single Selection
        ButtonGroup socialmedia = new ButtonGroup();
        socialmedia.add(twitter);
        socialmedia.add(facebook);
        socialmedia.add(reddit);
        socialmedia.add(telegram);
        socialmedia.add(insta);

        // To Pre Check A Selected Button
        insta.setSelected(true);
        female.setSelected(true);

        // Enable or Disable Button
        reddit.setEnabled(false);

        // Font Configuration
        Font font = new Font("SansSerif",Font.ITALIC,20);
        male.setFont(font);
        female.setFont(font);

        //Adding to the container
        c.add(male);
        c.add(female);
        c.add(twitter);
        c.add(insta);
        c.add(telegram);
        c.add(facebook);
        c.add(reddit);
       
        // Set the Frame To Be Visible
        frame.setVisible(true);
    }
}

