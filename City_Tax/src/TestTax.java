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
        for (Tax i : array) {
            System.out.println(i.balance());

        }
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        String askedCity = scanner.nextLine();

        while (i < array.length) {
            if (array[i].city.equals(askedCity)) {
                System.out.println("For city " + askedCity + ":");
                System.out.println(array[i].toString());
                i++;
                continue;
            }
            System.out.println("Element " + array[i].city + " was found.");
            i++;
        }

        System.out.println("\n It was WHILE loop!!! \n");
        i=0;

        askedCity = args[1];

        do {
            if (array[i].city.equals(askedCity)) {
                System.out.println("For city " + askedCity + ":");
                System.out.println(array[i].toString());
                i++;
                continue;
            }System.out.println("Element " + array[i].city + " was found.");
            i++;
        } while (i < array.length);

    }

}
