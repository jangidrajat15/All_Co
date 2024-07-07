public class Thread_006 {
    public static void main(String[] args) {
        System.out.println("Hello \nThread Program to run two thread at the time ."); 
        Thrad_01 obj_01=new Thrad_01();
        Thrad_02 obj_02=new Thrad_02();
        obj_01.setPriority(6);
        obj_02.setPriority(10);
        System.out.println("Priority of obj_01 and obj_02 are: " + obj_01.getPriority() + " , " + obj_02.getPriority());
        System.out.println("State of threads are: " + obj_01.getState() + " , " + obj_02.getState());    //To getState of the any state.
        obj_01.start();
        obj_02.start();
        
        if(obj_01.currentThread().getState() == Thread.State.TERMINATED)
        System.out.println("State of the current Thread is : " + obj_01.currentThread().getState() );
    }
}

class Thrad_01 extends Thread{
    public void run(){
        int j=0;
        // System.out.println("State of the current Thread is : " + obj_01.currentThread().getState() );

        while (j<100) {
            System.out.println("Thread_01 Method_01(Good_Morning)..");
            j++;
        }
    }
}

class Thrad_02 extends Thread{
    public void run(){
        int i=0;
        while(i<100){
            try{
                sleep(200);
            }catch(Exception e){
                System.out.println(e);
            }
        System.out.println("Thread_02 Method_02(Welcome)...........");
        i++;
        }
    }
}