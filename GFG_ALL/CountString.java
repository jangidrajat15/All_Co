//Given a length n, count the number of strings of length n that can be made using a, b and c with at-most one b and two c allowed.

package GFG_ALL;

import java.util.Scanner;

public class CountString {
    public static long countStr(long n){
        //complete the function here
            long count=0;
            // count++;                       // for only a
            // count+=(2*n);                  // for only b and only c
            // count+=((n*(n-1))/2);          // for for 2 times c
            // count+=(n*(n-1));              // for one b and one c      
            // count+=((n*(n-1)*(n-2))/2);    // for one b and 2 c
            count=(((n*n*n)+(3*n)+2)/2);
            return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of the string n: ");
        long n=sc.nextInt();
        System.out.println("Possible number of strings are : " + countStr(n));
        sc.close();
    }
}
