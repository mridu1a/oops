package swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleTrafficLightSimulator extends JFrame implements ActionListener {

    // Define radio buttons
    private JRadioButton redButton = new JRadioButton("Red");
    private JRadioButton yellowButton = new JRadioButton("Yellow");
    private JRadioButton greenButton = new JRadioButton("Green");
    
    // Panel for drawing the lights
    private JPanel lightPanel = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(redButton.isSelected() ? Color.RED : Color.GRAY);
            g.fillOval(50, 20, 60, 60); // Red light
            
            g.setColor(yellowButton.isSelected() ? Color.YELLOW : Color.GRAY);
            g.fillOval(50, 90, 60, 60); // Yellow light
            
            g.setColor(greenButton.isSelected() ? Color.GREEN : Color.GRAY);
            g.fillOval(50, 160, 60, 60); // Green light
        }
    };

    public SimpleTrafficLightSimulator() {
        setTitle("Simple Traffic Light Simulator");
        setSize(200, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Group buttons so only one can be selected
        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(yellowButton);
        group.add(greenButton);

        // Add action listeners
        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        // Add components to frame
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(redButton);
        buttonPanel.add(yellowButton);
        buttonPanel.add(greenButton);
        
        add(buttonPanel, BorderLayout.SOUTH);
        add(lightPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        lightPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleTrafficLightSimulator frame = new SimpleTrafficLightSimulator();
            frame.setVisible(true);
        });
    }
}
