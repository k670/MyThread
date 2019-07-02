import static java.lang.Thread.sleep;

public class ThreadClass5 implements Runnable {

    CommonResource time;
    boolean isExec;


    public  ThreadClass5(CommonResource c){
        this.isExec = false;
        this.time = c;
    }

    public synchronized void run() {
            while (true) {
                try {
                    int zTime;

                    synchronized (time) {
                        zTime = time.x;
                    }
                        if (zTime % 5 == 0) {
                            System.out.println("Message!!!!!!!!!!");
                            //isExec = true;
                            sleep(1001);
                        }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

    }
}
