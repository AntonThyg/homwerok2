package oldProjects.WhileLoops;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args)
    {
        int amount10 = 0;
        Scanner ask = new Scanner(System.in);
        System.out.println("Enter an integer to see its digits: ");
        int number = ask.nextInt();
        ArrayList digits = new ArrayList(), digits2 = new ArrayList();
        while (number>=1){
            digits.add(number%10);
            number/=10;
        }
        for(int i=digits.size();i>0;i--){
            digits2.add(digits.toArray()[i-1]);
        }for(var n : digits2.toArray()){
            if(n.equals(1)){
                if(digits2.toArray()[digits2.indexOf(n)+1].equals(0)){
                    amount10++;
                }
            }
        }
        System.out.println("10 occurs "+amount10+" times");
    }
}
