
import java.io.*;

public class Q9b{
	public static void main(String[] args){
		String str1="Experiment_01";
		String str2="Experiment_02";
		int line=0;	
		int word=0;
		try(BufferedReader br=new BufferedReader(new FileReader(str1));
		    BufferedWriter bw=new BufferedWriter(new FileWriter(str2))){
		String str;
		
		while((str=br.readLine())!=null){
		line++;
		String[] word_01=str.split("\\s+");
		word+=word_01.length;
		bw.write(str);
		bw.newLine();
		
		}
		
		}catch(IOException e){
		System.out.println(e.getMessage());
		}
		System.out.println("Number of Lines: " + line + "\n");
		System.out.println("Number of Words: " + word + "\n");
	}
}