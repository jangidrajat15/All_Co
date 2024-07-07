package Level_08;

public class Method_Overloading_and_overriding {
    public static void main(String[] args) {
        childClass obj=new childClass();
        obj.method_01();
        obj.method_02(85);
    }
}

class SuperClass{
    int x;
    public void method_01(){
        System.out.println("Hello........");
    }
    // public void method_02(){

    // }
    // public void method_02(){
    //     System.out.println("Hii");
    // }
} 

class childClass extends SuperClass{
    int y;
    public void method_01(){
        System.out.println("Hiiiiiiiii..........");
    }

    public void method_02(){
        System.out.println("Method_02 calling........");
    }
    public void method_02(int X){
        System.out.println("Method_02 calling with value x " + X + "........");
    }
}