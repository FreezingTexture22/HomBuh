package buh.hom;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Money {
    private BigDecimal amount;
    private static final RoundingMode ROUNDING_MODE = RoundingMode.HALF_EVEN;
    private static final int DECIMALS = 2;

    public Money(BigDecimal amount) {
        this.amount = amount.setScale(DECIMALS, ROUNDING_MODE);
    }

    public void addMoney(BigDecimal addedMoney) {
        addedMoney = addedMoney.setScale(DECIMALS, ROUNDING_MODE);
        amount = amount.add(addedMoney);
    }

    public void subtractMoney(BigDecimal subtractedMoney) {
        subtractedMoney = subtractedMoney.setScale(DECIMALS, ROUNDING_MODE);
        amount = amount.subtract(subtractedMoney);
    }


    public BigDecimal getAmount() {
        return amount;
    }


}
