import java.util.Scanner;

public class MyException_01 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String: ");
		try{
			String str=sc.next();
			checkStringLength(str);
		}catch(MyExp e){
			System.out.println(e.getMessage());
		}
		sc.close();
	}

	public static void checkStringLength(String str) throws MyExp{
		if(str.length() >10){
			throw new MyExp("String too large");
		}
	}
}

class MyExp extends Exception{
	public MyExp(String str){
		super(str);
	}
}
	