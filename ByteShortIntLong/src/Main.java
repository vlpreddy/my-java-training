
public class Main {
    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minumum Value " + myMinIntValue+  " Integer Maximum Value " + myMaxIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue +1)); /* Overflow */
        System.out.println("Busted Min Value = " + (myMinIntValue -1)); /* Underflow */

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Minimum Byte Value " + myMinByteValue);
        System.out.println("Maximum Byte Value " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Minimum Short Value " + myMinShortValue);
        System.out.println("Maximum Short Value " + myMaxShortValue);

        long mylongvalue = 9223372036854775807L;

        System.out.println("my long value " + mylongvalue);
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Minimum Long Value " + myMinLongValue);
        System.out.println("Maximum Long Value " + myMaxLongValue);

        int myTotal = (myMinIntValue /2);
        byte mynewbyteval = (byte)(myMinByteValue/2);
        short mynnewshortvalue = (short)(myMinShortValue/2);
    }
}