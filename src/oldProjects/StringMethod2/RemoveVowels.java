package oldProjects.StringMethod2;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.nextLine();
        String output = "";
        char[] inputs = input.toCharArray();
        char[] vowels = {'a','e','i','o','u'};
        for(char i:inputs){
            boolean isVowel = false;
            for(char v:vowels){
                if(i==v){
                    isVowel=true;
                }
            }
            if(!isVowel){
                output+=i;
            }
        }
        System.out.println(output);

    }
}
