//Thread using runable interface.

package Level_09;

public class Thread_002 {
    public static void main(String[] args) {
        MyThreadRunable_01 B1=new MyThreadRunable_01();
        MyThreadRunable_02 B2=new MyThreadRunable_02();
        Thread T1=new Thread(B1);
        Thread T2=new Thread(B2);
        T1.start();
        T2.start(); 
    }
}

class MyThreadRunable_01 implements Runnable{
    public void run(){
        int i=0;
        while(i<2000){
        System.out.println("Runnable_01 running...");
        i++;
        }
    }
}

class MyThreadRunable_02 implements Runnable{
    public void run(){
        int i=0;
        while(i<2000){
        System.out.println("Runnable_02 running.....");
        i++;
        }
    }
}

