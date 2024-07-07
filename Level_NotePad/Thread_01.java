import java.util.*;

public class Thread_01{
	public static void main(String[] args){
		Thread_01 T1=new Thread_01();
		Thread_02 T2=new Thread_02();
		T1.start();
		T2.Start();

	}
}

class Thread_01 extends Thread{
	public void run(){
		int i=100;
		while(i>0){
		System.out.println("Thread_01");
		i--;
		}
	}
}

class Thread_02 extends Thread{
	public void run(){
		int j=100;
		while(j>0){
		System.out.print("Thread_022222222");
		j--;
		}
	}
}
