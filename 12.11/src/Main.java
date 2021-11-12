import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        Thread myThready1 = new Thread(new Runnable()
        {
            public void run()
            {
                for (int i=0;i<50;i++) {
                    try {
                        sleep(1000);
                    } catch(InterruptedException e){}

                    System.out.println("яйцо");
                }
            }
        });

        Thread myThready2 = new Thread(new Runnable()
        {
            public void run()
            {
                for (int i=0;i<50;i++) {
                    try {
                        sleep(1000);
                    } catch(InterruptedException e){}

                    System.out.println("курица");
                }
            }



        });

        myThready1.start();
        myThready2.start();
    }
}
