//Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary
//representation of that number. You can guarantee that input is non-negative.

package task;
import java.lang.String;


public class BitCounting {
    public static int countBits(int n){
        String binary = Integer.toBinaryString(n);
        int counter = 0;
        int binaryLenght = binary.length();
        System.out.println(binaryLenght);
        for(int i = 0; i<binaryLenght; i++) {
            if(binary.charAt(i) == '1') {
                counter++;
            }
        }
        return counter;
    }
}
