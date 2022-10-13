package task;

public class BeginnerSeries3SumOfNumbers {
    public int GetSum(int a, int b)
    {
        int sum=0;

        if(a<b){
            for(int i = a; i<=b; i++){
                sum = sum + i;
            }
        }else if(a>b) {
            for(int j = b; j<=a; j++){
                sum = sum + j;
            }
        }else {
            sum = a;
        }
        return sum;
    }
}
