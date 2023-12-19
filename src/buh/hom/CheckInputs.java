package buh.hom;

public class CheckInputs {

    private CheckInputs() {
    }

    public static boolean isSumValid(String sum) {
        sum = sum.replace(",", ".");

        return sum.matches("\\d+.?\\d{0,2}");
    }

}
