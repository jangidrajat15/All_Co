package Java.Level_03;

public class Code_001 {
    public static void main(String[] args){
        System.out.println("Hello, Rajat");
        Raka x=new Rak();
        x.method_01();
        x.method_02();
        //x.method3();
    }
}

//abstract class abstract methods In this we have to make child class till we provide the logic of all the abstract methods.

abstract class Raj{
    abstract public void method1();
    abstract public void method2();
}


abstract class Raja extends Raj{
    public void method1(){
        System.out.println("Method_01 from Raja");
    }
    public void method2(){
        System.out.println("Method_02 from Raja");
    }
    abstract public void method3();
}

class Rajat extends Raja{
    public void method3(){
        System.out.println("Method_03 from rajat");
    }
}

interface Raka{
    void method_01();
    void method_02();
}

class Rak implements Raka{
    //@Override
    public void method_01() {
        System.out.println("Methos_01 from Rak");
    }
    public void method_02(){
        System.out.println("Method_02 From Rak");
    }
}