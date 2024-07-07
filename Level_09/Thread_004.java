//Using Join in Threading

package Level_09;

public class Thread_004 {
    public static void main(String[] args) {
        thr_04 T4=new thr_04();
        thr_05 T5=new thr_05();
        T4.start();
        try{
            T4.join();
        }catch(Exception e){
            System.out.println(e);
        }
        T5.start();
    }
}

class thr_04 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello...");
        }
    }
}

class thr_05 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello.......");
        }
    }
}
