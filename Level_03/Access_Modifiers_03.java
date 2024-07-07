package Java.Level_03;

import Java.Level_05.Access_Modifiers;

class test_03 extends Access_Modifiers{
    protected void print(){
        // Access_Modifiers obj_03=new Access_Modifiers();
        test_01();
        System.out.println(publicRajat);
        System.out.println(protectedRajat);

        // System.out.println();
    }
}

public class Access_Modifiers_03 {
    public static void main(String[] args) {
        // Access_Modifiers obj_02=new Access_Modifiers();
        // System.out.println(obj_02.publicRajat);
        // obj_02.test_01();  -->> test_01 is protected
        test_03 obj_03=new test_03();
        obj_03.print();

    }
}