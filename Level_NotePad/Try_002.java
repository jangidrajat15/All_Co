
// import Java.Level_NotePad.*;

public class Try_002 {
    public static void main(String[] args) {
        // rajat.raja obj=new rajat.raja();
        // obj.method_01_01();
        System.out.println("Helloo");
        raja obj=new raja();
        obj.method_01();
    }
}

class rajat{
    // private class raja{
    //     public void method_01_01(){
    //         System.out.println("Private method_01_01.....");
    //     }
    // }
    public void method_01(){
        System.out.println("Hello...");
    }
}

class raja extends rajat{
    public void method_01(int x){
        System.out.println("Hello overloaded with x= " + x);
    }
}