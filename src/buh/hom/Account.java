package buh.hom;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Account {
    private String name;
    private BigDecimal balance;

    public Account(String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance.setScale(2, RoundingMode.HALF_EVEN);
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    void setBalance(BigDecimal balance) {
        this.balance = balance.setScale(2, RoundingMode.HALF_EVEN);
    }

    public String toString() {
        return name;
    }

}
