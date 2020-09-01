package com.robson.app.item78;

import java.util.concurrent.TimeUnit;

// Finalizaçao da Thread em coloboraçao com a sincronizaçao adequada
public class StopThread2 {
  private static boolean stopRequested;

  private static synchronized void requestStop() {
    stopRequested = true;
  }

  private static synchronized boolean stopRequested() {
    return stopRequested;
  }

  public static void main(String[] args) throws InterruptedException {
    System.out.println(Thread.currentThread().getName());
    Thread background = new Thread(() -> {
      System.out.println(Thread.currentThread().getName());
      int i = 0;
      while (!stopRequested()) {
        i++;
      }
    });
    background.start();
    TimeUnit.SECONDS.sleep(1);
    requestStop();
  }
}
