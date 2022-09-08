public class Main {
    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not alien");
            System.out.println("I am scared of alien");
        } else {
            System.out.println("It is alien");
        }

        int topscore = 100;
        int secondscore = 80;

        if(topscore <=100) {
            System.out.println("The top score  is " + topscore);
        }
        if((topscore >secondscore) && (topscore<100) ){
            System.out.println(topscore+secondscore);
        }

        boolean isCar =true;
        //ternary operator
        boolean wasCar = isCar ? true: false;

        //resource for operators
        https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
        http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

        System.out.println(wasCar);

        double myval = 20.00d;
        double mysecondval = 80.00d;

        double totalcalc = myval + mysecondval * 100.00;
        System.out.println("Myvalyes total " + totalcalc);
        double remaindercalc = totalcalc % 40.00;
        System.out.println("the reaminder " + remaindercalc);
        boolean boolval =  (remaindercalc == 0) ? true : false;

        if(!boolval){
            System.out.println("got some remainder");
        }

    }
}