package com.gmail.vladimirprocean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockThread implements Runnable {
    private SimpleDateFormat sdf;

    public ClockThread() {
        super();
        this.sdf = new SimpleDateFormat("HH:mm:ss");
    }

    public ClockThread(String format) {
        this.sdf = new SimpleDateFormat(format);
    }

    @Override
    public void run() {
        Thread th = Thread.currentThread();
        while (!th.isInterrupted()) {
            System.out.println(sdf.format(new Date()));
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                break;
            }
        }
        System.out.println("Clock thread has stopped");
    }
}
