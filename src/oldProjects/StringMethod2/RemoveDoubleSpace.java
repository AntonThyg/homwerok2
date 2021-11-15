package oldProjects.StringMethod2;

import java.util.Scanner;

public class RemoveDoubleSpace {
    public static void main(String...args){
        Scanner ask = new Scanner(System.in);
        System.out.println("Gib sentence.");
        String input = ask.nextLine();
        String output = "";
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)==' '){
                if(input.charAt(i+1)==' '){
                    i++;
                }
            }
            output+=input.charAt(i);
        }
        System.out.println(output);
    }
}
