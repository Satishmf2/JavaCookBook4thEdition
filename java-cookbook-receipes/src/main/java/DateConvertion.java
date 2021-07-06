import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateConvertion {
    public static void main(String[] args) {

//        2021/07/05
//        2021-07-05
//        5 July, 2021 8:00 PM

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/LL/dd");
        System.out.println(dateTimeFormatter.format(LocalDate.now()));

        //parse a string using the dateTimeFormatter
        System.out.println(LocalDate.parse("2021/07/05",dateTimeFormatter));

       // Format a Date and Time without timezone information
        DateTimeFormatter nTZ =
                DateTimeFormatter.ofPattern("d MMMM, yyyy h:mm a");
        System.out.println(ZonedDateTime.now().format(nTZ));
    }
}
