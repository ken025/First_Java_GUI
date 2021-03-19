import javax.swing.*;
import java.awt.*;

public class GUI {

    public GUI(){
//        making the frame (window)
        JFrame frame = new JFrame();

//        inside the window (panel)
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.setLayout((new GridLayout(0, 1)));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        new GUI();
    }
}
