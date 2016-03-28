/**
 * Created by Mak on 25.03.2016.
 */
public class CityInformation implements HowOldIn{
    static String country = "Ukraine";
    String name;
    int population;
    double square;
    int wasFounded;
    int quantityOfAirports;

    public CityInformation(String name,int population,double square,int wasFounded,int quantityOfAirports) {
        this.name = name;
        this.population = population;
        this.square = square;
        this.wasFounded = wasFounded;
        this.quantityOfAirports = quantityOfAirports;
    }

    public int howOldIn(int year) {
        int d = year - wasFounded;
        if (d < 0) {
            d = defaultYear - wasFounded;
            System.out.println("year "+ year + " is changed to " + defaultYear);
        }
        return d;
    }

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
