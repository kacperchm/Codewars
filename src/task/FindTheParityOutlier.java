//You are given an array (which will have a length of at least 3, but could be very large)
//containing integers. The array is either entirely comprised of odd integers or
//entirely comprised of even integers except for a single integer N. Write a method
//that takes the array as an argument and returns this "outlier" N.

package task;

public class FindTheParityOutlier {
    public static int find(int[] integers) {
        int evenInteger = 0;
        int oddInteger = 0;
        int even = 0;
        int odd = 0;
        int integersLenght = integers.length;
        for (int i = 0; i < integersLenght; i++) {
            if ((integers[i] % 2) == 0) {
                even += 1;
                evenInteger = integers[i];
            } else {
                odd += 1;
                oddInteger = integers[i];
            }
        }
        if (even < odd) {
            return evenInteger;
        } else {
            return oddInteger;
        }
    }
}
