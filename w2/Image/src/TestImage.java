import junit.framework.TestCase;

public class TestImage extends TestCase {

    public void testConstructor() {
        new Image(1000, 500, "portrait.jpg", "High");
        new Image(600, 800, "landscape.png", "Medium");
        new Image(800, 800, "square.bmp", "Low");
    }

    public void testIsPortrait() {
        public void testIsPortrait() {
            assertFalse(new Image(5, 10, "small.gif", "low").isPortrait());
            assertFalse(new Image(120, 200, "med.gif", "low").isPortrait());
            assertTrue(new Image(1200, 1000, "large.gif", "high").isPortrait());
        }
    }

    public void testSize() {
        assertEquals(new Image(5, 10, "small.gif", "low").size(), 50);
        assertEquals(new Image(120, 200, "med.gif", "low").size(), 24000);
        assertEquals(new Image(1200, 1000, "large.gif", "high").size(), 1200000);
    }


    public void testIsLarger() {
        Image img1 = new Image(5, 10, "small.gif", "low");
        Image img2 = new Image(120, 200, "med.gif", "low");
        Image img3 = new Image(1200, 1000, "large.gif", "high");

        assertFalse(img1.isLarger(img2));
        assertTrue(img3.isLarger(img2));
    }

}