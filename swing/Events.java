package swing;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class EventMain extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JButton b1,b2;
    EventMain(){
        setTitle("something");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        l1=new JLabel("1");
        l2=new JLabel("2");
        l3=new JLabel(" ");
        b1=new JButton("Add");
        b2=new JButton("Subtract");
        add(l1);
        add(l2);
        add(l3);
        add(b1);
        add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        setVisible(true);
    }
        public void actionPerformed(ActionEvent e){//must define as public
            if(e.getSource()==b1){
                int a=Integer.parseInt(l1.getText());
                int b=Integer.parseInt(l2.getText());
                l3.setText(Integer.toString(a+b));}
            if(e.getSource()==b2){
                int a=Integer.parseInt(l1.getText());
                int b=Integer.parseInt(l2.getText());
                l3.setText(Integer.toString(a-b));}
            add(l3);
        
        }

}

public class Events {
    public static void main(String[] args) {
        new EventMain();
    }
}
