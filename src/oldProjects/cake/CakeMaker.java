package oldProjects.cake;

public class CakeMaker {
    public static void main(String... args)
    {
        Cake coke = new Cake(3, 0, "Cocaine", "Drywall", false);
        Cake chocolate = new Cake(2, 6, "Chocolate", "Cream Cheese", true);
        System.out.println(coke.toString());
        System.out.println(chocolate.toString());
    }
}
