import java.math.BigInteger;
import java.math.*;

public class MagicMath {
    public static void main(String[] args) {
       System.out.println(getFactorial(10));
       System.out.println(MagicMath.getFactorial(10));

       System.out.println(getABC(-10));
       System.out.println(Math.abs(-10));

       System.out.println(pow(10,3));
       System.out.println(Math.pow(10,3));




    }

    public static BigInteger getFactorial(int n) {
        if (n <= 1) {
            return BigInteger.valueOf(1);
        }
        else {
            return BigInteger.valueOf(n).multiply(getFactorial(n - 1));
        }

    }
    public static double getABC (double value) {
        if (value <= 0) {
            return 0.0 - value;
        }
        return value;
    }

    public static int pow (int n, int e) {
      int result = 1;
      for (int i = 1; i <= e; i++) {
          result = result * n;
      }
      return result;
    }
}
