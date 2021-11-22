import java.util.concurrent.Semaphore;
public class Philosophers extends Thread{
    String name;
    int sleep;

    public Philosophers(String name, int sleep) {
        this.name = name;
        this.sleep = sleep;
    }

    Semaphore semaphore;
    @Override
    public void run(){
        System.out.println(this.getName() + " " + name + ": Думаю");
        try {
            semaphore.acquire();
            System.out.println(this.getName() + " " + name + ": Взял вилку, ем");
            Thread.sleep(sleep);
            System.out.println(this.getName() + " " + name + ": Отдал вилку, думаю дальше");
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
