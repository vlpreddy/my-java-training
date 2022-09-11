public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        printYearsAndDays(525600);
    }

    public static void printYearsAndDays(long minutes){
        if(minutes <0){
            System.out.println("Invalid Value");
        } else {
        long minutesperday = 60*24;
        long  minutesperyear = 365*24*60;
        long yearscalculate = minutes/minutesperyear;
        long dayscalculate = (minutes/minutesperday) - (yearscalculate*365);
        System.out.println(minutes+" min = "+ yearscalculate+" y "+ "and "+ dayscalculate + " d");
        }
    }
}