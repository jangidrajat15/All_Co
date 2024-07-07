//Learning Thread Priority.

package Level_09;

public class Thread_003 {
    public static void main(String[] args) {
        thr_01 T1=new thr_01();
        thr_02 T2=new thr_02();
        thr_03 T3=new thr_03();
        T2.setPriority(Thread.MAX_PRIORITY);
        T1.setPriority(Thread.MIN_PRIORITY);
        T1.start();
        T2.start();
        T3.start();
    }
}

class thr_01 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Thread_01.");
        }
    }
}

class thr_02 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Thread_02...");
        }
    }
}

class thr_03 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Thread_03.....");
        }
    }
}