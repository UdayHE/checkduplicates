package reader;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.*;

/**
 * Created by udayhegde
 */
public class CSVRead {
    public List<String> readDataLineByLine(String file) {
        List<String> allLines = null;
        try {
            FileReader filereader = new FileReader(file);
            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;
            allLines = new ArrayList<>();
            while ((nextRecord = csvReader.readNext()) != null) {
                allLines.add(Arrays.toString(nextRecord));
            }
            return allLines;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return allLines;
    }

    public List<String[]> getDuplicateLines(List<String> allLines, String separator) {
        List<String> uniqueRows = new ArrayList<>();
        System.out.println("Rows:" + allLines.size());

        List<String[]> duplicateLines = new ArrayList<>();
        for (String row : allLines) {
            if (!uniqueRows.contains(row)) {
                uniqueRows.add(row);
            } else {
                duplicateLines.add(row.split(separator));
            }
        }
        System.out.println("Unique Rows:" + uniqueRows.size());
        return duplicateLines;
    }
}
