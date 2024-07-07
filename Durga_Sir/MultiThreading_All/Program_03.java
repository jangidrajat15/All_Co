
class MyThread_03 extends Thread{
    public void run(){
        for(int i =0;i<10;i++){
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}

public class Program_03 {
    public static void main(String[] args) {
        MyThread_03 t1=new MyThread_03();
        t1.start();

        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
