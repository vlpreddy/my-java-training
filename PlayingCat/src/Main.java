public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isCatPlaying(false,25));
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean catplaying = true;
        if(!summer){
            if(temperature <25 || temperature>35){
                catplaying = false;
            }
        } else if(temperature <25 || temperature>45){
            catplaying = false;
        }

        return catplaying;
    }
}