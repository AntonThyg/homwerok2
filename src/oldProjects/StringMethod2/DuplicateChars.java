package oldProjects.StringMethod2;
import java.util.Scanner;
public class DuplicateChars {
    public static void main(String... args){
        Scanner ask = new Scanner(System.in);
        char[] input = ask.nextLine().toCharArray();
        String output = "";
        for(int i=0;i<input.length;i++){
            for(int o=0;o<input.length;o++){
                if(o!=i){
                    if(input[i]==input[o]){
                        output+=input[i];
                    }
                }
            }
        }
        System.out.println(output);
    }
}
