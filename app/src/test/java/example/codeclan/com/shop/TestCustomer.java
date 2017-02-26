package example.codeclan.com.shop;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * Created by user on 25/02/2017.
 */

public class TestCustomer {

    private Shop shop1;
    private Shop shop2;
    private Customer customer1;
    private Customer customer2;


    @Before
    public void before() {
        shop1 = new Shop("Bob's Army & Navy Stores", 1000, 955.67);
        shop2 = new Shop("Emporio Armani", 10000, 773.80);
        customer1 = new Customer("Dave", 500);
        customer2 = new Customer("Alphonse", 5000);
    }

    @Test
    public void customerHasName() {
        assertEquals("Dave", customer1.getName());
    }

    @Test
    public void canBuyStuff() {
        customer1.buyStuff(shop1, 100);
        customer2.buyStuff(shop2, 199.99);

        assertEquals(400.0, customer1.getWallet(), 0.01);
        assertEquals(1100, shop1.getSales(), 0.01);

        assertEquals(4800.01, customer2.getWallet(), 0.01);
        assertEquals(10199.99, shop2.getSales(), 0.01);
    }
}
