import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Currency;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        BigDecimal sum = new BigDecimal(102.35);
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
        System.out.println(e1.getSum().setScale(2, RoundingMode.HALF_EVEN) + " " + e1.getCurrency());
        System.out.println(e1.getCategory());
        System.out.println(e1.getAccount());
        System.out.println(e1.getNote());
        System.out.println(account.getBalance());
    }
}