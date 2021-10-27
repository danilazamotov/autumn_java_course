public class FormatLimitedException extends Exception {

    public FormatLimitedException(String message) {
        super(message);
    }

    public void MessageError() {
        System.out.println("Факториал числа не может быть найдет");
    }

}
