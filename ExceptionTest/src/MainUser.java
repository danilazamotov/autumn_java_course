import java.math.BigInteger;
import java.util.concurrent.ThreadLocalRandom;

public class MainUser {
    public static void main(String[] args) {

        Factorial factorial = new Factorial();

        int n = ThreadLocalRandom.current().nextInt(-10,10);
        System.out.println("число:" + n);


        try {
            System.out.println("Факториал числа: " + factorial.getFactorial(n));

        } catch (FormatLimitedException e ) {

            e.MessageError();
        } finally {
            System.out.println();
        }


    }
}
