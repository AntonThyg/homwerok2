package oldProjects.StringMethod2;

import java.util.ArrayList;
import java.util.Scanner;

public class Anagrams {
    public static void main(String... args){
        Scanner ask = new Scanner(System.in);
        System.out.println("Give me 2 words");
        ArrayList<char[]> inputs = new ArrayList<>();
        inputs.add(ask.nextLine().toCharArray());
        String input2 = ask.nextLine();
        boolean isAnagram = true;
        for(int i=0;i<input2.length();i++){
            if(!inputs.contains(input2.charAt(i))){
                isAnagram=false;
                break;
            }
        }
        if(inputs.toArray().toString().equals(input2)){
            isAnagram = false;
        }
        if(isAnagram){
            System.out.println("Dis an anagram");
        }else{
            System.out.println("Dis not an anagram :C");
        }
    }
}
