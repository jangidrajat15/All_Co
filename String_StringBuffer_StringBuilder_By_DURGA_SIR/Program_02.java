public class Program_02 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        //1. Empty Constructor
        StringBuffer sb1=new StringBuffer();
        System.out.println(sb1.capacity());

        //2. With Given Capacity
        StringBuffer sb2=new StringBuffer(100);
        System.out.println(sb2.capacity());

        
    }
}
