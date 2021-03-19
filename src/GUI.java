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


    }

    public static void main(String[] args){
        new GUI();
    }
}
