import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


class MyFrame extends JFrame implements ItemListener{

    JComboBox combo;
    JLabel label,label1;
    Container c;
    JMenuBar menuBar;
    JMenu menu1,menu2,menu3;
    JTextArea txt;

    
    MyFrame() 
    {
        
        setBounds(100, 100, 700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("CheckBox Action Listener");
        this.setVisible(true);
        menuBar = new JMenuBar();
        menu1 = new JMenu("File ");
        menu2 = new JMenu("Edit");
        menu3= new JMenu("View ");
        this.setJMenuBar(menuBar);
        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(menu3);

        c=this.getContentPane();
        c.setLayout(null);

        label = new JLabel();
        label.setText("Select Your Country :");
        label.setBounds(150, 50, 200, 40);

        label1 = new JLabel("Selected Country : ");
        label1.setBounds(150,200,200,20);
        c.add(label1);

        String country[] ={"America","United Kingdom","Belgium","Italy","Venezuala","Nepal","India","Somalia","India","Canada","China"};
        combo = new JComboBox(country);
        combo.setBounds(350, 50, 200, 40);
        combo.setSelectedItem("United Kingdom");
        combo.setSelectedIndex(1);
        c.add(combo);
        c.add(label);

        txt = new JTextArea();
        txt.setBounds(350,200,200,20);
        c.add(txt);
        combo.addItemListener(this);


    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str = (String)(combo.getSelectedItem());
        txt.setText(str);    }


}




public class S15_01_ItemListener 
{

    public static void main(String[] args) {
        
    MyFrame frame = new MyFrame();

    }

}





