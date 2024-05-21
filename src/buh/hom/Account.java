package buh.hom;

import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class Account {
    private String name;
    private Money balance;

    public Account(String name, Money balance) {
        this.name = name;
        this.balance = balance;
    }

    public static List<String[]> loadAccountsFromCSV() {

        // default file path, for test
        String tempFilePath = "C:\\Users\\artelx\\IdeaProjects\\HomBuh\\accounts.csv";

        File file = new File(tempFilePath);
        Path path = Path.of(file.getAbsolutePath());
        //Build reader instance
        try (CSVReader reader = new CSVReader(new FileReader(path.toString()))) {
            return reader.readAll();

        } catch (Exception e) {
            System.out.println(e.toString());

        }

        return Collections.emptyList(); //just a placeholder
    }

    public static void loadAccounts() {
        for (String[] item : loadAccountsFromCSV()) {
            String name = item[0];
            Money balance = new Money(new BigDecimal(item[1]));
            Main.accountList.add(new Account(name, balance));
        }
    }

    public static void printAllAccounts(List<Account> accounts) {
        for (Account item : accounts) {
            System.out.println("Account:");
            System.out.println(item.getName());
            System.out.println(item.getBalance());
            System.out.println("=========");
        }
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public Money getBalance() {
        return balance;
    }

    void setBalance(Money balance) {
        this.balance = balance;
    }

    public String toString() {
        return name;
    }
}
