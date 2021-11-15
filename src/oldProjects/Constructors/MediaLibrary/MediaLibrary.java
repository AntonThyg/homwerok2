package oldProjects.Constructors.MediaLibrary;

import java.util.ArrayList;

public class MediaLibrary {
    public static void main(String... args){
        System.out.println("Welcome to media library.");
        Book bob = new Book(), bill, borris;
        bob.setTitle("Bob");
        bob.setFiction(false);
        bob.setPageLength(96);
        bill = new Book("Bill",69,true);
        borris = new Book("Borris",420,false);
        Movie jeffrey = new Movie(), jill, john;
        jeffrey.setFiction(true);
        jeffrey.setTitle("Jeffrey");
        jeffrey.setMinuteLength(96);
        jill = new Movie("Jill",69,true);
        john = new Movie("John",420,false);
    }
}
