package entity;

import java.math.BigDecimal;

public class Sale {
    private String UPC;
    private String name;
    private int amount;
    private BigDecimal price;

    public Sale(String UPC, String name, int amount, BigDecimal price) {
        this.UPC = UPC;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public String getUPC() {
        return UPC;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Sale [UPC=").append(UPC)
                .append(", name=").append(name)
                .append(", amount=").append(amount)
                .append(", price=").append(price)
                .append("]");
        return builder.toString();
    }
}
