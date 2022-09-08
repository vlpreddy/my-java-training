public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
      // The following are primitive data types
        //byte
        //short
        //double
        //float
        //char
        //boolean
        //int
        //long

        int result = 1+2; // 1+2=3
        System.out.println("1 + 2 = " + result);
        int previousresult = result;
        System.out.println("previousresult = " + previousresult);
        result = result - 1;
        System.out.println("3-1 = " + result);
        System.out.println("previousresult = " + previousresult);
        result = result % 3;  // remainder
        System.out.println(result);
        result++;
        System.out.println(result);
        result--;
        System.out.println(result);
        result +=2 ;
        System.out.println(result);
        result *=2 ;
        System.out.println(result);
        result /=2 ;
        System.out.println(result);
        result -=2 ;
        System.out.println(result);

    }
}