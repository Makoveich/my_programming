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
        System.out.println("What do you  want to do (SET information or READ)");
        try {

            while (true) {
                String answerTodo = reader.readLine();
                if (answerTodo.equals("")) {
                    System.out.println("Goodbye");
                    break;
                }
                switch (answerTodo.toLowerCase()) {
                    case "set":
                        System.out.println("You want to set information about City");           // now this part is undone
                        break;
                    case "read":
                        System.out.println("Please type a city's NAME");
                        String cityName = reader.readLine();
                        String[] arrayCityNames = new String[list.size()];
                        for (int i =0; i<list.size(); i++) {
                            arrayCityNames[i] = list.get(i).name.toLowerCase();
                        }
                        if (!Arrays.asList(arrayCityNames).contains(cityName.toLowerCase())) {
                            System.out.println("Sorry, but information about " + cityName + " is absent(");
                        } else {

                            for (CityInformation city : list) {
                                if (city.name.toLowerCase().equals(cityName.toLowerCase())) {
                                    System.out.println(city.getCityInformation());
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
