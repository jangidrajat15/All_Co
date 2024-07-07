//Strings in java.

package Java.Level_02;

public class code_10 {
    public static void main(String[] args) {
        //Making a simple string 
        String name=new String("  Rajat ");
        System.out.println(name);
        //String is immutable in java.
        
        //Methods used in String 
        //1. name.length()
        System.out.println(name.length());

        //2. name.toLowerCase()
        System.out.println(name.toLowerCase());

        //3. name.toUpperCase()
        System.out.println(name.toUpperCase());

        //4. name.trim()  --> Remove all the spaces from starting and ending in the string.
        System.out.println(name.trim());

        //5. name.subString()
        System.out.println(name.substring(4));

        //6. name.subString(beginIndex,endIndex); startIndex is included and endIndex is excluded
        System.out.println(name.substring(3, 6));

        //7. name.replace('R','A') -> return a new string after changing the latter.
        System.out.println(name.replace('a', 'A'));
        //System.out.println(name.replace("aj", "R")); //-->For changing a part of String

        //8. name.startsWith('R');
        System.out.println(name.startsWith("  Ra"));

        //9. name.endsWith(' ');
        System.out.println(name.endsWith("t "));

        //10. name.charAt(index);
        System.out.println(name.charAt(4));

        //11. name.indexOf('a');  --> we can search for character and string also.
        System.out.println(name.indexOf('R'));
        System.out.println(name.indexOf('a', 4)); //we can ignore upto index 3 and start finding from index 4.

        //12. name.lastIndexOf('a'); 
        System.out.println(name.lastIndexOf('a'));

        //13. name.equals("Chetan");
        System.out.println(name.equals("  Rajat "));

        //14. name.equalsIgnoreCase();
        System.out.println(name.equalsIgnoreCase("  rajat "));

        //Escape Sequence Characters.
        //i.e. if we want to print " in the String then we use \" and for many more like \\,\n,\t,\' etc.
        System.out.println("Hello my we are Printing Escape Sequence \f ,\\ , \" ,\t,\' etc");
    
    }
}
