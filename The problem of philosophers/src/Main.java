import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        Semaphore semaphore = new Semaphore(n);

        Philosophers philosophers1 = new Philosophers("Фромм", 5000);
        Philosophers philosophers2 = new Philosophers("Ницше", 4000);
        Philosophers philosophers3 = new Philosophers("Платон", 3000);
        Philosophers philosophers4 = new Philosophers("Марск", 5000);
        Philosophers philosophers5 = new Philosophers("Сократ", 1000);
        Philosophers philosophers6 = new Philosophers("Кант",2000);
        Philosophers philosophers7 = new Philosophers("Конфуций", 1000);
        Philosophers philosophers8 = new Philosophers("Аристотель",5000);
        Philosophers philosophers9 = new Philosophers("Декарт",4000);
        Philosophers philosophers10 = new Philosophers("Локк",2000);

        philosophers1.semaphore = semaphore;
        philosophers2.semaphore = semaphore;
        philosophers3.semaphore = semaphore;
        philosophers4.semaphore = semaphore;
        philosophers5.semaphore = semaphore;
        philosophers6.semaphore = semaphore;
        philosophers7.semaphore = semaphore;
        philosophers8.semaphore = semaphore;
        philosophers9.semaphore = semaphore;
        philosophers10.semaphore = semaphore;

        philosophers1.start();
        philosophers2.start();
        philosophers3.start();
        philosophers4.start();
        philosophers5.start();
        philosophers6.start();
        philosophers7.start();
        philosophers8.start();
        philosophers9.start();
        philosophers10.start();
    }
}
