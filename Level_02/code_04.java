package Java.Level_02;

public class code_04 {
    public static void main(String[] arg){
        System.out.println("Hello");
        all2 x=new all2();
        x.display1();
        x.display2();
        x.display3();
    }
}

class all1{
    public void display1(){
        System.out.println("display1 from all1");
    }
    public void display2(){
        System.out.println("Display2 from all1");
    }
}
class all2 extends all1{
    public void display2(){
        System.out.println("Display2 from all2");
    }
    public void display3(){
        System.out.println("Display3 from all2");
    }
}