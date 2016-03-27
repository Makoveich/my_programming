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

    public CityInformation(String name,int population,double square,int wasFounded,int quantityOfAirports) {
        this.name = name;
        this.population = population;
        this.square = square;
        this.wasFounded = wasFounded;
        this.quantityOfAirports = quantityOfAirports;
    }

    public String getCityInformation() {
        String s = "Country " + country + ";\n" +
                "Information about city " + name + ";\n" +
                "Population - "+population+";\n"+
                "Square - " + square +"sq.km" + ";\n" +
                "Was founded in " + wasFounded + ";\n" +
                name +" has " + quantityOfAirports + " airport(s).";
        return s;
    }
}
