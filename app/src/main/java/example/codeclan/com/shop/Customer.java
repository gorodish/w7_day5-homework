package example.codeclan.com.shop;

/**
 * Created by user on 25/02/2017.
 */

public class Customer {

    private String name;
    private double wallet;

    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;

    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void buyStuff(double sale, Shop shop) {
        this.wallet -= sale;
        shop.sellStuff(sale);
    }

}
