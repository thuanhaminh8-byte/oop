import junit.framework.TestCase;

public class TestCoffeeReceipt extends TestCase {
    public void testConstructor(){
        new CoffeeReceipt("Hawaiian Kona", 15.95, 100);
        new CoffeeReceipt("Ethiopian", 8.00, 1000);
        new CoffeeReceipt("Colombian Supreme", 9.50, 1700);
    }
    public void testSellingCost(){
        CoffeeReceipt hk = new CoffeeReceipt("Hawaiian Kona", 15.95, 100);
        assertEquals(hk.sellingCost(),1595.00, 0.001);

        CoffeeReceipt e = new CoffeeReceipt("Ethiopian", 8.00, 1000);
        assertEquals(e.sellingCost(), 8000.00, 0.001);

        CoffeeReceipt cs = new CoffeeReceipt("Colombian Supreme ", 9.50, 1700);
        assertEquals(cs.sellingCost(), 16150.00, 0.001);

    }

    public void testWeighMore() {
        assertFalse(new CoffeeReceipt("Hawaiian Kona", 15.95, 100).weighsMore(200));
        assertFalse(new CoffeeReceipt("Ethiopian", 8.00, 1000).weighsMore(1000));
        assertTrue(new CoffeeReceipt("Columbian Supreme", 9.50, 200).weighsMore(100));
    }

    public void testCheaperThan() {
        assertTrue(new CoffeeReceipt("Hawaiian Kona", 15.95,100).isCheaperThan(new CoffeeReceipt("Ethopian", 20.00, 100)));
        assertFalse(new CoffeeReceipt("Hawiian Kona", 15.95, 200).isCheaperThan(new CoffeeReceipt("Ethopian", 15.95, 100)));
        assertFalse(new CoffeeReceipt("Hawaiian Kona", 15.95, 300).isCheaperThan(new CoffeeReceipt("Ethopian", 8.00, 100)));


    }

    public void testCostLessThan() {
        CoffeeReceipt hk = new CoffeeReceipt("Hawaiian Kona", 15.95, 100);
        CoffeeReceipt e = new CoffeeReceipt("Ethiopian", 8.00, 1000);
        CoffeeReceipt cs = new CoffeeReceipt("Comlumbian Supreme", 9.50, 1700);
        assertTrue(hk.costLessThan(e));
        assertFalse(e.costLessThan(e));
        assertFalse(cs.costLessThan(e));
    }

}