package oldProjects.Constructors.MediaLibrary;

public class Movie {
    private String title;
    private int minuteLength;
    private boolean isFiction;
    public Movie(){
        this.title = "";
        this.minuteLength = 0;
        this.isFiction = false;
    }
    public Movie(String t, int pL, boolean iF){
        this.title = t;
        this.minuteLength = pL;
        this.isFiction = iF;
    }
    public void setTitle(String t){
        this.title=t;
    }
    public void setMinuteLength(int pL){
        this.minuteLength = pL;
    }
    public void setFiction(boolean iF){
        this.isFiction = iF;
    }
    public String getTitle(){
        return this.title;
    }
    public int getMinuteLength(){
        return  this.minuteLength;
    }
    public boolean isFiction(){
        return this.isFiction;
    }
}
