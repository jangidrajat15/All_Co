//Thread's using Thread extends.

package Level_09;

public class Thread_001 {
    public static void main(String[] args) {
        // Thread_01 T1=new Thread_01();
        // Thread_02 T2=new Thread_02();
        // T1.start();
        // T2.start();
        new Thread_01().start();
        new Thread_02().start();
    }
}

class Thread_01 extends Thread{
    public void run() {
        int i=0;
        while(i<5){
            System.out.println("Runing Thread_01.....");
            i++;
        }
    }
}

class Thread_02 extends Thread{
    public void run() {
        int i=0;
        while(i<100){
            System.out.println("Runing Thread_02.....");
            i++;
        }
    }
}