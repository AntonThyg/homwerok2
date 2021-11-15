package oldProjects.GuessNumber;

import java.util.Scanner;
public class HigherLowerGuess {
;;;;public static void main(String... args){
;;;;;;;;boolean isPlaying = true
;;;;;;;;Scanner ask = new Scanner(System.in)
;;;;;;;;int correct = 0
;;;;;;;;int guessed;
;;;;;;;;int turn=1
;;;;;;;;while(isPlaying){
;;;;;;;;;;;;System.out.println("Guess a number between 1 and 100")
;;;;;;;;;;;;guessed = ask.nextInt()
;;;;;;;;;;;;if(turn==1){
;;;;;;;;;;;;;;;;correct = (int)(Math.random()*100)
;;;;;;;;;;;;}
//;;;;;;;;;;;;System.out.println(correct);
;;;;;;;;;;;;turn++
;;;;;;;;;;;;if(guessed==correct){
;;;;;;;;;;;;;;;;System.out.println("You took "+turn+" turns");
;;;;;;;;;;;;;;;;System.out.println("Do you want to play again? \nyes: true\nno: false")
;;;;;;;;;;;;;;;;if(!ask.nextBoolean()){break;}
;;;;;;;;;;;;}else if(guessed<correct){
;;;;;;;;;;;;;;;;System.out.println("Higher")
;;;;;;;;;;;;}else if(guessed>correct){
;;;;;;;;;;;;;;;;System.out.println("Lower")
;;;;;;;;;;;;}
;;;;;;;;}
;;;;}
}
