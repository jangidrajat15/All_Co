package Java.Level_05;

public class VarArgs_01 {
    static int Sum(int ...Arr){
        int result=0;
        for(int a:Arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Sum(2,3));
        System.out.println(Sum(2,3,5));
        System.out.println(Sum(2,5,8,9));
    }
}
