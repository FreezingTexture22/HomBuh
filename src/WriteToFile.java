import com.opencsv.CSVWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Path;

public class WriteToFile {

    static void writeExpenseToCSV(String[] data) throws Exception {
        // default file path
        File file = new File("C:\\Users\\artelx\\IdeaProjects\\HomBuh\\data1.csv");
        Path path = Path.of(file.getAbsolutePath());

        //URL fileUrl = WritingCSVFileExample.class.getClassLoader().getResource("data.csv");
        CSVWriter writer = new CSVWriter(new FileWriter(path.toString(), true)); //true, if want to append

        //Write the record to file
        writer.writeNext(data, true); // true if want each item in " "

        //close the writer
        writer.close();
    }
}