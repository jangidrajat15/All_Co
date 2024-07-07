package Level_07;

import java.util.Scanner;

// import com.newShape.Shape;
import com.newShape.Circle;

public class Importing_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter raduis of the circle: ");
        int ans=sc.nextInt();
        Shape obj=new Shape(ans, ans);
        int ans_01=obj.getNum1();
        // Circle obj=new Circle(sc.nextInt());
        // int ans=obj.getArea();
        System.out.println("Area of the circle is : "+ans_01);
        sc.close();
    }
}
