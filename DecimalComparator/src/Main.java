public class Main {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double para1, double para2){
        para1 = para1*1000;
        para2 = para2*1000;
        int param1 = (int)para1;
        int param2 = (int)para2;
        if(param1 == param2){
            return true;
        }
        return false;
    }
}