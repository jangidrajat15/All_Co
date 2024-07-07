class MyThread extends Thread{
    public void run(){
        // System.out.println("Thread Child Work");
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("Tis line executed by Thread name: "  + Thread.currentThread().getName());
    }
}

class Program_01{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        // t1.run();
        System.out.println(t1.getName());
        System.out.println("Tis line executed by Thread name: "  + Thread.currentThread().getName());
        return;
    }
}