package Level_08;

public class KeyWords_Program {
    public static void main(String[] args){
      ChildClass Obj=new ChildClass();
      // Obj.method_01(99);
      Obj.Trying();

      // if(1){       //we can't write this 
      //   System.out.println("Hello 1");
      // }else{
      //   System.out.println("Sorry");
      // }
    }
    
}

class try_001{
  int number;
  
  public try_001(){
    System.out.println("Hello i am called from parent class");
  }
  public try_001(int x){
    System.out.println("Hello i am called with x= " + x );
  }
  public void method_01(int number){
    this.number = number ;
  }
  public void Try(){
    System.out.println("Hello i am Try Method");
  }
}

class ChildClass extends try_001{
  public ChildClass(){
    // super.try();
    System.out.println("Hello i am called from child class ");
  }
  public void Trying(){
    super.Try();
    System.out.println("Helllo try from child class");
  }
}

interface Trying_01{
  int x=10;
  public abstract void method_001();
  abstract public void method_002();
}
