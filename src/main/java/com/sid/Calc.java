package com.sid;

public final class  Calc {
    private static final double NORMAL_RATE = 0.366;
    private static final double MIDDLE_RATE = 0.63;
    private static final double UPPER_RATE = 1.407;

    private static final int LOWER_BOUNDARY = 100;
    private static final int MIDDLE_BOUNDARY = 600;


    public static double Calculate(int curr, int prev){
        double res;
        int diff = prev - curr;

        if(diff <= LOWER_BOUNDARY){
            res = curr  * NORMAL_RATE;
        }
        else if(diff <= MIDDLE_BOUNDARY){
            double lower = (diff - 100) * MIDDLE_RATE;
            double upper = (diff - 100) * NORMAL_RATE;
            res = lower + upper;
        }
        else {
            double rate = (diff - 600) * UPPER_RATE;
            res = (100 * LOWER_BOUNDARY) + (500 * MIDDLE_BOUNDARY) + rate;
        }
        return Math.round( res * 100.00) / 100.00;
    }
}
