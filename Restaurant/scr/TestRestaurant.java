import junit.framework.TestCase;

public class TestRestaurant extends TestCase {

    public void testConstructor() {
        Intersection intersection = new Intersection("Le Loi", "Quang Trung");
        new Restaurant("McDonald's", "Fast Food", 100000, intersection);
        new Restaurant("KFC", "Chicken", 150000, intersection);
        new Restaurant("Pho Bo", "Vietnamese", 50000, intersection);
    }
}