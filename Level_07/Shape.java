package Level_07;

public class Shape {
	public static void main(String[] args) {
		System.out.println("Hello i am Shape Main method");
	}
    public int num1,num2;
	
	Shape(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	
	public void setNum1(int num1){
		this.num1=num1;
	}

	public void setNum2(int num2){
		this.num2=num2;
	}

	public int getNum1(){
		return this.num1;
	}

	public int getNum2(){
		return this.num2;
	}
}
