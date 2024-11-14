package swing;

import java.awt.*;

import javax.swing.*;

public class fswing {
    public static void main(String[] args) {
        JFrame f = new JFrame("Frame");
        JLabel jl=new JLabel("Hello");
        f.setLayout(new FlowLayout());
        f.setSize(400,400);
        f.add(jl);
        
        JButton jb=new JButton("Click");
        f.add(jb);

        JRadioButton rb1=new JRadioButton("Red");
        JRadioButton rb2=new JRadioButton("Yellow");
        JRadioButton rb3=new JRadioButton("Green");
        ButtonGroup bg=new ButtonGroup();//to selecet one button at a time
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        f.add(rb1);
        f.add(rb2);
        f.add(rb3);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
    
}
