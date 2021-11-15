package oldProjects.WhileLoops;

import java.util.ArrayList;
import java.util.Scanner;

public class MinMaxList {
    public static void main(String... args){

        Scanner ask = new Scanner(System.in);
        ArrayList<Integer> duhNumbers = new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            System.out.println("gib number");
            duhNumbers.add(ask.nextInt());
        }
        int max=0;
        int min=Integer.MAX_VALUE;
        for(var n:duhNumbers.toArray()){
            if((int)n>max){
                max = (int)n;
            }if((int)n<min){
                min = (int)n;
            }
        }
        System.out.println("Max is "+max+"\n Min is "+min);
    }
}
