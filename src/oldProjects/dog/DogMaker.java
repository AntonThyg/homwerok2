package oldProjects.dog;

import oldProjects.dog.Dog;

public class DogMaker {
    public static void main(String... args){
        Dog myDog = new Dog("Mohammed");
        myDog.eat("steak", 1.5, 2);
        myDog.walk(1, "world trade center");
    }
}
