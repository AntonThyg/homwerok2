package oldProjects.WhileLoops;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FortuneTeller {
    public static void main(String... args){
        Scanner ask = new Scanner(System.in);
        String[] options = {
                "You are going to suffer bery painful death",
                "YOu have depression",
                "You have a sleep paralysis demon",
                "Donda, donda, donda, donda"
        };
        boolean playing = true;
        boolean isEven=true;
        while(playing){
            System.out.println("Give me a color");
            int spin1 = ask.nextLine().length();
            if (spin1%2==0){
                isEven=true;
                System.out.println("Pick a number: \n 1, 2, 5, 6");
            }else if(spin1%2==1){
                isEven=false;
                System.out.println("Pick a number: \n 3, 4, 7, 8");
            }
            int choice = ask.nextInt();
            if(isEven && choice==1 || choice==2){
                System.out.println(options[0]);
            }else if(isEven && choice==5 || choice==6){
                System.out.println(options[1]);
            }else if(!isEven && choice==3 || choice==4){
                System.out.println(options[2]);
            }else if(!isEven && choice==7 || choice==8){
                System.out.println(options[3]);
            }else{
                System.out.println("Error 404, try again.");
            }
            System.out.println("Do you want to play again? \n true / false");
            playing = ask.nextBoolean();
        }
    }
}
