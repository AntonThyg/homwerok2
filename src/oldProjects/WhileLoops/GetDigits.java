package oldProjects.WhileLoops;/*
 * Activity 2.4.1
 */
import java.util.ArrayList;
import java.util.Scanner;

public class GetDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer to see its digits: ");
        int number = sc.nextInt();
        ArrayList digits = new ArrayList();
        while (number>=1){
            number/=10;
        }
    }
}