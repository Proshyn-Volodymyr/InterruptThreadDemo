package com.gmail.vladimirprocean;

public class KillerThread implements Runnable {
    public KillerThread() {
        super();
    }

    @Override
    public void run() {
        Thread th = new Thread(new ClockThread());
        th.start();
        int a = (int) (Math.random() * 10);
        while(a != 5){
            System.out.println(a);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            a = (int) (Math.random() * 10);
        }
        th.interrupt();
        System.out.println("Killer thread has stopped");
    }
}
