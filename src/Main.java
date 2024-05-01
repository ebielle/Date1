import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime day = OffsetDateTime.parse(("2002-03-01T13:00:00Z"));
        String formattedDay1 = day.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("Full format: " + formattedDay1);

        String formattedDay2 = day.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("Medium format: " + formattedDay2);

        String formattedDay3 = day.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("Short format: " + formattedDay3);
    }
}