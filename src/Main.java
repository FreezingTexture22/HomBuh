import java.math.BigDecimal;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import org.javamoney.calc.*;
//import javax.money.MonetaryAmount;


public class Main {
    public static void main(String[] args) throws Exception {

        // this is format of the date, just for print out,
        // it does not change date and time record
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd, hh:mm");

        // check if sum input is valid


        // set currency
        Currency rub = Currency.getInstance("RUB");

        //// generate some test data and create new expense object
        Account raiffaisenCard = new Account("Raiffaisen Card", new BigDecimal(1000));

        String sumAsString = "545.66";
        sumAsString = sumAsString.replace(" ", "");

        BigDecimal sum;
        if(!CheckInputs.isSumValid(sumAsString)) {
            System.out.printf("Sum input %s is wrong. Must be RUB.KOP (123.01)", sumAsString);
            return;
        } else {
            sum = new BigDecimal(sumAsString);
        }


        String category = "grocery";
        String note = "Bread and Butter";

        Expense e1 = new Expense(LocalDateTime.now(), sum, rub, category, raiffaisenCard, note);
        raiffaisenCard.setBalance(raiffaisenCard.getBalance().subtract(sum));

        System.out.println(e1.getDateTime().format(dateTimeFormatter));
        System.out.println(e1.getSum() + " " + e1.getCurrency());
        System.out.println(e1.getCategory());
        System.out.println(e1.getAccount());
        System.out.println(e1.getNote());
        System.out.println(raiffaisenCard.getBalance());
        // end of test data

        //// create array from expense to save to file
        String[] data = {
                e1.getDateTime().toString(),
                e1.getSum().toString(),
                e1.getCategory(),
                e1.getAccount(),
                e1.getNote()
        };

        //// write expense to a CSV file
        System.out.println("Writing expense to CSV file");
        WriteToFile.writeExpenseToCSV(data);

        // load from csv file
        List<String[]> loadedData = LoadExpencesFromFile.loadExpencesFromCSV();

        //create and populate hashMap
        Map<Integer, String[]> expenses = new HashMap<>();

        for (String[] i : loadedData) {
            System.out.println(i.hashCode());
            expenses.put(i.hashCode(), i);
            for (String j : i) {
                System.out.println(j);
            }
            System.out.println("**********");

        }

        System.out.println(expenses.get(1851691492)[0] + " " + expenses.get(1851691492)[1] );
        System.out.println(expenses.keySet());








    }
}