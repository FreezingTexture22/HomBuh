package buh.hom;

import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Main {
    // this is format of the date, just for print out,
    // it does not change date and time record
    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd, hh:mm");
    // set currency
    static Currency rub = Currency.getInstance("RUB");
    //// generate some test data and create new expense object

    static String sumAsString = "0";
    static BigDecimal sum;
    static String category;
    static String note;
    static List<String[]> loadedData;
    static List<Account> accountList = new ArrayList<>();

    static {
        Account.loadAccounts();
    }

    public static void main(String[] args) throws Exception {
        LoadExpensesFromFile.loadAtStart();

        System.out.println("************************************************************");
        System.out.println("Welcome to the HomBuh!");

        while (Menu.mainMenu()) {

            System.out.println("+++");
        }

    }
}