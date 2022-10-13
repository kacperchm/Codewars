//Write a function that accepts an array of 10 integers (between 0 and 9),
// that returns a string of those numbers in the form of a phone number.

package task;

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        String phoneString;

        String first = "(";
        String second = "";
        String third = "";

        for(int f = 0; f < 3; f++){
            first += numbers[f];
        }

        first += ") ";

        for(int s = 3; s < 6; s++){
            second += numbers[s];
        }

        second += "-";

        for(int t = 6; t < 10; t++){
            third += numbers[t];
        }

        return phoneString = first + second + third;
    }
}
