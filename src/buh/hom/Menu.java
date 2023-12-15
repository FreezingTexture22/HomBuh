package buh.hom;

import java.time.LocalDateTime;
import java.util.Scanner;


public class Menu {

    private Menu() {} //security

    public static boolean mainMenu() throws Exception {
        System.out.println("************************************************************");
        System.out.println("List of commands:");
        System.out.println("    exit - exit the program");
        System.out.println("    1 - see all expenses");
        System.out.println("    2 - see all additions");
        System.out.println("    3 - see all accounts");
        System.out.println("    4 - add an expense");
        System.out.println("    5 - add an addition");
        System.out.print("Enter command: ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equals("exit")) {
            System.out.print("Bye!");
            return false;

        } else if (input.equals("1")){
            LoadExpensesFromFile.loadAtStart();
            PrintOut.printAllExpenses(Main.loadedData);
            return true;

        } else if (input.equals("4")) {
            UserInput.testInput();//test user input

            Expense expense = Expense.addExpense(LocalDateTime.now(), Main.sum, Main.rub, Main.category, Main.account, Main.note);

            PrintOut.printNewExpense(expense);

            String[] data = {
                    expense.getDateTime().toString(),
                    expense.getSum().toString(),
                    expense.getCategory(),
                    expense.getAccount().toString(),
                    expense.getNote()
            };

            System.out.println("Writing expense to CSV file");
            WriteToFile.writeExpenseToCSV(data);
            return true;

        } else {
            return true;
        }



    }

}
