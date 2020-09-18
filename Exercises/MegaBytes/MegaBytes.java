package Exercises.MegaBytes;

public class MegaBytes {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int mega = kiloBytes / 1024;
            int kbRemaining = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + mega + " MB and " + kbRemaining + " KB");   
        }
    }
}
