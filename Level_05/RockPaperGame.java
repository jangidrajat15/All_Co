//Rock ,paper , scissors game code
//let 0 -> rock
//    1 -> paper
//    2 -> scissors

package Java.Level_05;

import java.util.Random;
import java.util.Scanner;

public class RockPaperGame {
    public static void main(String[] args) {
        Game_01 G=new Game_01();
        Scanner sc=new Scanner(System.in);
        System.out.println("------Starting Game------");
        System.out.println("Enter    0 for rock \n\t 1 for paper \n\t 2 for scissors");
        G.setInputNumber(sc.nextInt());
        G.resultGame();
        sc.close();
    }
}

//let 0 -> rock
//    1 -> paper
//    2 -> scissors

class Game_01{
    int RandomNumber;
    int InputNumber;

    public Game_01(){
        Random rn=new Random();
        RandomNumber=rn.nextInt(3);
    }

    // public int getRandomNumber(){
    //     Random rn=new Random();
    //     RandomNumber=rn.nextInt(3);
    //     return RandomNumber;
    // }
    public void setInputNumber(int x){
        InputNumber=x;
    }

    public void resultGame(){
        if(RandomNumber==InputNumber){
            System.out.println("Draw");
        }else if((InputNumber==0 && RandomNumber==2) || (InputNumber==1 && RandomNumber==0) ||(InputNumber==2 && RandomNumber==1)){
            System.out.println("You Win the Game");
        }else{
            System.out.println("You loss the Game");
        }
        System.out.print("Computer input is : ");
        if(RandomNumber==0){
            System.out.println("Rock");
        }else if(RandomNumber==1){
            System.out.println("Paper");
        }else{
            System.out.println("Scissors");
        }
    }
}