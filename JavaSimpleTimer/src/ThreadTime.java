
class Timer extends Thread {
    public Timer() {
    }

    private static int seconds =  0;

    @Override
    public void run() {
        try{
            while(true) {
                if (!isInterrupted()){
                    System.out.print(seconds + " ");
                    seconds++;
                    sleep(1000);
                }
                else{ throw new InterruptedException();}}
        }
        catch (Exception e){ e.printStackTrace();}

    }
    public static void startThread(Thread timer){
        if(timer.isInterrupted()){
            timer.run();
        }
        System.out.println("Start");
    }

    public static void restartThread(Thread timer){
        if (!timer.isInterrupted()) {
            timer.interrupt();
        }
        seconds = 0;
        timer.run();
        System.out.println("Restart");
    }
    public static void stopThread(Thread timer) {
        if (!timer.isInterrupted()){
            timer.interrupt();
            System.out.println("Stop");
        }

    }

}