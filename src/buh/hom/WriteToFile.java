package buh.hom;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;

public class WriteToFile {
    private WriteToFile() {
    }

    static void writeExpenseToCSV(String[] data) throws Exception {
        // default file path
        String tempFilePath = "C:\\Users\\artelx\\IdeaProjects\\HomBuh\\expenses.csv";

        File file = new File(tempFilePath);
        Path path = Path.of(file.getAbsolutePath());

        CSVWriter writer = new CSVWriter(new FileWriter(path.toString(), true)); //true, if want to append

        //Write the record to file
        writer.writeNext(data, true); // true if want each item in " "

        //close the writer
        writer.close();
    }

    static void writeAccountsToCSV(String[] data) throws Exception {
        // default file path
        String tempFilePath = "C:\\Users\\artelx\\IdeaProjects\\HomBuh\\accounts.csv";

        File file = new File(tempFilePath);
        Path path = Path.of(file.getAbsolutePath());

        CSVWriter writer = new CSVWriter(new FileWriter(path.toString(), false)); //true, if want to append

        //Write the record to file
        writer.writeNext(data, true); // true if want each item in " "

        //close the writer
        writer.close();
    }

}