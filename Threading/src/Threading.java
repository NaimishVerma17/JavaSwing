import java.io.IOException;

/**
 * Created by NAIMISH on 3/8/2017.
 */
public class Threading  {
    public static void main(String[] args) throws InterruptedException {
        Thread thread= new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    print2();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        print1();

    }
   static void print1() throws InterruptedException {
        for(int i=0;i<100;i++)
        {Thread.sleep(100);
        System.out.println("INDIA");
    }}
   static void print2() throws InterruptedException {for(int i=0;i<100;i++){
        Thread.sleep(100);

        System.out.println("PAKISTAN");
    }}



}
