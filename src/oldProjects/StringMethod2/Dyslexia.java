package oldProjects.StringMethod2;

import java.util.ArrayList;
import java.util.Scanner;

public class
Dyslexia {
    public static void main(String... args){
        Scanner ask = new Scanner(System.in);
        System.out.println("Gib words");
        String input = ask.nextLine();
        String output = "";
        char[] swapped = {'p','q','d','b'};
        char[] swap = {'q','p','b','d'};
        for(int i=0;i<input.length();i++){
            for(int o=0;o<swap.length;o++){
                if(swap[o]==input.charAt(i)){
                    output+=swapped[o];
                    i++;
                    break;
                }
            }
            output+=input.charAt(i);
        }
        System.out.println(output);
    }
}
