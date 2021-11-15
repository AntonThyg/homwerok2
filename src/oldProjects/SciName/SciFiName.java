package oldProjects.SciName;

import java.util.Scanner;

public class SciFiName {
    public static void main(String... args){
        Scanner ask = new Scanner(System.in);
        System.out.println("What is your name?");
        String fName = ask.nextLine();

        System.out.println("What is your last name?");
        String lName = ask.nextLine();

        String sciFName = fName.substring(0,2)+lName.substring(lName.length()-3);

        System.out.println("what city were you born in?");
        String birthCity = ask.nextLine();

        System.out.println("What elementary school did you attend");
        String eSchool = ask.nextLine();

        String sciLName = birthCity.substring(0,1)+eSchool.substring(0,2);

        System.out.println("What is your sibling's name");
        String sName = ask.nextLine();

        System.out.println("What is your friend or pet's name?");
        String pName = ask.nextLine();

        String planetOrigin = sName.substring((int)(Math.random()*sName.length())-1)+pName.substring((int)(Math.random()*pName.length())-1);

        System.out.println(sciFName + " " + sciLName + " " + planetOrigin);
        System.out.println(pName.substring(0));

    }
}
