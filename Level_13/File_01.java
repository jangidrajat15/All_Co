package Level_13;

import java.io.File;
import java.io.FileWriter;
// import java.util.Scanner;

public class File_01 {
    public static void main(String[] args) {
        int count=0;
        int word=0;
        int wordcount=0;
        try{
        File file=new File("All_File_Handling");
        FileWriter newfile =new FileWriter("New_to_copy");
        
        java.util.Scanner sc=new java.util.Scanner(file);
        while(sc.hasNextLine()){
            String S=sc.nextLine();
            String[] word_01=S.split("\\s+");
            wordcount+=word_01.length;
            newfile.write(S + '\n');
            count++;
        }
        newfile.close();
        sc.close();
        System.out.println("Count: "+ count + " and Word: " + (word) + "  WordCount : " + wordcount);
        }catch(Exception e){
        System.out.println(e.getMessage());
        }
    }
}

 // for(int i=0;i<(S.length()-1);i++){
            //     if(i==0 && !S.isEmpty()){
            //         word++;
            //     }
            //     if(S.charAt(i) != ' ' && S.charAt(i+1) == ' '){
            //         word++;
            //     }
            // }