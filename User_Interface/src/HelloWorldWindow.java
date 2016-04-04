import javax.swing.*;
import java.awt.*;


public class HelloWorldWindow extends JFrame {

    public static void main(String[] args) throws InterruptedException{
        JFrame windows = new JFrame();


        JPanel window = new JPanel();
        JPanel panel1 = new JPanel();

        JLabel cityLabel = new JLabel("City");
        JTextField cityField = new JTextField(10);
        panel1.add(cityLabel);
        panel1.add(cityField);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.white);

        for (int i = 1; i<21; i++) {
            String s = i+"";
            panel2.add(new JButton(s));
        }

        JPanel panel3 = new JPanel();

        JButton readButton = new JButton("READ");
        JButton setButton = new JButton("SET");
        panel3.add(readButton);
        panel3.add(setButton);

        BorderLayout layout = new BorderLayout();
        window.setLayout(layout);



        window.add(panel1, layout.PAGE_START);
        window.add(panel3, layout.PAGE_END);
        window.add(panel2, layout.CENTER);


        windows.setSize(300,400);
        windows.setContentPane(window);
        windows.setVisible(true);
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
