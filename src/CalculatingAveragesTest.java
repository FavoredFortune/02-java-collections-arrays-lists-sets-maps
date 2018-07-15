import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatingAveragesTest {

    @Test
    public void averageArray() {
        int[] array2 = {22,11,23}; //expected answer is 28
        float expected = 28;
        float actual = CalculatingAverages.averageArray(array2);
        assertEquals(expected,actual);
    }
}