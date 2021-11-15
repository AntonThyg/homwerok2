package oldProjects.Constructors.MediaLibrary;

public class Song
{
    private String tital;
    private int rating;
    private double length;
    private boolean currentPopular;
    public Song()
    {
            this.tital = "";
            this.rating = 0;
            this.length = 0;
            this.currentPopular = false;
    }
    public Song(String t, int r, double l, boolean cP)
    {
        if(t!=null)
            this.tital=t;
        this.rating = r;
        this.length = l;
        this.currentPopular = cP;
    }
    //Mutators
    public void setTital(String t)
    {
        this.tital=t;
    }
    public void setRating(int r)
    {
        this.rating=r;
    }
    public void setLength(double l)
    {
        this.length=l;
    }
    public void setCurrentPopular(boolean cP)
    {
        currentPopular = cP;
    }
    //Accessors
    public String getTital()
    {
        return tital;
    }
    public int getRating()
    {
        return rating;
    }
    public double getLength()
    {
        return length;
    }
    public boolean isCurrentPopular()
    {
        return currentPopular;
    }

}
