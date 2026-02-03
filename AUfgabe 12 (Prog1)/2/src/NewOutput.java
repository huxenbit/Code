import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class NewOutput {
    private String date;
    private String fileName;

    // asking user for fileName to read
    public void readDateFromFile(Scanner scanner) {
        System.out.print("Please enter fileName: ");
        fileName = scanner.nextLine();

        try {
            Path path = Path.of(fileName + ".txt");
            date = Files.readString(path);
            System.out.println("Successfully read: " + date);
            parseDateFromFile(date);

        } catch (IOException e) {
            System.err.println("Could not read file!");
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