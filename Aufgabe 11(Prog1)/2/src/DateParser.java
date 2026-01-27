import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class DateParser {

    public void input() {
        // Scanner in try-with-resources, wird automatisch geschlossen
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Bitte ein Datum im ISO-Format yyyy-MM-dd eingeben: ");
            String input = scanner.nextLine();

            try {
                // ISO-8601 Datum parsen
                LocalDate date = LocalDate.parse(input); // Standard-ISO-Format

                // Lokalisierte Ausgabe (z. B. auf Deutsch)
                DateTimeFormatter formatter = DateTimeFormatter
                        .ofLocalizedDate(FormatStyle.FULL)
                        .withLocale(Locale.GERMAN); // Locale anpassen: DE, EN, FR, etc.

                String formattedDate = date.format(formatter);

                System.out.println("Das Datum lautet: " + formattedDate);

            } catch (DateTimeParseException e) {
                // Spezifische Fehlermeldung für falsches Format
                System.out.println("Fehler: Ungültiges Datum! Bitte im Format yyyy-MM-dd eingeben.");
            }

        } // Scanner wird hier automatisch geschlossen
    }
}
