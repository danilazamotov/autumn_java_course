import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Thread timer = new Thread(new Timer());


            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Insert an operation: ");
                String operation = sc.nextLine();
                switch (operation) {
                    case "start":
                        Timer.startThread(timer);
                    case "restart":
                        Timer.restartThread(timer);
                    case "stop":
                        Timer.stopThread(timer);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

