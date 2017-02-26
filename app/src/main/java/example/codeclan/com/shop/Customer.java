package example.codeclan.com.shop;

/**
 * Created by user on 25/02/2017.
 */

public class Customer {

    private String name;
    public double wallet;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public void buyStuff(Shop shop, double sale) {
        this.wallet -= sale;
        shop.sellStuff(sale);
    }

}
