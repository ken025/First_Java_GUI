import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private int count = 0;
    private JLabel label = new JLabel("Number of clicks:  0     ");
    private JFrame frame;
    private JPanel panel;

    public GUI(){
//        making the frame (window)
        frame = new JFrame();

//          button
        JButton button = new JButton("Click Me!");
        button.addActionListener(this); //action listener for click of button

//        inside the window (panel)
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout((new GridLayout(0, 1)));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
