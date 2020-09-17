package FloatDoubles;

public class FloatDoubles {
    public static void main(String[] args) {

        float myMaxFloatValue = Float.MAX_VALUE;
        float myMinFloatValue = Float.MIN_VALUE;

        double myMaxDoubleValue = Double.MAX_VALUE;
        double myMinDoubleValue = Double.MIN_VALUE;

        System.out.println("Float maximum value: " + myMaxFloatValue);
        System.out.println("Float minimum value: " + myMinFloatValue);
        System.out.println("Double maximum value: " + myMaxDoubleValue);
        System.out.println("Double minimum value: " + myMinDoubleValue);


        int myIntValue = 5;
        float myFloatValue = (float) (5.25); //type casting
        double myDoubleValue = 5.25d;

        double myPounds = 200d;
        double conversionFactor = 0.45359237d;
        double kilos = myPounds * conversionFactor;

        System.out.println("The kilos are: " + kilos);

    }
}