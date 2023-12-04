import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Currency;

public class Main {
    public static void main(String[] args) {
        /**
         *
         * Important to create new BigDecimal
         * using the String constructor in preference
         * to the double constructor.
         *
        **/
        String sumAsString = "1213243.66";
        System.out.println(CheckInputs.checkSum(sumAsString));
        BigDecimal sum = new BigDecimal(sumAsString);

        Currency rub = Currency.getInstance("RUB");
        System.out.println(rub.getCurrencyCode());
        System.out.println(rub.getDisplayName());
        System.out.println(rub.getSymbol());
        String category = "grocery";
        Account account = new Account("Raiffaisen Card", new BigDecimal(1000));
        String note = "Bread and Butter";

        account.setBalance(new BigDecimal(20000));

        Expense e1 = new Expense(LocalDate.now(), LocalTime.now(), sum, rub, category, account, note);
        account.setBalance(account.getBalance().subtract(sum));
        System.out.println(e1.getDate());
        System.out.println(e1.getTime());
        System.out.println(e1.getSum() + " " + e1.getCurrency());
        System.out.println(e1.getCategory());
        System.out.println(e1.getAccount());
        System.out.println(e1.getNote());
        System.out.println(account.getBalance());



    }
}