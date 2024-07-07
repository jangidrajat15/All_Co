package Level_08;

public class Thread_All {
    public static void main(String[] args) {
        // yield() // this is the method which uses to remove current thread which is taking so much time and we have more thread which are waiting .
        // Suspend() and resume() are now not used .
        // Sleep(t);  //it will wait for time t.
        // wait() && notify()  //are used to wait and notify threads.
        //Daemon Threads ->Ravan
        new A().start();
        new B().Start();

        System.out.println("Hello");
    }
}

class A extends Threads{
    public A(){
        for(int i=0;i<5;i++){
            System.out.println("Hello "+i + " From A.");
        }
        System.out.println("Process A is Exit.");
        System.out.println();
    }
}

class B extends thread{
    public B(){
        for(int i=0;i<5;i++){
            System.out.println("Hello "+i + " From B.");
        }
        System.out.println("Process B is Exit.");
        System.out.println();
    }
}