package oldProjects.StringMethod2;

import java.util.Scanner;

public class RemoveEVeryOther {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.nextLine();
        String output = "";
        for(int i=0;i<input.length();i+=2){
            output += input.charAt(i);
        }
        System.out.println(output);
    }
}
