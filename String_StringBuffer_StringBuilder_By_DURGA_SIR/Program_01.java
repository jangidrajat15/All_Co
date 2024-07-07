class Program_01{
    // @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) {
        // System.out.println("Hello");
        String s1 = new String("Hello");
        String s2=new String("Hello");

        System.out.println("s1 == s2 : " +  (s1 == s2));
        System.out.println("s1.euqals(s2) : " + (s1.equals(s2)));
        
        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2=new StringBuffer("Hello");

        System.out.println("sb1 == sb2 : " +  (sb1 == sb2));
        System.out.println("sb1.euqals(sb2) : " + (sb1.equals(sb2)));

        StringBuffer sb3=new StringBuffer();
        System.out.println(sb3.capacity());
        sb3.append("asdfghjklqwertyu");
        System.out.println(sb3.capacity());
        sb3.append("aa");
        System.out.println(sb3.capacity());

        // System.out.println("s1 == sb2 : " +  (s1 == s2));
        // System.out.println("sb1.euqals(s2) : " + (s1.equals(sb2)));

        return ;
    }
}