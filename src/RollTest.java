import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class RollTest {

    @Test
    public void roll() {
        int expected = 10;
        List actual = Roll.roll(10);
        assertEquals(expected,actual.size());
    }
}