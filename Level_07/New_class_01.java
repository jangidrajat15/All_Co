package Level_07;

public class New_class_01 {
    public static void main(String[] args) {
            int x=10;
            System.out.println("x: "+x);

    }
    public New_class_01(){
        System.out.println("Hello i am constructor of New_Class_01");
    }
    public void Method_01(){
        System.out.println("Ajay");
        Circle obj=new Circle(20);
        int ans=obj.getArea();
        System.out.println("Area is : "+ ans);
    }

}

