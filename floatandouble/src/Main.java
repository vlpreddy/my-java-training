public class Main {
    public static void main(String[] args) {
        float myminfoatvalue = Float.MIN_VALUE;
        float mymaxfloatvalue = Float.MAX_VALUE;
        System.out.println("Float Min Value " + myminfoatvalue);
        System.out.println("Float Max Value " + mymaxfloatvalue);

        double myminDoublevalue = Double.MIN_VALUE;
        double mymaxDoublevalue = Double.MAX_VALUE;
        System.out.println("Double Min Value " + myminDoublevalue);
        System.out.println("Double Max Value " + mymaxDoublevalue);

        int myintvalue =5/3;
        float myfloatvalue = 4.5f;
        double mydoublevalue = 5.5d;
        //int myintdividevalue = myintvalue / myfloatvalue;
        System.out.println("intvalue after divide " + myintvalue);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted Kilograms = " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}