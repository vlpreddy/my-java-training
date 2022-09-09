public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean hasTeen(int para1, int para2, int para3){
        if(isTeen(para1) || isTeen(para2) || isTeen(para3)){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int param){
        if(param >= 13 && param <=19){
            return true;
        }
        return false;
    }
}