package buh.hom;

import java.math.BigDecimal;

public class TestMoney {

    public static void main(String [] args) {
        Money money = new Money(new BigDecimal("100"));
        System.out.println(money.getAmount());
        money.addMoney(BigDecimal.valueOf(11.333));
        System.out.println(money.getAmount());
        money.addMoney(BigDecimal.valueOf(0.333));
        System.out.println(money.getAmount());
        money.addMoney(BigDecimal.valueOf(0.334));
        System.out.println(money.getAmount());

    }
}
