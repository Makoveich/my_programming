/**
 * Created by Mak on 21.03.2016.
 */
public class TaxSumy extends Tax{
    public TaxSumy(double heating, double utilities, double averageSalary) {
        super(heating, utilities, averageSalary);
    }
    public double balance(){
        double i = averageSalary*0.8 - (paymentForHeating + utilitiesPayment + minSalary);
        return i;

    }
    public void whereAreYouFrom() {
        System.out.println("Sumy");
    }
}
