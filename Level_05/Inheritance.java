//Inheritance all

public class Inheritance {
    public static void main(String[] args) {
        // Base_01 B1=new Base_01();
        // derived_01 d1=new derived_01(8);   //when we call derived class then constructor from base class is first called then from the derived class.
        //derived_02 d2=new derived_02(3,4,5);  

    }
}

class Base_01{
    int x;

    public Base_01(){
        System.out.println("I am constructor in Base_01");
    }

    public Base_01(int x){
        System.out.println("I am constructor in base class with x: " + x);
    }
    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x=x;
    }

}

class derived_01 extends Base_01{
    int y;

    public derived_01(){
        super(4);
        System.out.println("I am constructor in derived class");
    }

    public derived_01(int y,int z){
        super(y);   //used for calling overloaded constructor from base class.
        System.out.println("I am constructor in derived class with y,z: " + y +"," + z);
    }

    public void setY(int y){
        this.y=y;
    }

    public int getY(){
        return y;
    }

}

class derived_02 extends derived_01{
    public derived_02(){
        System.out.println("I am constructor from derived_02 class");
    }

    public derived_02(int x,int y,int z){
        super(y,z);
        System.out.println("I am constructor from derived_02 class with x,y,z: " + x + "," + y + "," + z);
    }
}