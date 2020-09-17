package OperatorChallenge;

class OperatorChallenge {
    public static void main(String[] args) {
        
        // step 1
        double myDouble = 20.00d;
        //step 2
        double mySecondDouble = 80.00d;
        //step 3
        double myTotal = (myDouble + mySecondDouble) * 100.00;
        //step 4
        double remainder = myTotal % 41.00;
        //step 5
        boolean isRemainderZero = (remainder == 0) ? (true) : (false);
        //step 6
        System.out.println(isRemainderZero);
        //step 7
        if (!isRemainderZero) {
            System.out.println("Got some remainder");
        }

    }
}