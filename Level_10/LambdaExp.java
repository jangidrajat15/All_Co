package Java.Level_10;

public class LambdaExp {
    public static void main(String[] args) {
        //We are going to use Lambda expressions.
        DemoAnon_01 obj=()->{
            System.out.println("Hello i am Method_01 which is overrided by lambda expression.");
        };
        obj.method_01();

        //We can use it with passing parameters in method.
        DemoAnon_02 obj_02=(x)-> {System.out.println("Hello we have x= " + x);};
        obj_02.method_02(99);

    }
}

@FunctionalInterface    //This is the interface in which we have only one method.
interface DemoAnon_01{
    void method_01();
}

@FunctionalInterface    //This is the interface in which we have only one method.
interface DemoAnon_02{
    void method_02(int a);
}
