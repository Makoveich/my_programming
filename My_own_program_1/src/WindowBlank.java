import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


/**
 * Created by Mak on 02.04.2016.
 */
public class WindowBlank extends JFrame {

    JFrame mainFrame = new JFrame("City Information");
    JPanel mainPanel = new JPanel(new BorderLayout());

    // Will use BorderLayout with 3 zones (NORTH, CENTER, SOUTH)

    // components of NORTH part

    private JPanel northPanel;
    private JLabel cityLabel;
    private JTextField cityTextField;

    // components of CENTRAL part

    private JPanel centralPanel;
    private JLabel countryLabel, populationLabel, squareLabel, wasFoundedLabel, quantityOfAirportsLabel;
    private JTextField countryTextField, populationTextField, squareTextField, wasFoundedTextField, quantityOfAirportsTextField;
    private JButton readButton, setButton, clearButton;

    // components of SOUTH part

    private JPanel southPanel;
    JLabel informationLabel;

    public WindowBlank() {
        mainFrame.setContentPane(mainPanel);
        mainFrame.setSize(300, 200);

        // NORTH part
        northPanel = new JPanel();
        cityLabel = new JLabel("City :");
        cityTextField = new JTextField(10);
        northPanel.add(cityLabel);
        northPanel.add(cityTextField);
        mainPanel.add(northPanel, BorderLayout.NORTH);

        // CENTRAL part

        centralPanel = new JPanel(new GridBagLayout());
        centralPanel.setBackground(Color.WHITE);
        mainPanel.add(centralPanel, BorderLayout.CENTER);

        readButton = new JButton("READ");;
        centralPanel.add(readButton, new GridBagConstraints(0, 0, 2, 1, 0.0, 0.0, GridBagConstraints.CENTER,
                GridBagConstraints.HORIZONTAL, new Insets(5, 10, 5, 10), 0, 0));
        countryLabel = new JLabel("Country");
        centralPanel.add(countryLabel, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER,
                GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0));
        countryTextField = new JTextField(10);
        countryTextField.setEditable(false);
        countryTextField.setText("Ukraine");
        centralPanel.add(countryTextField, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER,
                GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0));

        populationLabel = new JLabel("Population :");
        populationTextField = new JTextField(10);
        centralPanel.add(populationLabel, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER,
                GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0));
        centralPanel.add(populationTextField, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER,
                GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0));

        squareLabel = new JLabel("Square :");
        centralPanel.add(squareLabel, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER,
                GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0));
        squareTextField = new JTextField(10);
        centralPanel.add(squareTextField, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER,
                GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0));

        wasFoundedLabel = new JLabel("Was founded in :");
        centralPanel.add(wasFoundedLabel, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER,
                GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0));
        wasFoundedTextField = new JTextField(10);
        centralPanel.add(wasFoundedTextField, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER,
                GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0));

        quantityOfAirportsLabel = new JLabel("Quantity of airports :");
        centralPanel.add(quantityOfAirportsLabel, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER,
                GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0));
        quantityOfAirportsTextField = new JTextField(10);
        centralPanel.add(quantityOfAirportsTextField, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER,
                GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0));

        setButton = new JButton("SET");
        centralPanel.add(setButton, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER,
                GridBagConstraints.BOTH, new Insets(5, 10, 5, 2), 0, 0));

        clearButton = new JButton("CLEAR");
        centralPanel.add(clearButton, new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER,
                GridBagConstraints.BOTH, new Insets(5, 2, 5, 10), 0, 0));

        // SOUTH part

        southPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        southPanel.setPreferredSize(new Dimension(290, 30));
        southPanel.setBackground(new Color(210, 200, 230));
        mainPanel.add(southPanel, BorderLayout.SOUTH);
        informationLabel = new JLabel("Everything is OK. No additional information");
        southPanel.add(informationLabel);


        mainFrame.setVisible(true);
        mainFrame.pack();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Creating ActionListeners

        class ReadButtonClickListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cityName = cityTextField.getText();

                //make array from city's name in lowerCase

                String[] arrayCityNames = new String[Run.list.size()];
                for (int i =0; i<Run.list.size(); i++) {
                    arrayCityNames[i] = Run.list.get(i).name.toLowerCase();
                }

                //checking for presence of input city's name in array of city's names

                if (!Arrays.asList(arrayCityNames).contains(cityName.toLowerCase())) {
                    informationLabel.setText("Sorry, but information about " + cityName + " is absent(");
                    southPanel.setBackground(Color.red);
                } else {

                    for (CityInformation city : Run.list) {
                        if (city.name.toLowerCase().equals(cityName.toLowerCase())) {
                            countryTextField.setText(city.country);
                            populationTextField.setText(String.valueOf(city.population));
                            squareTextField.setText(String.valueOf(city.square));
                            wasFoundedTextField.setText(String.valueOf(city.wasFounded));
                            quantityOfAirportsTextField.setText(String.valueOf(city.quantityOfAirports));
                            informationLabel.setText("Information about " +city.name+" is founded.");

                        }

                    }
                }

            }
        }

        class ClearButtonClickListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                cityTextField.setText("");
                countryTextField.setText("");
                populationTextField.setText("");
                squareTextField.setText("");
                wasFoundedTextField.setText("");
                quantityOfAirportsTextField.setText("");
                informationLabel.setText("Cleared OK!");
                southPanel.setBackground(new Color(210, 200, 230));

            }
        }

        class SetButtonClickListener implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                String name = cityTextField.getText();
                int population = Integer.parseInt(populationTextField.getText());
                Double square = Double.parseDouble(squareTextField.getText());
                int wasFounded = Integer.parseInt(wasFoundedTextField.getText());
                int quantityOfAirports = Integer.parseInt(quantityOfAirportsTextField.getText());
                Run.list.add(new CityInformation(name, population, square, wasFounded, quantityOfAirports));
                informationLabel.setText("Information about "+ name + " was saved OK!");
            }
        }

        // assign ActionListener to buttons

        readButton.addActionListener(new ReadButtonClickListener());
        clearButton.addActionListener(new ClearButtonClickListener());
        setButton.addActionListener(new SetButtonClickListener());

    }
}
