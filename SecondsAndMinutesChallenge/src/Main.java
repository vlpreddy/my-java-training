public class Main {
    public static void main(String[] args) {
        System.out.println(getDurationString(130,60));
        System.out.println(getDurationString(60));

    }
    public static String getDurationString(int minutes, int seconds){
        if(minutes<=0 && (seconds <=0 || seconds>59)){
            return "Invalid Value";
        }

        int hours = minutes / 60;
        int remainingminutes = minutes % 60;
        return hours + "h " + remainingminutes + "m " + seconds + "s";

    }

    public static String getDurationString(int seconds) {
     if(seconds < 0){
         return "Invalid String";
     }

     int minutes = seconds /60;
     int remainingseconds = seconds % 60;
        return getDurationString(minutes,remainingseconds);
    }
    

    }