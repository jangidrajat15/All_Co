// // Processing Array of numbers by Rajat Jangid.

// package Placement_Codes;

// import java.util.Scanner;

// public class Program_01 {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);

        
//         System.out.print("Enter lenngth of the array: ");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         System.out.print("Enter elements: ");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         Program obj=new Program(arr);

//         //Step_01
//         obj.Step_01();
//         obj.Printarr();

//         //Step_02
//         obj.Step_02();
//         obj.Printnewarr();
        
//     }
// }

// class Program{
//     int count=0;
//     int[] arr;
//     int[] new_arr=new int[count];

//     void Program(int[] arr){
//         this.arr=arr;
//     }

//     public void Step_01(){
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//             int temp=arr[i];
//             int m,rv=0;
//             while(temp!=0){
//                 m=temp%10;
//                 rv=rv*10 + m;
//                 temp=temp/10;
//                 count++;
//             }
//             arr[i]=rv;
//         }
//     }

//     public void Step_02(){
//         Step_01();
//         // for(int i=0;i<arr.length;i++){
            
//         // }
//     }

//     public void Printarr(){
//         System.out.println("Count: " +count);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+ " ");
//         }
//     }

//     public void Printnewarr(){
//         for(int i=0;i<new_arr.length;i++){
//             System.out.print(new_arr[i]+ " ");
//         }
//     }
// }

// Processing Array of numbers.

package Placement_Codes;

import java.util.Scanner;

public class Program_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        
        System.out.print("Enter lenngth of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Program obj=new Program();
        
        //Step_01
        System.out.println("After Step_01: ");
        obj.Step_01(arr);
        obj.Printarr(arr);
        int count=obj.getCount();
        // System.out.println("Count_Main: "+count);
        int[] new_arr=new int[count];
        //Step_02
        System.out.println();
        System.out.println("After Step_02 we get: ");
        new_arr=obj.Step_02(arr);
        for(int i=0;i<new_arr.length;i++){
            if(new_arr[i]!=0){
            System.out.print(new_arr[i]+" ");
            }else{
                break;
            }
        }
        //Step_03
        System.out.println();
        System.out.println("After Step_03 we get: ");
        new_arr=obj.step_03(new_arr);
        obj.Printarr(new_arr);

        //Step_04
        System.out.println();
        System.out.println("After Step_04 we get : ");
        obj.Step_04(new_arr);
        
    }
}

class Program{
    int count=0;
    int[] arr;
    // int[] new_new_arr;

    void Program(int[] arr){
        this.arr=arr;
    }

    
    public void Step_01(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int temp=arr[i];
            int m,rv=0;
            while(temp!=0){
                m=temp%10;
                rv=rv*10 + m;
                temp=temp/10;
                count++;
            }
            arr[i]=rv;
        }
    }

    public int getCount(){
        return count;
    }

    public int[] Step_02(int[] arr){
        int[] new_arr=new int[this.count];
        Step_01(arr);
        int j=0;
        int temp;

        for(int i=0;i<arr.length;i++){
            int temp_01=arr[i];
            while(temp_01 != 0){
                temp=temp_01%10;
                if(temp!=0){
                new_arr[j++]=temp;
                }
                temp_01=temp_01/10;
            }
        }
        // new_new_arr=new_arr;
        return new_arr;
        
    }

    public int[] step_03(int[] new_arr){
        // System.out.println(count);
        int[] new_new_arr=new int[(count/2)];
        boolean falg=false;
        int p=0;
        for(int i=0;i<(new_arr.length);i++){
            falg =false;
            for(int j=0;(j<(new_new_arr.length) && new_new_arr[j]!=0);j++){
                if(new_arr[i]==new_new_arr[(j)]){
                    falg=true;
                    // int n=j;
                    // while(new_new_arr[n+1]!=0){
                    //     new_new_arr[n]=new_new_arr[n+1];
                    //     n++;
                    // }
                    
                }
            }
            if(falg==false){
                new_new_arr[p++]=new_arr[i];
                // System.out.println(new_arr[i]+" ");
            }
        }
        return new_new_arr;
        // // new_new_arr=new_arr;
        // int m;
        // System.out.println("new_Arr Length" + new_arr.length);
        // for(int i=0;i<(new_arr.length-1);i++){

            // for(int j=i+1;j<new_arr.length;){
            //     if(new_arr[i]==new_arr[j]){
            //         m=j;
            //         // System.out.println(new_arr[j]);
            //         while(new_arr[(m)]!=0){
            //             new_arr[m]=new_arr[m+1];
            //             m++;
            //             System.out.println(new_arr[m]);
            //         }   
            //     j=i+1;
            //     }else{
            //     j++;
            //     }
            // }

            // int j=i+1;
            // while(j<new_arr.length  && new_arr[j+1]!=0){
            //     if(new_arr[i]==new_arr[j]){
            //         m=j;
            //         System.out.println(new_arr[j]);
            //         while(new_arr[(m)]!=0){
            //             new_arr[m]=new_arr[m+1];
            //             m++;
            //         } 
            //         j=i+1;
            //     }else{
            //         j++;
            //     }
            // }
            // int[] new_new_arr=new int[count/2];
            // // System.out.println(count + " ");
            // int k=0;
            // for(int i=0;i<new_arr.length;i++){
            //     for(int j=0;j<new_new_arr.length;j++){
            //         if(new_arr[i]!=new_new_arr[j]){
            //             new_new_arr[k++]=new_arr[i];
            //             System.out.print(new_arr[i] + " ");
            //         }
            //     }
            // }
        //     int j=0;
        //     int n=new_arr.length;
        //     for (int i = 0; i < n - 1; i++) {
        //     if (new_arr[i] != new_arr[i + 1]) {
        //         new_arr[j++] = new_arr[i];
        //     }
        // }
 
        // new_arr[j++] = new_arr[n - 1];
 
        // return j;
        // LinkedHashSet<int> set
        //     = new LinkedHashSet<int>();
 
        // // adding elements to LinkedHashSet
        // for (int i = 0; i < new_arr.length; i++)
        //     set.add(new_arr[i]);
 
        // // Print the elements of LinkedHashSet
        // System.out.print(set);
    // }
    }
        // return new_new_arr;
    


    public void Step_04(int [] arr){
        System.out.print("Final Ans for the given problem : ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
            if(arr[i]%2==0){
                System.out.print("*");
            }else{
                System.out.print("#");
            }}else{break;}
        }
    }
    public void Printarr(int [] arr){
        // System.out.println("Count: " +count);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
            System.out.print(arr[i]+ " ");
            }
        }
    }
    
}