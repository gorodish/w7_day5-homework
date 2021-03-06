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
    Customer customer2;


    @Before
    public void before() {
        shop1 = new Shop("Bob's Army & Navy Stores", 1000, 955.67);
        shop2 = new Shop("Emporio Armani", 10000, 773.80);
        customer1 = new Customer("Dave", 500);
        customer2 = new Customer("Alphonse", 5000);

    }

    @Test
    public void shopHasName() {
        assertEquals("Bob's Army & Navy Stores", shop1.getName());
    }

    @Test
    public void canSellStuff() {
        customer1.buyStuff(shop1, 100);
        customer2.buyStuff(shop2, 199.99);

        assertEquals(1055.67, shop1.getSales(), 0.01);
        assertEquals(400, customer1.getWallet(), 0.01);

        assertEquals(4800.01, customer2.getWallet(), 0.01);
        assertEquals(973.79, shop2.getSales(), 0.01);

    }

    @Test
    public void canRefund() {
        shop1.giveRefund(100);
        assertEquals(855.67, shop1.getSales(), 0.01);
        assertEquals(900, shop1.getBankBalance(), 0.01);
        assertEquals(500, customer1.getWallet(), 0.01);

    }

    @Test
    public void canGetIncome() {
        customer1.buyStuff(shop1, 100);
        customer2.buyStuff(shop2, 199.99);
        shop1.giveRefund(10);
        shop2.giveRefund(100);

        assertEquals(1045.67, shop1.getSales(), 0.01);
        assertEquals(873.79, shop2.getSales(), 0.01);

    }
}
