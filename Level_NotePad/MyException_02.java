import java.util.Scanner;

public class MyException_02{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number :");
		try{
			long num=sc.nextLong();
			checkNum(num);
		}catch(Exp_01 e){
		System.out.println(e.getMessage());
		}
	}
	public static void checkNum(long num) throws Exp_01{
		if(num<0 || num>1000){
			throw new Exp_01("Number is either negative or greater then 1000");
		}
	}
}

class Exp_01 extends Exception{
	Exp_01(String str){
		super(str);
	}
}