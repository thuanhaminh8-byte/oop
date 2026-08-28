import junit.framework.TestCase;

public class TestWeatherRecord extends TestCase {
    public void testConstructor()
    {
        new WeatherRecord(new Date(2,2,2007),
                new Temperature(15,13), new Temperature(15, 14),
                new Temperature(15,13), 7.1);
    }
}