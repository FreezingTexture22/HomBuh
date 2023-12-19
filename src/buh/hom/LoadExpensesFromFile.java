package buh.hom;

import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class LoadExpensesFromFile {

    private LoadExpensesFromFile() {
    }

    public static List<String[]> loadExpensesFromCSV() {

        // default file path, for test reasons
        String tempFilePath = "C:\\Users\\artelx\\IdeaProjects\\HomBuh\\expenses.csv";

        File file = new File(tempFilePath);
        Path path = Path.of(file.getAbsolutePath());

        //Build reader instance

        try (CSVReader reader = new CSVReader(new FileReader(path.toString()))) {
            return reader.readAll();

        } catch (Exception e) {
            System.out.println(e.toString());

        }//Read all rows at once


        return Collections.emptyList(); //just a placeholder
    }

    public static void loadAtStart() {
        Main.loadedData = loadExpensesFromCSV();
    }

}


