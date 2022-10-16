package taskTest;

import org.junit.Test;
import task.SumOfDigits;
import static org.junit.Assert.assertEquals;

public class SumOfDigitsTest {
    @Test
    public void Test1() {
        assertEquals( "Nope!" , 7, SumOfDigits.digital_root(16));
    }
    @Test
    public void Test2() {
        assertEquals( "Nope!" , 6, SumOfDigits.digital_root(456));
    }
}
