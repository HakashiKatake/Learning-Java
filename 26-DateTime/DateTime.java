import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime datet = LocalDateTime.now();
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        Instant instant = Instant.now();
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime);

        LocalDate Ldate = LocalDate.of(2024, 12,25);
        System.out.println(Ldate);

        LocalDate date1 = LocalDate.of(2024, 12,25);
        LocalDate date2 = LocalDate.of(2024, 12,3);

        if(date1.isBefore(date2)) {
            System.out.println(date1 + " is earlier than" + date2);
        } else if(date1.isEqual(date2)) {
            System.out.println("both are equal");
        }
        
        else {
            System.out.println(date1 + "is later than" + date2);
        }
        


        System.out.println(time);
        System.out.println(date);
        System.out.println(datet);
        System.out.println(instant);
    }
}
