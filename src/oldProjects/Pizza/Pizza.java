package oldProjects.Pizza;

import java.util.ArrayList;

public class Pizza {
    private String name;
    private double price;
    private Boolean isVegetarian;
    private int numToppings;
    private ArrayList<String> toppings = new ArrayList();
    public Pizza(){
        this.price=0.0;
        this.numToppings=0;
    }
    public Pizza(String n){
        this.name=n;
        this.price=0.0;
        this.numToppings=0;
    }
    public Pizza(String n, double p, Boolean v, int nT){
        this.name=n;
        this.price=p;
        this.isVegetarian =v;
        this.numToppings=nT;
    }
    public Pizza(String n, double p, Boolean v, int nT, String[] topping){
        this.name=n;
        this.price=p;
        this.isVegetarian =v;
        this.numToppings=nT;
        for(String t: topping){
            toppings.add(t);
        }
    }

    public String toString(){
        return "name"+this.name+"\nprice:"+this.price+"\nvegetarian"+this.isVegetarian+"\ntoppings"+this.numToppings+"\n";
    }
    //setters
    public void setName(String n){
        this.name=n;
    }
    public void setPrice(double p){
        this.price=p;
    }
    public void setIsVegetarian(Boolean iV){
        this.isVegetarian=iV;
    }
    public void setNumToppings(int nT){
        this.numToppings=nT;
    }
    public void addToppings(String topping){
        toppings.add(topping);
        price += 1.10;
    }
    public void removeToppings(String topping){
        toppings.remove(topping);

    }
    //getters
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public Boolean getIsVegetarian(){
        return isVegetarian;
    }
    public int getNumToppings(){
        return numToppings;
    }
    public ArrayList<String> getToppings(){
        return toppings;
    }

}
