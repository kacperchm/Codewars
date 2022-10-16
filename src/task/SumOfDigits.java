//Digital root is the recursive sum of all the digits in a number.
//Given n, take the sum of the digits of n. If that value has more
//than one digit, continue reducing in this way until a single-digit
//number is produced. The input will be a non-negative integer.


package task;

public class SumOfDigits {
    public static int digital_root(int n) {
        int result = n;
        int a = 0;
        do{
            a = a + result % 10;
            result = result / 10;
            if(result<1 && a>=10) {
                result = a;
                a =0;
            }
        }while(result>=1);
        return a;
    }
}
