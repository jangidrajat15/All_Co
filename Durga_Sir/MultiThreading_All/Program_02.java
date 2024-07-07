class myRunnable implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("My Thread child");
    }
}

public class Program_02 {
    public static void main(String[] args) {
        myRunnable r=new myRunnable();
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(9);
        Thread t1=new Thread(r);
        t1.start();
        // t1.setPriority(9);
        Thread.currentThread().setPriority(5);
        System.out.println("Main Thread");
    }
}
