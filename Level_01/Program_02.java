public class Program_02 {
    public static void main(String[] args) {
        System.out.println("Hello");
        for(int i=0;i<10;i++){
            if(i%2==0){
                if(i!=4){
                    System.out.println("Not Breaked");
                }else{
                    System.out.println("Breaked");
                    // break;
                }
            }
            if(i==7){
                System.out.println("Breaked");
                break;
                // continue;
            }
            System.out.println(i+" ");
        }
    }
}
