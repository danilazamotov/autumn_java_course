import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("a, b: ");

            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            DoubleCalculation DCalculation = new DoubleCalculation();
            DCalculation.division(a,b);
            DCalculation.multiplication(a,b);
            DCalculation.sum(a,b);
            DCalculation.subtraction(a,b);

    }
    
}
