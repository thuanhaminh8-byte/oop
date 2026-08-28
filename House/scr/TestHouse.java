import junit.framework.TestCase;

public class TestHouse extends TestCase {

    public void testConstructor() {
        Address addr1 = new Address(23, "Maple Street", "Brookline");
        Address addr2 = new Address(5, "Joye Road", "Newton");
        Address addr3 = new Address(83, "Winslow Road", "Waltham");


        new House("Ranch", 7, 375000, addr1);
        new House("Colonial", 9, 450000, addr2);
        new House("Cape", 6, 235000, addr3);


        new House("Ranch", 7, 375000, new Address(23, "Maple Street", "Brookline"));
        new House("Colonial", 9, 450000, new Address(5, "Joye Road", "Newton"));
        new House("Cape", 6, 235000, new Address(83, "Winslow Road", "Waltham"));
    }
}
