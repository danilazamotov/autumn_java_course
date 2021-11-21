import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Thread timer = new Thread(new Timer());


            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Insert an operation: ");
                String operation = sc.nextLine();
                switch (operation) {
                    case "S":
                        Timer.startThread(timer);
                    case "R":
                        Timer.restartThread(timer);
                    case "P":
                        Timer.stopThread(timer);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

