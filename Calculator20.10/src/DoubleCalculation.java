class DoubleCalculation implements InterfaceDouble {
    public void DoubleCalculation() {

    }
    @Override
    public void sum(double a, double b) {
        double m = a + b;
        System.out.println("Сумма: " + m);

    }

    @Override
    public void multiplication(double a, double b) {
        System.out.println("Умножение: " + a * b);
    }

    @Override
    public void division(double a, double b) {
        System.out.println("Деление: " + a / b);
    }
    @Override
    public void subtraction(double a, double b) {
        double m = a - b;
        System.out.println("Вычитание: " + m);
    }
}
