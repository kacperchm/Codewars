package taskTest;

import org.junit.Test;
import task.MultiplesOf3Or5;

import static org.junit.Assert.assertEquals;

public class MultiplesOf3Or5Test {
    @Test
    public void test() {
        assertEquals(23, new MultiplesOf3Or5().solution(10));
    }
}
