package entity;

import java.util.List;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class Check{
    private String number;
    private Employee employee;
    private CustomerCard card;
    private Timestamp printDate;
    private BigDecimal totalSum;
    private BigDecimal VAT;
    private List<Sale> products;

    public Check(String number, Employee employee, CustomerCard card, Timestamp printDate, BigDecimal totalSum, BigDecimal VAT, List<Sale> products) {
        this.number = number;
        this.employee = employee;
        this.card = card;
        this.printDate = printDate;
        this.totalSum = totalSum;
        this.VAT = VAT;
        this.products = products;
    }
    public boolean includeCheck(Sale productInStore){
        for(Sale Sale:products){
            if(Sale.getUPC().equals(productInStore.getUPC()))
                return true;
        }
        return false;
    }

    public String getNumber() {
        return number;
    }

    public Employee getEmployee() {
        return employee;
    }

    public CustomerCard getCard() {
        return card;
    }

    public Timestamp getPrintDate() {
        return printDate;
    }

    public BigDecimal getTotalSum() {
        return totalSum;
    }


    public BigDecimal getVAT() {
        return VAT;
    }

    public List<Sale> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Check [number=").append(number)
                .append(", employee=").append(employee)
                .append(", card=").append(card)
                .append(", printDate=").append(printDate)
                .append(", totalSum=").append(totalSum)
                .append(", VAT=").append(VAT)
                .append(", products=").append(products)
                .append("]");
        return builder.toString();
    }
}
