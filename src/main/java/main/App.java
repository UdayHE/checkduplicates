package main;

import reader.CSVRead;
import writer.CSVWrite;

import java.io.IOException;
import java.util.List;

/**
 * Created by udayhegde
 */
public class App {
    public static void main(String[] args) throws IOException {
        CSVRead csvRead = new CSVRead();
        List<String> allLines = csvRead.readDataLineByLine("/Users/udayhegde/Downloads/CRM_LEAD_REPORT_a15bd762-6769-4aea-95b2-b79ca3b7b21d8546511328475069100.csv");
        List<String[]> duplicateLines = csvRead.getDuplicateLines(allLines, ",");

        CSVWrite csvWrite = new CSVWrite();
        csvWrite.writeDataAtOnce("/Users/udayhegde/Downloads/SGT_DUPLICATES.csv", duplicateLines);
    }
}
