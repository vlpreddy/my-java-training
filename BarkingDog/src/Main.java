public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(shouldWakeUp(true,6));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if((hourOfDay >=0 && hourOfDay <=23) && (hourOfDay <8 || hourOfDay >22) && barking){
            return true;
        }
        return false;
    }
}