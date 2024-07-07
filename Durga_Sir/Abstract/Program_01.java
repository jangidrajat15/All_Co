class Program_001{
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}

abstract class Vehical{
    public abstract int getWheels();
    public abstract int getWindows();
}

abstract class car extends Vehical{
    public int getWheels(){
        return 4;
    }
}

class bus extends Vehical{
    public int getWindows(){
        return 10;
    }
    public int getWheels(){
        return 6;
    }
}
