package Java.Level_02;

//String Builder 

public class code_06 {
    public static void main(String arg[]){
        StringBuilder sb= new StringBuilder("Hello");
        System.out.println(sb);

        //To print character at any index
        System.out.println(sb.charAt(0));

        //To change character at any index 
        sb.setCharAt(0, 'h');

        //To add character at any position
        sb.insert(1,'H');
        
        //To delete character from any index
        sb.delete(1, sb.length());

        //To add character in the end of the string (i.e. appending the character)
        sb.append('e');
        sb.append('l');
        sb.append('l');
        sb.append('o');


        System.out.println(sb);
    }
}