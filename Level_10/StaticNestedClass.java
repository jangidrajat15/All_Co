package Java.Level_10;

import javax.swing.text.html.StyleSheet;

public class StaticNestedClass {
    public static int data=0;
    static class outer_01{
        static int num1=10;
        static void method_001(){
            System.out.println("Hello you have NUM1= "+ data);
        }
    }
    public static void main(String[] args) {
        // StaticNestedClass obj=new StaticNestedClass();
        // StaticNestedClass.outer_01 obj_01=obj.new outer_01();
        // obj_01.method_001();

        outer_01.method_001();
        new_12 obj=new new_12();
        // obj.method_12();
        obj.method_122();
    }
}

class new_011{
    static public void methos_001(){
        System.out.println("Hello from new_011 class");
    }
}

interface new_110{
    // int r=1;
    int r=1;
    void method_122();
    
    // class new_001{
    //     void method_12(){
    //         System.out.println("Hell0");
    //     }
    // }
}


class new_12 implements new_110{
    public void method_122(){
        System.out.println("Hii");
    }
    // public void method_12(){
    //     System.out.println("Hello from new implement class");
    // }
}