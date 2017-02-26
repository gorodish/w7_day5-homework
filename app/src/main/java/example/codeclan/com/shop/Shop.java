package example.codeclan.com.shop;

/**
 * Created by user on 25/02/2017.
 */

public class Shop {

    private String name;
    private double sales;
    private double bankBalance;

    public Shop(String name, double bankBalance, double sales) {
        this.name = name;
        this.bankBalance = bankBalance;
        this.sales = sales;
    }

    public void sellStuff(double sale) {
        this.sales += sale;
        this.bankBalance += sale;
    }

    public String getName() {
        return name;
    }

    public double getSales() {
        return sales;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void giveRefund(double refund) {
        this.bankBalance -= refund;
        this.sales -= refund;
    }

}
