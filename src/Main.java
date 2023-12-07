import java.math.BigDecimal;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Currency;
//import org.javamoney.calc.*;
//import javax.money.MonetaryAmount;


public class Main {
    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd, hh:mm");
        /**
         *
         * Important to create new BigDecimal
         * using the String constructor in preference
         * to the double constructor.
         *
        **/
        String sumAsString;
        sumAsString = "545.66";
        sumAsString = sumAsString.replace(" ", "");

        // check if sum input is valid
        BigDecimal sum;
        if(!CheckInputs.isSumValid(sumAsString)) {
            System.out.printf("Sum input %s is wrong. Must be RUB.KOP (123.01)", sumAsString);
            return;
        } else {
            sum = new BigDecimal(sumAsString);
        }


        Currency rub = Currency.getInstance("RUB");

        String category = "grocery";
        Account raiffaisenCard = new Account("Raiffaisen Card", new BigDecimal(1000));
        String note = "Bread and Butter";

        Expense e1 = new Expense(LocalDateTime.now(), sum, rub, category, raiffaisenCard, note);
        raiffaisenCard.setBalance(raiffaisenCard.getBalance().subtract(sum));
        System.out.println(e1.getDateTime().format(dateTimeFormatter));
        System.out.println(e1.getSum() + " " + e1.getCurrency());
        System.out.println(e1.getCategory());
        System.out.println(e1.getAccount());
        System.out.println(e1.getNote());
        System.out.println(raiffaisenCard.getBalance());


    }
}