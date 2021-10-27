

import java.math.BigInteger;

public class Factorial implements MethodFactorial {

    public Factorial() {
    }

    @Override
    public int getFactorial(int n) throws FormatLimitedException {
        int result = 1;
        if (n <= 1) {
            throw new FormatLimitedException("The number is less than 1");
        } else {
            for (int i = 1; i <= n; i++) {
                result = result * i;

            }
            return result;

        }
    }
}




