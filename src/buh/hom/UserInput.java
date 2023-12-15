package buh.hom;

import java.math.BigDecimal;

public class UserInput {

    private UserInput() {} //security
    public static void testInput() {
        System.out.println("This is a test user input... ");
        Main.sumAsString = "222.33";
        Main.sumAsString = Main.sumAsString.replace(" ", "");
        // check if sum input is valid
        if(!CheckInputs.isSumValid(Main.sumAsString)) {
            System.out.printf("Sum input %s is wrong. Must be RUB.KOP (123.01)", Main.sumAsString);
            return;
        } else {
            Main.sum = new BigDecimal(Main.sumAsString);
        }

        Main.category = "grocery";
        Main.note = "Vegetables";
    }


}
