package example.codeclan.com.shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by user on 25/02/2017.
 */

public class TestShop {

    Shop shop1;
    Shop shop2;
    Customer customer1;

    @Before
    public void before() {
        shop1 = new Shop("Bob's Army & Navy Stores", 1000);
        shop2 = new Shop("Emporio Armani", 10000);
        customer1 = new Customer("Dave", 100);
    }

    @Test
    public void shopHasName() {
        assertEquals("Bob's Army & Navy Stores", shop1.getName());
    }

    @Test
    public void canSellStuff() {
        shop1.sellStuff(100);
        assertEquals(1100, shop1.getSales(), 0.01);
    }

    @Test
    public void canRefund() {
        shop1.giveRefund(100);
        assertEquals(900, shop1.getSales(), 0.01);
    }

    @Test
    public void canGetIncome() {

    }
}
