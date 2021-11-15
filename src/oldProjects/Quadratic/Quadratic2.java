//package oldProjects.Quadratic;
//
//import java.util.Scanner;
//
//public class Quadratic2 {
//    public static void main(String... args){
//        Scanner ask = new Scanner(System.in);
//        boolean isSolving = true;
//        while(isSolving){
//            System.out.println("Give me a quadratic equation (ax^2+bx+c");
//            String equation = ask.nextLine();
//            int spot = 0;
//            int varSpot = 0;
//            String[] varStrings = {"","",""};
//            while(spot<equation.length()){
//                if(equation.charAt(spot)!='x'){
//                    varStrings[varSpot]+=equation.charAt(spot);
//                    spot++;
//                }else if (equation.charAt(spot)=='x'&&varSpot!=0){
//                    varSpot++;
//                    spot++;
//                }else if(varSpot==0&&equation.charAt(spot)=='x'){
//                    varSpot++;
//                    spot+=3;
//                }
//            }
//            boolean a = Boolean.parseBoolean(varStrings[0]),b = Boolean.parseBoolean(varStrings[1]),c = Boolean.parseBoolean(varStrings[2]);
//            System.out.println("a="+a+"\nb="+b+"\nc="+c);
//            int solutions = 1;
////            if (-4 * a * c > 0) {
////                solutions++;
////            }
//            System.out.println("Your equation is " + a + "x^2+" + b + "x+" + c);
//            System.out.println("There are " + solutions + " different Solutions");
//            double quadSOlution1 = (-b + Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / (2 * a);
//            System.out.println("Solution 1 = " + quadSOlution1);
//            if (solutions == 2) {
//                double quadSolution2 = (-b - Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / (2 * a);
//                System.out.println("Solution 2 = " + quadSolution2);
//            }
//            System.out.println("Do you want to solve another equation");
//            isSolving = ask.nextBoolean();
//        }
//    }
//}
