public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(hasEqualSum(1,-1,0));
    }

    public static boolean hasEqualSum(int para1, int para2, int para3) {
        int sumoffirsttwoparams = para1 + para2;
        if(sumoffirsttwoparams == para3){
            return true;
        }
        return false;
    }
}