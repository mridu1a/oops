package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleTrafficLight extends JFrame implements ActionListener {
    
    Container c;
    JRadioButton red,yellow,green;
    ButtonGroup group;
    JLabel l;
    
    public SimpleTrafficLight() {
        setTitle("simple traffic light");
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
         c=getContentPane();
        l=new JLabel("traffic light");
        c.add(l);
        red= new JRadioButton("red");
        yellow= new JRadioButton("yellow");
        green= new JRadioButton("green");
        group = new ButtonGroup();
        group.add(red);
        group.add(yellow);
        group.add(green);
        c.add(red);
        c.add(yellow);
        c.add(green);
        red.addActionListener(this);
        yellow.addActionListener(this);
        green.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==red){
            c.setBackground(Color.red);
        }
        if(e.getSource()==yellow){
            c.setBackground(Color.yellow);
        }
        if(e.getSource()==green){
            c.setBackground(Color.green);
        }
    }
    public static void main(String[] args) {
        new SimpleTrafficLight();
    }
    
}
