package writer;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by udayhegde
 */
public class CSVWrite {
    public void writeDataAtOnce(String filePath, List<String[]> allLines) throws IOException {
        File file = new File(filePath);
        FileWriter outputFile;
        CSVWriter writer = null;
        try {
            outputFile = new FileWriter(file);
            writer = new CSVWriter(outputFile);
            writer.writeAll(allLines);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            writer.close();
        }
    }
}
