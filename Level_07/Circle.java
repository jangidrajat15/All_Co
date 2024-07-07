package Level_07;


public class Circle extends Shape{
    Circle(int num1){
		super(num1,(-1));
	}
		
	public int getArea(){
		return (this.num1*this.num1);
	}

	// public int getPerimeter(){
	// 	return (4*this.num1);
	// }
}
