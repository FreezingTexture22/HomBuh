import java.math.BigDecimal;
import java.math.RoundingMode;

public class Account {
    private String name;
    private BigDecimal balance;

    public Account(String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance.setScale(2, RoundingMode.HALF_EVEN);
    }

    void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
