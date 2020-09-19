package Exercises.DecimalComp;

/**
 * DecimalComp
 */
public class DecimalComp {

    public static void main(String[] args) {
        //write code
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        //write code
        float difference = (float)(num1 - num2);
        if (difference >= -0.001 && difference <= 0.001) return true;
        return false;
    }
}