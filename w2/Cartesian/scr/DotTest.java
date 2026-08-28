import junit.framework.TestCase;
public class DotTest extends TestCase {
    public void testConstructor() {
        new Dot(new Cartesianpoint(100,200));
        Cartesianpoint location =  new Cartesianpoint(100,200);
        new Dot(location);
    }
}
