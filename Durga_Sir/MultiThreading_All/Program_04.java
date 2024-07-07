class MyThread_04 extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        
    }
}


public class Program_04 {
    public static void main(String[] args) throws InterruptedException {
        
        MyThread_04 t= new MyThread_04();
        t.start();

        t.join();

        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        //     try{
        //         Thread.sleep(1000);
        //     }catch(Exception e){
        //         System.out.println(e);
        //     }
        }
    }
}
