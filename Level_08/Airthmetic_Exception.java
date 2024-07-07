package Level_08;


public class Airthmetic_Exception {
    public static void main(String[] args) {
        try {
            int res=divide(5,0);
            System.out.println("Result = "+res);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error "+e.getMessage());
        }
    }
    public static int divide(int a,int b)
    {
        if(b==0)
        {
            throw new ArithmeticException("Can't divide by zero");
        }
        else{
            return a/b;
        }
    }
}
