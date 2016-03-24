import java.math.RoundingMode;

/**
 * Created by Mak on 21.03.2016.
 */
public class TaxZhytomyr extends Tax {


    public TaxZhytomyr(double heating, double utilities, double averageSalary) {
        super(heating, utilities, averageSalary);
    }

    public double balance(){
        double i = averageSalary*0.9 - (paymentForHeating + utilitiesPayment + minSalary);
        return i;

    }

}
