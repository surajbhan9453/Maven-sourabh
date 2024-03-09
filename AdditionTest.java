import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class AdditionTest {
    @Test
    public void testAdd() {
        assertEquals(8, Addition.add(5, 3));
        assertEquals(10, Addition.add(7, 3));
        assertEquals(0, Addition.add(0, 0));
    }
}
