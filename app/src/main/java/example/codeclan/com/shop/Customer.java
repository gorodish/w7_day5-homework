package example.codeclan.com.shop;

/**
 * Created by user on 25/02/2017.
 */

public class Customer {

    private String name;
    public double wallet;
    private Shop shop;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public double getWallet() {
        return wallet;
    }

    public String getName() {
        return name;
    }

    public void buyStuff(Shop sale) {
        this.wallet -= sale;
        shop.sellStuff(sale);
    }

}
