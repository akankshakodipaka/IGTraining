package com.insight;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock {
    
    public static void main(String[] args) {
        Thread clockThread = new Thread(new Runnable() {
            @Override
            public void run() {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                
                long startTime = System.currentTimeMillis();
                long elapsedTime = 0;
                
                while (elapsedTime < 10000) {
                    String time = sdf.format(new Date());
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Digital Clock: " + time);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    
                    elapsedTime = System.currentTimeMillis() - startTime;  // Update elapsed time
                }
                
                System.out.println("\nThe digital clock has stopped.");
            }
        });
        
        clockThread.start();
    }
}