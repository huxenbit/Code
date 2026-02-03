import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class InputDate {
    private String fileName;
    private String date;

    // asking user for input to write into file (fileName & iso-date)
    public void getDateInput(Scanner scanner) {

        System.out.println("Please enter: fileName\ndate: yyyy-MM-dd");
        fileName = scanner.nextLine();
        date = scanner.nextLine();

        //adjusting fileName and scanned date
        fileName = fileName.trim().toLowerCase().replace(" ", "_");
        date = date.trim();

        if (!isFileExisting(fileName)) {
            parseDate(date);
        }
        else {
            return;
        }
    }

    // parsing date to locale
    private void parseDate(String newDate) {
        try {
            //parsing date to international standard (ISO-8601)
            LocalDate standardDate = LocalDate.parse(newDate);

            //parsing standardized date to local date
            DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN);
            String formattedDate = standardDate.format(formatter);
            System.out.println(date + " has been successfully validated!");
            writeDateToFile(fileName, formattedDate);

        } catch (DateTimeParseException e) {
            System.err.println("Invalid date: " + newDate + " provided! It must be in format: yyyy-MM-dd!");
        }
    }

    //check if file is already existing
    private boolean isFileExisting(String fileName) {
        File file = new File(fileName + ".txt");
        if (file.exists()) {
            System.err.println("File " + fileName + ".txt" + " already exists!");
            return true;
        }
        return false;
    }

    //write non-existing file
    private void writeDateToFile(String newFileName, String newFormattedDate) {
        boolean isWritten = false;

        //try-with-resources to safely use buffered- and file-writer
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(newFileName + ".txt"))) {
           writer.write(newFormattedDate);
           writer.newLine();
           isWritten = true;

        } catch (IOException e) {
           System.err.println("Could not add date " + date + " to file!");
        }

        if (isWritten) {
           System.out.println("Date " + date + " successfully added to file!");
        }
    }
}
