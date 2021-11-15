package oldProjects.Wrapper;

public class Box {
    private static Integer boxInt;
    private static Double boxDouble;
    private static Boolean boxBool;
    public Box(){
        boxInt = 0;
        boxDouble = 0.0;
        boxBool = false;
    }
    public Box(int i){
        boxInt = i;
    }
    public Box(double i){
        boxDouble = i;
    }
    public Box(boolean i){
        boxBool = i;
    }
    public Integer intValue(){
        return boxInt;
    }
    public Double doubleValue(){
        return boxDouble;
    }
    public Boolean boolValue(){
        return boxBool;
    }
}
