package oldProjects.Constructors.MediaLibrary;

public class Book {
    private String title;
    private int pageLength;
    private boolean isFiction;
    public Book(){
        this.title = "";
        this.pageLength = 0;
        this.isFiction = false;
    }
    public Book(String t, int pL, boolean iF){
        this.title = t;
        this.pageLength = pL;
        this.isFiction = iF;
    }
    public void setTitle(String t){
        this.title=t;
    }
    public void setPageLength(int pL){
        this.pageLength = pL;
    }
    public void setFiction(boolean iF){
        this.isFiction = iF;
    }
    public String getTitle(){
        return this.title;
    }
    public int getPageLength(){
        return  this.pageLength;
    }
    public boolean isFiction(){
        return this.isFiction;
    }
}
