package buh.hom;

import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.List;

public class LoadExpensesFromFile {

    private LoadExpensesFromFile() {}

    public static List<String[]> loadExpensesFromCSV() throws Exception {

        // default file path, for test reasons
        File file = new File("C:\\Users\\artelx\\IdeaProjects\\HomBuh\\data1.csv");
        Path path = Path.of(file.getAbsolutePath());

        //Build reader instance
        CSVReader reader = new CSVReader(new FileReader(path.toString()));

        //Read all rows at once
        return reader.readAll();

    }

    public static void loadAtStart() throws Exception {
        Main.loadedData = loadExpensesFromCSV();
    }

}


