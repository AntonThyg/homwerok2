package oldProjects.cake;

public class Cake {

    private int tiers;
    private int candleCount;
    private String cakeFlavor;
    private String frostingFlavor;
    private boolean hasSprinkles;

    public Cake(){
        tiers = 1;
        candleCount = 0;
        cakeFlavor = "";
        frostingFlavor = "";
        hasSprinkles = false;
    }

    public Cake(int t, int cC, String cF, String fF, boolean hS)
    {
        tiers = t;
        candleCount = cC;
        cakeFlavor = cF;
        frostingFlavor = fF;
        hasSprinkles = hS;
    }

    public String toString(){
        return
                "tiers: "+Integer.toString(tiers)+", candleCount: "+Integer.toString(candleCount)+
                        ", cakeFlavor: "+cakeFlavor+", frostingFlavor: "+frostingFlavor+", hasSprinkles: "+Boolean.toString(hasSprinkles);
    }
    public int getTiers(){
        return tiers;
    }
    public int getCandleCount(){
        return candleCount;
    }
    public String getCakeFlavor(){
        return cakeFlavor;
    }
    public String getFrostingFlavor(){
        return frostingFlavor;
    }
    public boolean isHasSprinkles(){
        return hasSprinkles;
    }


}
