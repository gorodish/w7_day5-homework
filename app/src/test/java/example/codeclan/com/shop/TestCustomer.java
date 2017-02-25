package example.codeclan.com.shop;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * Created by user on 25/02/2017.
 */

public class TestCustomer {

    Shop shop1;
    Shop shop2;
    private Customer customer1;

    @Before
    public void before() {
        shop1 = new Shop("Bob's Army & Navy Stores", 1000);
        shop2 = new Shop("Emporio Armani", 10000);
        customer1 = new Customer("Dave", 100);
    }

    @Test
    public void customerHasName() {
        assertEquals("Dave", customer1.getName());
    }

    @Test
    public void canBuyStuff() {
        customer1.buyStuff(100, shop1);
        assertEquals(0.0, customer1.getWallet(), 0.01);
        assertEquals(1100, shop1.getSales(), 0.01);
    }
}
