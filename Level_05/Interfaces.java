public class Interfaces {
    public static void main(String[] args) {
        Parent_01 P1=new child_01();
        P1.method_01();
        P1.method_02();
        // P1.method_03();   //we can't call method_03 as we have taken reference from parent_01.
        
        System.out.println();

        Parent_02 P2=new child_01();
        P2.method_03();
        // P2.method_01();P2.method_02();   //we can't call method_01 and 02 as we have taken reference from parent_02.
        
        System.out.println();

        child_01 P3=new child_01();
        P3.method_01();
        P3.method_02();
        P3.method_03();

    }
}


interface Parent_01{
    void method_01();
    void method_02();
}

interface Parent_02{
    void method_03();
}

class child_02 implements Parent_01{
    public void method_01(){
        System.out.println("Method_01");
    }

    public void method_02(){
        System.out.println("Method_02");
    }

    public void method_03(){
        System.out.println("Method_03");
    }
}

class child_01 implements Parent_01,Parent_02{
    public void method_01(){
        System.out.println("Method_01");
    }

    public void method_02(){
        System.out.println("Method_02");
    }

    public void method_03(){
        System.out.println("Method_03");
    }
}