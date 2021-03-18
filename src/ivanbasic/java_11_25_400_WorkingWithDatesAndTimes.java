package ivanbasic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;


public class java_11_25_400_WorkingWithDatesAndTimes implements Lesson {
	public void main() {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		final LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		final LocalDate date2 = LocalDate.of(2015, 1, 20);
		
		final LocalTime time1 = LocalTime.of(6, 15); // hour and minut
		final LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
		final LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
		
		final LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
		final LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
		
		
		final LocalDate date = LocalDate.of(2020, Month.APRIL, 19);
		final LocalTime time = LocalTime.of(21, 23, 00);
		final LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		final DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
		System.out.println(dateTime.format(f)); //19.04.2020 21:23
				
	}
	
	
}
