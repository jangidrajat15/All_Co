import java.util.Random;
import java.util.Scanner;

// import javax.security.auth.RefreshFailedException;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        GuessGame GG=new GuessGame();
        do{
        System.out.print("Enter a Number N between 100 and 200: ");
        GG.takeUserInput(sc.nextInt());
        GG.setNoOfGuesses(1);
        if(GG.isCorrectNumber()==1){
            System.out.println("Your number is greater then random number.");
        }else if(GG.isCorrectNumber()==2){
            System.out.println("Your number is less then random number.");
        }
        }while(GG.isCorrectNumber()!=0);
        System.out.println("-----  YOU WIN  -----");
        System.out.println("Random Number is " + GG.GetRNumber());
        System.out.print("Your Score is : " + GG.getNoOfGuesses());
        sc.close();
    }
}

class GuessGame{
    private int rNumber;
    private int uNumber;
    private int noOfGuesses=0;

    public GuessGame(){
        Random rn=new Random();
        this.rNumber=rn.nextInt(100,200);
    }

    public void setNoOfGuesses(int num){
        this.noOfGuesses+=num;
    }

    public int getNoOfGuesses(){
        return noOfGuesses;
    }

    public void takeUserInput(int Num1){
        this.uNumber=Num1;
    }

    public int isCorrectNumber(){
        if(uNumber>rNumber){
            return 1;
        }else if(uNumber<rNumber){
            return 2;
        }else{
            return 0;
        }
    }

    public int GetRNumber(){
        return rNumber;
    }
}
