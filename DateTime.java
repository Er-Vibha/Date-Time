import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTime {
    public static void main(String[] args) {
        //Java assumes 1900 is the start year
        System.out.println(System.currentTimeMillis()/1000/3600/24/365); //It will give the year passed since 1970

        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getMonth());

        Calendar c=Calendar.getInstance(TimeZone.getTimeZone("Asia/Calcutta"));
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        LocalDate da=LocalDate.now();
        System.out.println(da);
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);
        LocalTime t=LocalTime.now();
        System.out.println(t);
        DateTimeFormatter Df=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String MyDate=ldt.format(Df);
        System.out.println(MyDate);
   }
}
