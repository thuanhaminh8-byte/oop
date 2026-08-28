import junit.framework.TestCase;

public class TestTrain extends TestCase {
    public void testConstructor()
    {
        new Train(new Route("An Giang", "TpHCM"),
                new Schedule(new Clocktime(8,5),
                        new Clocktime(2,30)),"local");
    }
}