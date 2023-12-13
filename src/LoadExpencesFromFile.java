import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class LoadExpencesFromFile {
    public static List<String[]> loadExpencesFromCSV() throws Exception {
        // default file path
        File file = new File("C:\\Users\\artelx\\IdeaProjects\\HomBuh\\data1.csv");
        Path path = Path.of(file.getAbsolutePath());

        //Build reader instance
        CSVReader reader = new CSVReader(new FileReader(path.toString()));

        //Read all rows at once
        List<String[]> allRows = reader.readAll();

        return allRows;
    }
}
