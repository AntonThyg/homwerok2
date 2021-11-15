package oldProjects.CentralTendency;

import java.util.*;

public class CentralTendency {
    public static Scanner ask = new Scanner(System.in);
    public static void main(String... args){
        ArrayList<Integer> stats = parseList();
        float mean = calcMean(stats);
        float midRange = midRange(stats);
        int median = calcMedian(stats);
        int mode = calcMode(stats);
    }
    public static ArrayList<Integer> parseList(){
        ArrayList<Integer> stats = new ArrayList<>();
        while (true){
            System.out.println("Gib number, or say no to stop");
            var resp = ask.nextLine();
            if(resp.equals("no")){
                break;
            }else{
                stats.add(Integer.parseInt(resp));
            }
        }
        return stats;
    }
    public static float calcMean(ArrayList<Integer> arrayList){
        int total = 0;
        for(int n: arrayList){
            total+=n;
        }
        float mean = (float)total /arrayList.size();
        System.out.println("Mean is "+mean);
        return mean;
    }
    public static float midRange(ArrayList<Integer> arrayList){
        Collections.sort(arrayList);
        float midRange = (float)(arrayList.get(0)+arrayList.get(arrayList.size()-1)) /2;
        System.out.println("Mid range is "+midRange);
        return midRange;
    }
    public static int calcMedian(ArrayList<Integer> arrayList){
        Collections.sort(arrayList);
        int median = arrayList.get(arrayList.size()/2);
        System.out.println("Median is "+median);
        return median;
    }
    public static int calcMode(ArrayList<Integer> arrayList){
        ArrayList<Integer> occurence = new ArrayList();
        for(int i=0;i<arrayList.size();i++){
            int occurences = 0;
            for(int o=0;o<arrayList.size();o++){
                if(arrayList.get(i).equals(arrayList.get(o))){
                    occurences++;
                }
            }
            occurence.add(occurences);
        }
        int max = occurence.get(0);
        for(int p=0;p<arrayList.size();p++){
            if(occurence.get(p)>max){
                max=occurence.get(p);
            }
        }
        int mode = arrayList.get(occurence.indexOf(max));
        System.out.println("Mode is "+mode);
        return mode;
    }


}
