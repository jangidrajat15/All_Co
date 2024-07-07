package Java.Level_10;

public class AnonymousClass {
    public static void main(String[] args) {
        //we can use Anonymous Classes when we want any object for one time only.
        DemoAnon obj=new DemoAnon(){
            @Override
            public void method_01(){
                System.out.println("Hello i am Method_01...");
            }
            public void method_02(){
                System.out.println("Hello i am Method_02.");
            }
        };

        obj.method_01();        //Now we directly call methods by this obj.
        obj.method_02();        //So in this type of cases we can't have to make new class only for this purpose.
        DemoAnon_03 obj_01=new DemoAnon_03() {
            public void method_001(){
                System.out.println("Hello i am method_001 overrided by Anonymous class.");
            }
        };
        obj_01.method_001();

        //Checking for access modifiers in any method
        new_001 new_obj=new new_001();
        new_obj.Method_01(1000);
    }
}

interface DemoAnon{
    void method_01();
    void method_02();
}

abstract class DemoAnon_03{
    abstract void method_001();
}

class new_001{
    public void Method_01(int n){
        int num1=n;
        System.out.println("Hello you know we have num1= " + num1 +" in this method_01.");
    }
}
