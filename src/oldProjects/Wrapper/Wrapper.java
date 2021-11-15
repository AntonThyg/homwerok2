package oldProjects.Wrapper;

public class Wrapper {
    public static void main(String... args){
        int obamaTimeInOffice = 8;
        double obamaOtherBookCost = 10.98;
        Integer obamaAge = 60;
        Double obamaBookCost = 17.97;
        Double obamaBookCostMax = Double.MAX_VALUE;
        Double obamaPotentialDebt = Double.MIN_VALUE;
        Double obamasBookCombo = obamaBookCost+obamaOtherBookCost;

        int yearsNotInOffice = obamaTimeInOffice + obamaAge;
        System.out.println("Obama spent "+obamaTimeInOffice+" years as president");
        System.out.println("Obama is "+ obamaAge +" years old");
        System.out.println("Obama's book costs"+ obamaBookCost +"\n Obama's other book costs"+obamaOtherBookCost);
        System.out.println("Both of Obama's books cost "+obamasBookCombo+"\n Obama's books can potentially cost "+obamaBookCostMax);
        System.out.println("Obama could potentially be "+obamaPotentialDebt+" in debt");
    }
}
