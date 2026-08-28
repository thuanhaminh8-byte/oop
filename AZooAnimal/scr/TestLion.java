import junit.framework.TestCase;
public class TestLion extends TestCase {
    public void testConstructor() {
        new Lion(new Information("Leo", 300), 5);
    }
}
