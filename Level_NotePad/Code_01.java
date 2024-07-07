package Rajat.Shape;

import java.util.*;


public class Code_01{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("I am main class Code_01");
		System.out.print("Enter length and breadth of the rectangle: ");
		Rectangle obj=new Rectangle(sc.nextInt(),sc.nextInt());
		int ans_01=obj.getArea();
		int ans_02=obj.getPerimeter();
		System.out.println("Area of the given rectangle is : " + ans_01);
		System.out.println("Perimeter of the given rectangle is : " + ans_02);

		System.out.print("Enter length of the Square: ");
		Square obj_02=new Square(sc.nextInt());
		int ans_03=obj_02.getArea();
		int ans_04=obj_02.getPerimeter();
		System.out.println("Area of the Square: " + ans_03);
		System.out.println("Perimeter of the Square : " + ans_04);
	}
}


class Shape{
	int num1,num2;
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

class Rectangle extends Shape{
	Rectangle(int num1,int num2){
		super(num1,num2);
	}

	public int getArea(){
		return (this.num1*this.num2);
	}
	
	public int getPerimeter(){
		return (2*(this.num1+this.num2));
	}
}

class Square extends Shape{
	
	Square(int num1){
		super(num1,(-1));
	}
		
	public int getArea(){
		return (this.num1*this.num1);
	}

	public int getPerimeter(){
		return (4*this.num1);
	}
	
}
