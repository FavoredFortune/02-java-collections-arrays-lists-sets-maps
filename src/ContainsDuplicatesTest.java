import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsDuplicatesTest {

    @Test
    public void duplicates() {
        int[] array2 = {10, 3, 3, 44};
        Boolean expected = true;
        Boolean actual = ContainsDuplicates.duplicates(array2);
        assertEquals(expected,actual);

    }
}