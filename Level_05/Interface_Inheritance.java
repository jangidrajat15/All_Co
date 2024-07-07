/*
 * In this we learn how to use inheritance in interfaces.
 * we have to use key word "extends" while inheritaning two interfaces.
 * 
 */

public class Interface_Inheritance {
    public static void main(String[] args) {
        new_03 obj=new new_03();
        obj.method1();
        obj.method3();
    }
}

interface new_01{
    void method1();
    void method2();
}

interface new_02 extends new_01{
    void method3();
    void method4();
}

class new_03 implements new_02{
    @Override
    public void method1() {
        System.out.println("Method_01");
    }
    @Override
    public void method2() {
        System.out.println("Method_02");
    }
    @Override
    public void method3() {
        System.out.println("Method_03");
    }
    @Override
    public void method4() {
        System.out.println("Method_04");
    }

}
