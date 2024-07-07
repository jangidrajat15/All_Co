
public class Library_01 {
    public static void main(String[] args) {
        System.out.println("Library:");
        Library Lb=new Library();
        Lb.issueBook(5);
        Lb.addBook(3);
        Lb.returnBook(5);
        Lb.issueBook(5);
    }
}

class Library{
    int[] arr=new int[10];
    Library(){
    // int[] arr=new int[10];
    for(int i=0;i<10;i++){
        arr[i]=1;
    }
    }
    void addBook(int i){
        arr[i]+=1;
        System.out.println("Book with index " + i +" added to Library.");
    }
    void issueBook(int i){
        if(arr[i]>=1){
            arr[i]-=1;
            System.out.println("Book with index " + i+ " Issued from library.");
        }else{
            System.out.println("Book is not available in Library.");
        }
    }
    void returnBook(int i){
        arr[i]+=1;
        System.out.println("Book with index "+ i +" Returned to Library.");
    }
}