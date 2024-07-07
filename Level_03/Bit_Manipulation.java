import java.util.Scanner;

public class Bit_Manipulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your NUmber: ");
        int num1=sc.nextInt();
        //Code for Converting given integer to binary
        //Method_01  ---> Time Complexity O(log(n)) and Space Complexity O(1)

        // int bnum1=1;
        // int temp=num1;

        // while(temp>0){
        //     int r=temp%2;
        //     bnum1 = bnum1*10 + r;
        //     temp = temp/2;
        // }
        // bnum1=bnum1/10;
        // System.out.println("Given number in binary number is : " + bnum1);

        //Method_02  ---> Time Complexity O(1) and Space Complexity O(1)

        String str="";
        for(int i=31;i>=0;i--){
            int x=num1>>i;
            // System.out.println("X:"+x+" at i: "+i);
            if((x & 1)>0){
                // System.out.println("1");
                str=str.concat("1");
            }else{
                // System.out.println("0");
                str=str.concat("0");
            }
        }
        System.out.println("Binary Number is : "+ Integer.parseInt(str));
        

        //Code for getting bit at given index

        // System.out.println("Enter index for which you have to get bit:");
        // int idx1=sc.nextInt();

        // int temp1=1<<idx1;
        // if((num1 & temp1) == 0 ){
        //     System.out.println("Bit at given index "+idx1+" is 0.");
        // }else{
        //     System.out.println("Bit at given index "+idx1+" is 1.");
        // }


        //Now Code for setting bit at given index to 1
        System.out.println("Enter Index: ");
        int idx2=sc.nextInt();
        int temp2=1<<idx2;
        num1=num1 | temp2;
        System.out.println("After setting bit: "+num1);

        return ;
    }
}
