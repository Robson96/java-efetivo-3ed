package com.robson.app.item78;

import java.util.concurrent.TimeUnit;

// Quebrado! - Quanto tempo vc teria que esperar ate este programa executar?
public class StopThread {
  private static boolean stopRequested;

  public static void main(String[] args) throws InterruptedException {
    Thread background = new Thread(() -> {
      int i = 0;
      while (!stopRequested)
        i++;
    });
    background.start();
    TimeUnit.SECONDS.sleep(1);
    stopRequested = true;
  }
}
