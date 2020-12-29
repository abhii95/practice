package interview;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetCurrentDateTime {

	private static final DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

	public static void main(String[] args) {

		// To print current date
		Date date = new Date();
		System.out.println(sdf.format(date));

		// To print current date
		Calendar calendar = Calendar.getInstance();
		System.out.println(sdf.format(calendar.getTime()));

		// Manipulate day/month/year of date
		calendar.setTime(new Date());

		calendar.add(Calendar.DAY_OF_WEEK, Calendar.DAY_OF_WEEK + 1);
		calendar.add(Calendar.MONTH, Calendar.MONTH + 1);
		System.out.println(sdf.format(calendar.getTime()));

//		LocalDateTime now = LocalDateTime.now();
//		System.out.println(dtf.format(now));

//        LocalDate localDate = LocalDate.now();
//        System.out.println(DateTimeFormatter.ofPattern("yyy/MM/dd").format(localDate));

	}

}