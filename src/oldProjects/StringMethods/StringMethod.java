package oldProjects.StringMethods;

public class StringMethod {
    public static void main(String... args){
        String cat = "cat";
        int catLength = cat.length();
        System.out.println(catLength);
        cat += " is very fat";
        catLength = cat.length();
        System.out.println(catLength);
    }
}
