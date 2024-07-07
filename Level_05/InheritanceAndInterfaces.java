/*
 * In this we learn about interface and inheritance both together
 * we can make default and private methods in interfaces.
 * Default method can be overrided from the implimented class.
 * private method can't be used anywhere else only used in that interface(if code is very lengthy)
 * In this we learn how to extands and impliments a class at the same time.
 * As we know multiple inheritance is not allowed in java.
 * 
 */



public class InheritanceAndInterfaces {
    public static void main(String[] args) {
        MySelfPhone MSP1=new MySelfPhone();
        MSP1.recordIn4k();
        String[] ans=MSP1.getNetworks();
        for(String ele:ans){
            System.out.println(ele + " ");
        }
        MSP1.callNumber(978580);
    }
}

class MyCellPhone{
    void callNumber(int num){
        System.out.println("Calling "+ num);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

interface MyCamera{
    void takeSnap();
    void recordVideo();

    private void greet(){                     //we can't use it in MySelfPhone and anywhere else also. we only use this in the same class for lengthy code only.
        System.out.println("Hello ...\nGood Morning");
    }

    default void recordIn4k(){                 //In interface we can use default method also.
        greet();
        System.out.println("Recording in 4K");
    }
}

class MySelfPhone extends MyCellPhone implements MyCamera,MyWifi{
    // public void recordIn4k(){                 //we can override default method also.
    //     System.out.println("Recording in 4k by MySelfPhone");
    // }
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Recording....");
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting... to " + network);
    }
    public String[] getNetworks(){
        System.out.println("Getting the networks:.....");
        String[] list={"Rajat_01","Rajat_02","Rajat_03"};
        return list;
    }
}