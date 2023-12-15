package buh.hom;

import java.util.List;

public class PrintOut {
    private PrintOut() {}
    
    public static void printNewExpense(Expense expense) {
        System.out.println(expense.getDateTime().format(Main.dateTimeFormatter));
        System.out.println(expense.getSum() + " " + expense.getCurrency());
        System.out.println(expense.getCategory());
        System.out.print(expense.getAccount().toString());
        System.out.println(" , balance: " + expense.getAccount().getBalance());
        System.out.println(expense.getNote());
        System.out.println("======================");
    }

    public static void printAllExpenses (List<String[]> loadedData) {
       for (String[] item : loadedData) {
           System.out.println("Expense:");
           for (String i : item) {
               System.out.println(i);
           }
           System.out.println("=========");
       }
    }
}
