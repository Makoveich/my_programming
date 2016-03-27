/**
 * Created by Mak on 25.03.2016.
 */
public class CityInformation {
    static String country = "Ukraine";
    String name;
    int population;
    double square;
    int wasFounded;
    int quantityOfAirports;

    public String getCityInformation() {
        String s = "Country " + country + ";\n" +
                "\nInformation about city " + name + ":\n" +
                "\nPopulation - "+population+";\n"+
                "Square - " + square +"sq.km" + ";\n" +
                "Was founded in " + wasFounded + ";\n" +
                name +" has " + quantityOfAirports + " airport(s).";
        return s;
    }
}
