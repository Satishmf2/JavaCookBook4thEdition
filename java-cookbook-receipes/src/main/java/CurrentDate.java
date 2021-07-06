import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;

//Program to get zone specific time
public class CurrentDate {
    private static ZoneId zoneId = ZoneId.of( "America/Los_Angeles" );

    private static Clock clock=Clock.system(zoneId);

    public static void main(String[] args) {
        System.out.println("It is now :" + LocalDateTime.now(clock));


    }
}
