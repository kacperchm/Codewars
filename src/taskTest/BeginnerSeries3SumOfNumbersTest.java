package taskTest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import task.BeginnerSeries3SumOfNumbers;

public class BeginnerSeries3SumOfNumbersTest {
    BeginnerSeries3SumOfNumbers s = new BeginnerSeries3SumOfNumbers();

    @Test
    public void Test1()
    {
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(1, s.GetSum(0, 1));
    }

}
