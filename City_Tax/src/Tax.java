/**
 * common Class for Tax, each City must has own Tax class object.
 */
public class Tax {
    double paymentForHeating;
    String city;
    double utilitiesPayment;
    double averageSalary;
    static double minSalary; // set by method setMinSalary


    public double balance() {
        double i = averageSalary - (paymentForHeating + utilitiesPayment + minSalary);
        return i;
    }

    public void setMinSallary(double i) {
        minSalary = i;
    }

    public void setCity(String city) {  //this method set City for the Tax object
        this.city = city;
    }


    public Tax(double heating, double utilities, double averageSalary) {  //constructor
        paymentForHeating = heating;
        utilitiesPayment = utilities;
        this.averageSalary = averageSalary;
    }

    public Tax(double heating, double utilities) {
        paymentForHeating = heating;
        utilitiesPayment = utilities;
        averageSalary = 3200;
    }

   public String toString() {
       String s = "Payment for heating - " + paymentForHeating + "\n" +
               "Payment for utilities - " + utilitiesPayment + "\n" +
               "Average salary - " + averageSalary + "\n" +
               "Minimum salary - " + minSalary + ".";
       return s;
   }



}
