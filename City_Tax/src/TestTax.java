import java.util.Scanner;

/**
 * Created by Mak on 21.03.2016.
 */
public class TestTax {
    public static void main(String[] args) {
        Tax.minSalary =Double.parseDouble(args[0]);
        TaxKiev simpleWorker1 = new TaxKiev(250.00, 180.00, 5000);
        simpleWorker1.setCity("Kiev");
        TaxZhytomyr simpleWorker2 = new TaxZhytomyr(320, 190.44, 2300);
        simpleWorker2.setCity("Zhytomyr");
        TaxSumy simpleWorker3 = new TaxSumy(320, 170, 3000);
        simpleWorker3.setCity("Sumy");
        Tax[] array = {simpleWorker1, simpleWorker2, simpleWorker3};


    }

}
