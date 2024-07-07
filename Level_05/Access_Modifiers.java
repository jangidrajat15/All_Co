package Java.Level_05;

public class Access_Modifiers {
    public int publicRajat=10;
    protected int protectedRajat=20;
    int defaultRajat=30;
    private int privateRajat=40;

    public void test_01(){
        System.out.println(publicRajat);
        System.out.println(protectedRajat);
        System.out.println(defaultRajat);
        System.out.println(privateRajat);
    }
    public static void main(String[] args) {
        // check_01 obj=new check_01();
        Access_Modifiers obj=new Access_Modifiers();
        obj.test_01();
        System.out.println("Hello");
    }
}

// class check_01{
//     public int publicRajat=10;
//     protected int protectedRajat=20;
//     int defaultRajat=30;
//     private int privateRajat=40;

//     public void test_01(){
//         System.out.println(publicRajat);
//         System.out.println(protectedRajat);
//         System.out.println(defaultRajat);
//         System.out.println(privateRajat);
//     }

//     public void test_02(){
//         test_01();
//     }
// }