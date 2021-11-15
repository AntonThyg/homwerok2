package oldProjects.StringMethods;

public class WrapperPractice {
    public static void main(String... args){
        Integer kanyeSouth = new Integer(44);
        Double kanyeSouthIn6Months = new Double(kanyeSouth + 0.5);
        System.out.println("Kanye South is "+kanyeSouth.intValue());
        System.out.println("In 6 months Kanye South will be "+kanyeSouthIn6Months.doubleValue());
    }
}
