import junit.framework.TestCase;
public class TestMonkey extends TestCase {
    public void testConstructor() {
        new Monkey(new Information("George", 150), "banana");
        new Monkey(new Information("Mina", 120), "kiwi");
    }
}
