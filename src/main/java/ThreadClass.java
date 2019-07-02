import java.util.HashMap;

import static java.lang.Thread.sleep;

public class ThreadClass implements Runnable {

    CommonResource time;
    int zTime;

    public  ThreadClass(CommonResource c){
        this.time = c;
        zTime = 0;
    }

    public synchronized void run() {
            while (true) {
                try {
                    sleep(1000);
                    ++zTime;
                    synchronized (time) {
                        time.x = zTime;
                    }
                        System.out.println("time = " + (zTime));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

    }
}

