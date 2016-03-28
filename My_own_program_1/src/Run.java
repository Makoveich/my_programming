import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Mak on 25.03.2016.
 */
public class Run {

    static SumyInformation sumy = new SumyInformation("Sumy",292139, 98,1652, 1);
    static ZhytomyrInformation zhytomyr = new ZhytomyrInformation("Zhytomyr", 270046, 61, 884, 1);
    static KyivInformation kyiv = new KyivInformation("Kyiv", 2904381, 847.46, 1500, 2 );
    static KharkivInformation kharkiv = new KharkivInformation("Kharkiv", 1431000,350, 1630, 1);
    static ArrayList<CityInformation> list = new ArrayList<>();




    //program is starting))))

    public static void main(String[] args) {
        list.add(kyiv);
        list.add(zhytomyr);
        list.add(sumy);
        list.add(kharkiv);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {

            while (true) {
                System.out.println("What do you  want to do (SET information or READ)");
                String answerTodo = reader.readLine();
                if (answerTodo.equals("")) {
                    System.out.println("Goodbye");
                    break;
                }
                switch (answerTodo.toLowerCase()) {
                    case "set":
                        System.out.println("You want to set information about City \n");           // now this part is testing
                        System.out.println("Input the city's name, population, square, wasFounded, quantityOfAirports (ENTER between data)");
                        String name = reader.readLine();
                        int population = Integer.parseInt(reader.readLine());
                        Double square = Double.parseDouble(reader.readLine());
                        int wasFounded = Integer.parseInt(reader.readLine());
                        int quantityOfAirports = Integer.parseInt(reader.readLine());
                        list.add(new CityInformation(name, population, square, wasFounded, quantityOfAirports));
                        break;
                    case "read":
                        System.out.println("Please type a city's NAME");
                        String cityName = reader.readLine();

                        //make array from city's name in lowerCase

                        String[] arrayCityNames = new String[list.size()];
                        for (int i =0; i<list.size(); i++) {
                            arrayCityNames[i] = list.get(i).name.toLowerCase();
                        }

                        //checking for presence of input city's name in array of city's names

                        if (!Arrays.asList(arrayCityNames).contains(cityName.toLowerCase())) {
                            System.out.println("Sorry, but information about " + cityName + " is absent(");
                        } else {

                            for (CityInformation city : list) {
                                if (city.name.toLowerCase().equals(cityName.toLowerCase())) {
                                    System.out.println(city.getCityInformation());
                                }

                            }
                        }



                        // Adding howOldIn method for current city
                        System.out.println("For return to main menu type press ENTER, \n For \"How old\" type howold.");
                        String answer1 = reader.readLine();
                        if (answer1.toLowerCase().equals("howold")) {
                            for (CityInformation city : list) {
                                if (city.name.toLowerCase().equals(cityName.toLowerCase())) {
                                    System.out.println("Type the year, please...");

                                    // Interface HowOldIn apply to current city

                                    System.out.println(city.name + " age is " + city.howOldIn(Integer.parseInt(reader.readLine())));
                                }

                            }
                        }
                        break;


                    default:
                        System.out.println("You should type SET or READ only....\n Try again.");
                }
            }
        } catch (IOException e) {
            System.out.println("You should type letters or leave empty string.");
        }
    }



}
