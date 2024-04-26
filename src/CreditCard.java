import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private Double balance;
    private Double limit;
    private List<Shopping> shoppings;

    public CreditCard(Double limit) {
        this.limit = limit;
        this.balance = limit;
        this.shoppings = new ArrayList<>();
    }

    public Double getBalance() {
        return balance;
    }

    public Double getLimit() {
        return limit;
    }

    public List<Shopping> getShoppings() {
        return shoppings;
    }

    public boolean addShopping(Shopping shopping){
        if(this.balance > shopping.getPrice()){
            this.balance -= shopping.getPrice();
            shoppings.add(shopping);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "balance=" + balance +
                ", limit=" + limit +
                ", shoppings=" + shoppings +
                '}';
    }
}
