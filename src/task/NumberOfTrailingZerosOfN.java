//Write a program that will calculate the number of trailing zeros in a factorial of a given number.
//N! = 1 * 2 * 3 *  ... * N
//Be careful 1000! has 2568 digits...
//For more info, see: http://mathworld.wolfram.com/Factorial.html

package task;

import java.sql.SQLOutput;

public class NumberOfTrailingZerosOfN {
    public static int zeros(int n) {
        double a = 5;
        double kMax = (Math.log10((double) n))/(Math.log10(a));
        int zerosNum = 0;
        for(int i = 1; i<=kMax; i++){
            zerosNum = zerosNum + (n/(int)(Math.pow(a,i)));
        }
        return zerosNum;

    }
}
