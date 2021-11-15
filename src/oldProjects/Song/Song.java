package oldProjects.Song;

public class Song {
    public static void main(String... args) {

        String lines[] = {
                new String("Donda, Donda, Donda"),
                "Donda, Donda, Donda, Donda, Donda, Donda, Donda, Donda, Donda, Donda,",
                "Donda, Donda, Donda, Donda, Donda, Donda,",
                "Donda, Donda, Donda, Donda, Donda, Donda, Donda,",
                "Donda, Donda, Donda, Donda, Donda,",
                "Donda, Donda, Donda, Donda, Donda, Donda,",
                "Donda, Donda, Donda, Donda",
                "Donda, Donda, Donda, Donda",
                "Donda, Donda, Donda, Donda, Donda, Donda, Donda,",
                "Donda, Donda, Donda, Donda, Donda, Donda, Donda,",
                "Don" + "da,"
        };
        for(int i=0;i<lines.length;i++){
            System.out.print(lines[i]+"\n");
        }
    }

}
