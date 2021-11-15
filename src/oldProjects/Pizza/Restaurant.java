package oldProjects.Pizza;

import java.util.*;

public class Restaurant {
    public static Scanner ask = new Scanner(System.in);
    public static final ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();
    public static final String[] pizzas = {
            "Pepperoni","Pepperoni Veg","Supreme","Supreme Veg","BBQ Chimken","BBQ Chimken Veg", "Chimken Bacon Ranch", "Chimken Bacon Ranch Veg"
    };
    public static void main(String... args){
        pizzaList.addAll(List.of(
                new Pizza("Pepperoni", 19.99, false, 2, new String[]{"cheese", "pepperoni"}),
                new Pizza("Pepperoni Veg", 24.99, true, 3, new String[]{"cheese", "mushroom", "tomato slice"}),
                new Pizza("Supreme", 23.99, false, 5, new String[]{"cheese","pepperoni","sausage","bacon","olive"}),
                new Pizza("Supreme Veg", 25.99, true, 5, new String[]{"Cheese","Mushroom","Tomato Slice","Olive","Vegan Chimken"}),
                new Pizza("BBQ Chimken", 29.99, false, 3, new String[]{"BBQ Sauce","Chimken","Onion"}),
                new Pizza("BBQ Chimken Veg", 32.99, true, 5, new String[]{"BBQ Sauce","Onion","Vegan Chimken"}),
                new Pizza("Chimken Bacon Ranch",32.99,false,3, new String[]{"Ranch","Chimken","Bacon"}),
                new Pizza("Chimken Bacon Ranch Veg",37.99,true,7, new String[]{"Ranch","Mushroom","Onion","Tomato","Vegan Chimken","Olive"})
        ));
        boolean isOpen = true;
        while(isOpen){
            System.out.println("what would you like to order? our items are");
            for(Pizza p: pizzaList){
                System.out.println(p.toString());
            }
            boolean isOrdering = true;
            double price = 0.0;
            ArrayList<Pizza> order = new ArrayList();
            while(isOrdering){
                System.out.println("Type the name of the pizza you'd like, or type stop when you're done ordering");
                String current = ask.nextLine();
                if(current.equals("stop")){
                    for(Pizza p: order){
                        System.out.println(p.toString());
                        if(order.indexOf(p)%2==0){
                            price+=(p.getPrice()/2);
                        }else{
                            price+=p.getPrice();
                        }
                    }
                    System.out.println("Total is "+price);
                    break;
                }else{
                    order.add(order(current));
                }
            }
            System.out.println("Is the store still open?");
            if(ask.nextLine().equals("no")){
                break;
            }
        }
    }
    public static Pizza order(String n){
        return pizzaList.get(List.of(pizzas).indexOf(n));

    }
}