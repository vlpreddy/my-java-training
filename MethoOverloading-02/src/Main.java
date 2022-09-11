public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double centemeters = calcFeetAndInchesToCentimeters(7,-10);
        if(centemeters <0.0){
            System.out.println("Invalid parameters");
        }

        calcFeetAndInchesToCentimeters(13);
    }
    public static int calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet <= 0 || (inches <= 0 || inches >= 12)) {
            System.out.println("Invalid feet or inches parameter");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm");
        return 1;
    }

    public static int calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0) {
            return -1;
        }
        double feet = (int)inches/12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches equal to " + feet +  " feet " + remainingInches + " inches" );
        return calcFeetAndInchesToCentimeters(feet, remainingInches);


    }
}