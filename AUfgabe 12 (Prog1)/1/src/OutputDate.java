import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class OutputDate {
    private String date;

    // asking user for fileName to read
    public void readDateFromFile(Scanner scanner) {
        System.out.print("Please enter fileName: ");
        String fileName = scanner.nextLine();

        // try-with-resources to safely close scanner with file
        try (Scanner fileScanner = new Scanner(new File(fileName + ".txt"))) {
            while (fileScanner.hasNextLine()) {
                date = fileScanner.nextLine();
                parseDateFromFile(date);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File " + fileName + " not found!");
        }
    }

    // parsing date to locale
    private void parseDateFromFile(String newDate) {
        try {
            //parsing date to international standard (ISO-8601)
            LocalDate standardDate = LocalDate.parse(newDate);

            //parsing standardized date to local date
            DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN);
            String formattedDate = standardDate.format(formatter);
            System.out.println(date + " has been successfully validated!");
            System.out.println("Parsed date: " + formattedDate);

        } catch (DateTimeParseException e) {
            System.err.println("Invalid date: " + newDate + " provided! It must be in format: yyyy-MM-dd!");
        }
    }
}
