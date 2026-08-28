import junit.framework.TestCase;
public class TestSnake extends TestCase {
    public void testConstructor() {
        new Snake(new Information("Boa", 50), 5);
    }
}
