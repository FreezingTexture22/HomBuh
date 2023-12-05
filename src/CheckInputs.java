public class CheckInputs {

    public static boolean isSumValid(String sum) {
        sum = sum.replace(",", ".");

        if (sum.matches("\\d+.?\\d{0,2}")) {
            return true;
        } else
            return false;
    }

}
