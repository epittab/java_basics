package Exercises.HeightConverter;

public class HeightConverter {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(5, 12));
        System.out.println(calcFeetAndInchesToCentimeters(70));
        System.out.println(calcFeetAndInchesToCentimeters(6, 0));
        System.out.println(calcFeetAndInchesToCentimeters(75));
    }
    public static int calcFeetAndInchesToCentimeters(int feet, int inches) {
        if ( feet < 0 || (inches < 0 || inches > 12)) return -1;
        double converted = ((feet * 12) + inches) * 2.54d;
        return (int) converted;
    }
    public static int calcFeetAndInchesToCentimeters(int inches) {
        if ( inches < 0) return -1;
        int totalFeet = inches / 12;
        int remainingInches = inches % 12;
        return calcFeetAndInchesToCentimeters(totalFeet, remainingInches);
    }
}
