package oldProjects.MadLib;

import java.util.ArrayList;
import java.util.Scanner;

public class MadLib {
    public static void main(String... args){
        Scanner ask = new Scanner(System.in);
        final String[] attribs = {
                "verb",
                "adjective",
                "noun in past tense",
                "plural noun",
                "noun",
                "proper noun",
                "verb",
                "noun",
                "medical condition",
                "facility",
                "verb",
                "verb",
                "color",
                "place",
                "time of day",
                "verb",
                "noun",
                "gender",
                "verb",
                "noun",
                "verb",
                "thing to say",
                "thing to say",
                "medical condition",
        };
        String[] attribNames = {
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
        };
        for(int i=0;i<attribs.length;i++){
            System.out.printf("Give me a %s%n",attribs[i]);
            attribNames[i] = ask.nextLine();
        }

        String[] lyrics = {
                String.format("I'm %sing' in that 21st century",attribNames[0]),
                String.format("Doing something %s to it",attribNames[1]),
                String.format("Do it better than anybody you ever %s do it",attribNames[2]),
                String.format("Screams from the %s, got a nice ring to it",attribNames[3]),
                String.format("I guess every superhero need his theme %s",attribNames[4]),
                String.format("No one %s should have all that power",attribNames[5]),
                String.format("The clock's ticking', I just %s the hours",attribNames[6]),
                String.format("Stop tripping', I'm tripping' off the %s",attribNames[7]),
                String.format("(21st century %s man)",attribNames[8]),
                String.format("The system broken, the %s's closed, the prisons open",attribNames[9]),
                String.format("We ain't got nothing' to %s, ma' fucka', we rolling",attribNames[10]),
                String.format("Huh? Ma'fucka', we %sin'",attribNames[11]),
                String.format("With some %s girls and some Kelly Rowlands",attribNames[12]),
                String.format("In this white man's %s, we the ones chosen",attribNames[13]),
                String.format("So goodnight, cruel world, I see you in the %s",attribNames[14]),
                String.format("Huh? I'll %s you in the mornin'",attribNames[15]),
                String.format("This is way too much, I need a %s",attribNames[16]),
                String.format("No one man should %s all that power",attribNames[17]),
                String.format("The %s's tickin', I just count the hours",attribNames[18]),
                String.format("Stop trippin' I'm %sin' off the power",attribNames[19]),
                String.format("'Til then, %s that, the world's ours",attribNames[20]),
                String.format("And then they say (%s) and then they say",attribNames[21]),
                String.format("And then they say (%s) and then they say",attribNames[22]),
                String.format("And then they say (hey) and then they say (21st century %s man)",attribNames[23])
        };
        for (String lyric : lyrics) {
            System.out.println(lyric);
        }
    }

    }

