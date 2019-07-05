import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class FibonacciTest {

    private Fibonacci f;

    @Parameterized.Parameters
    public static Collection<Integer[]> parameters() {
        return Arrays.asList(new Integer[][]{
                {0, 0},
                {1, 1},
                {2, 1},
                {3, 2},
                {4, 3},
                {5, 5},
                {6, 8},
                {7, 13},
                {8, 21},
                {9, 34},
                {10, 55},
        });
    }

    @Parameterized.Parameter(0)
    public int index;

    @Parameterized.Parameter(1)
    public int value;

    @Before
    public void init() {
        f = new Fibonacci();
    }

    @Test
    public void testFibonacciRecursiveParametrized() {
        assertEquals(value, f.computeRecursive(index));
    }
    @Test
    public void testFibonacciNonRecursiveParametrized() {
        assertEquals(value, f.computeRecursive(index));
    }
    @Test
    public void testWhenThirdElementIsFibonacciNumber() {
        assertEquals(2, Fibonacci.computeNonRecursive(3));
    }

    @Test
    public void testWhenFiveElementIsFibonacciNumber() {
        assertEquals(5, Fibonacci.computeNonRecursive(5));
    }

    @Test
    public void testWhenEightElementIsFibonacciNumber() {
        assertEquals(21, Fibonacci.computeNonRecursive(8));
    }
}
