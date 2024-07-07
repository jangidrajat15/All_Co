//Using sleep(40) for 40 millisecond.

package Level_09;

public class Thread_005 {
    static public void main(String[] args) {
        // thr_006 T6=new thr_006();
        // thr_007 T7=new thr_007();
        // T6.start();
        // T7.start();
        
        //For Static nested classes
        // Outer_01.innerClass_01 obj_01=new Outer_01.innerClass_01();
        // Outer_01.innerClass_01.innerClass_04 obj_02=obj_01.new innerClass_04();
        // obj_02.method_04();

        //For non_Static nested Classes(inner classes)
        Outer_02 obj_02=new Outer_02();
        Outer_02.innerClass_02 obj_01_01=obj_02.new innerClass_02();
        obj_01_01.method_02();
        // // Outer_02.innerClass_02 obj_02=obj_02.new Outer_02.innerClass_02();
        // Outer_02.innerClass_02.innerClass_03 obj_02=obj_01_01.new innerClass_03();
        // obj_02.method_03();

        // rajat.rajat_01.innerClass obj=new rajat.rajat_01.innerClass();
        // obj.method_01_01_01();
        // new_C1.innerClass obj=new new_C1.innerClass();
        // obj.method_01_01_01();

        //Anonymous Classes
        // Outer_01 obj_01=new Outer_01();
        // obj_01.method_Anonymous();
    }
}

class thr_006 extends Thread{
    public void run(){
        int i=0;
        while (i<20) {
        i++;    
        System.out.println("Hello..............");
        try{
            sleep(4);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Hi_11111");
            System.out.println("Hi_22222");
            // break;
            System.out.println("Hi_33333");
            System.out.println("Hi_44444");

        }
        }
    }
} 

class thr_007 extends Thread{
    public void run(){
        int j=0;
        while(j<300){
            j++;
            System.out.println("Hi...");
        }
    }
}

// interface rajat{
//     interface raja{
//         void method_0111();
//     }
//     class rajat_01 implements raja{
//         public void method_0111(){
//             System.out.println("Ohkk Tested");
//         }
//     }
// }

class Outer_01{
        // class {
        //     public void method_Anonymous(){
        //         System.out.println("Hello From Anonymous Class.");
        //     }
        // }
        static class innerClass_01{
             class innerClass_04{
                public void method_04(){
                    System.out.println("Hell0 From Method_04");
                }
            }
            public void method_01(){
                System.out.println("Inner Class Method_01");
            }
        }
}

class Outer_02{
        class innerClass_02{
            public void method_02(){
                System.out.println("Inner Class Method_02");
            }
            class innerClass_03{
                public void method_03(){
                    System.out.println("Hello from Method_03");
                }
            }
        }
}

