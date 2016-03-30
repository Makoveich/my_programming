import javax.swing.*;
import java.awt.*;

/**
 * Created by Mak on 30.03.2016.
 */
public class gridBagWindow {
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();

        panel.setLayout(layout);

        JButton button;
        JLabel textArea;
        JTextField textField;
        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.HORIZONTAL;


        textArea = new JLabel("City");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.gridx = 0;
        c.gridy = 0;
        panel.add(textArea, c);

        textField = new JTextField();
        c.weightx = 1;
        c.gridx = 1;
        c.gridy = 0;
        panel.add(textField, c);

        button = new JButton("READ");
        c.fill = GridBagConstraints.VERTICAL;
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 2;
        panel.add(button, c);




        textArea = new JLabel("Country");
        c.fill = GridBagConstraints.HORIZONTAL;
        //c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 2;
        panel.add(textArea, c);

        textField = new JTextField();
        //c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 2;
        panel.add(textField, c);



        textArea = new JLabel("Population");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.gridx = 0;
        c.gridy = 3;
        panel.add(textArea, c);

        textField = new JTextField();
        c.weightx = 1;
        c.gridx = 1;
        c.gridy = 3;
        panel.add(textField, c);




        textArea = new JLabel("Square");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.gridx = 0;
        c.gridy = 4;
        panel.add(textArea, c);

        textField = new JTextField();
        c.weightx = 1;
        c.gridx = 1;
        c.gridy = 4;
        panel.add(textField, c);



        textArea = new JLabel("Was founded in");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.gridx = 0;
        c.gridy = 5;
        panel.add(textArea, c);

        textField = new JTextField();
        c.weightx = 1;
        c.gridx = 1;
        c.gridy = 5;
        panel.add(textField, c);

        button = new JButton("SET");
        c.fill = GridBagConstraints.VERTICAL;
        c.gridx = 0;
        c.gridy = 7;
        c.gridwidth = 2;
        panel.add(button, c);



        JFrame frame = new JFrame("City Information");
        frame.setContentPane(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}
