import java.util.HashMap;

public class MyThread  {

    int id;
    public static void main(String[] args) {

        CommonResource c = new CommonResource();
        c.x=0;

        System.out.println("!!");

        int i = 0;
        ThreadClass threadClass1 = new ThreadClass(c);
        Thread thread = new Thread(threadClass1);
        ThreadClass5 threadClass5 = new ThreadClass5(c);
        Thread thread5 = new Thread(threadClass5);
        thread5.setPriority(9);
        thread.start();
        thread5.start();
    }

}

class CommonResource{

     int x=0;
}