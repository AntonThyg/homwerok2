package oldProjects.Quadratic;

import java.util.Scanner;

public class Quadratic {
    public static void main(String... args){
        Scanner ask = new Scanner(System.in);
        boolean isSolving = true;
        while (isSolving) {
            int solutions = 1;
            System.out.println("A=");
            double a = ask.nextInt();
            System.out.println("B=");
            double b = ask.nextInt();
            System.out.println("C=");
            double c = ask.nextInt();
            if (-4 * a * c > 0) {
                solutions++;
            }
            System.out.println("Your equation is " + a + "x^2+" + b + "x+" + c);
            System.out.println("There are " + solutions + " different Solutions");
            double quadSOlution1 = (-b + Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / (2 * a);
            System.out.println("Solution 1 = " + quadSOlution1);
            if (solutions == 2) {
                double quadSolution2 = (-b - Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / (2 * a);
                System.out.println("Solution 2 = " + quadSolution2);
            }
            System.out.println("Do you want to solve another equation");
            isSolving = ask.nextBoolean();
        }
    }
}
