package example.codeclan.com.shop;

/**
 * Created by user on 25/02/2017.
 */

public class Shop {

    private String name;
    private double sales;

    public Shop(String name, double sales) {
        this.name = name;
        this.sales = sales;
    }

    public double sellStuff(double sale) {
            this.sales += sale;
            return sale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public double giveRefund(double refund) {
        this.sales -= refund;
        return refund;
    }

    public double getIncome() {
        double income = this.sales - this.refund;
        return income;
    }
}
