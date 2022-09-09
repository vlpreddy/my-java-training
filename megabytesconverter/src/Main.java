public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        printMegaBytesAndKiloBytes(1500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes <0){
            System.out.println("Invalid Value");
        }else {
            int remainingmegabytes = kiloBytes % 1024;
            int megabytes = kiloBytes / 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingmegabytes + " KB");
        }
    }


}