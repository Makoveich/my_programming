import javax.swing.*;
import java.awt.*;

/**
 * Created by Mak on 01.04.2016.
 */
public class Window extends JFrame{

    JPanel panel;
    JButton button;
    JTextField textField;

    Windowing() {
        panel = new JPanel(new FlowLayout());
        button = new JButton("the button");
        textField = new JTextField(10);
        panel.add(button);
        panel.add(textField);
        JFrame frame = new JFrame("window");
        frame.setContentPane(panel);
        frame.setVisible(true);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
