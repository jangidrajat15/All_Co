public class Program_04 {
    static int Reverse(int num) {
        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
          }
          return reversed;
    }
 
    public static void main(String[] args) {
        int[] arr = {42,11,1,97};
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + Reverse(arr[j]) == arr[j] + Reverse(arr[i])){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}