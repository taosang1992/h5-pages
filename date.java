import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class MyClass {
	public static void main(String[] args) {
		LocalDate myDate = LocalDate.now();
		LocalTime myTime = LocalTime.now();
		LocalDateTime myDateTime = LocalDateTime.now();
		System.out.println(myDate); // 2019-07-19
		System.out.println(myTime); // 08:01:03.469666
		System.out.println("Before formatting : " + myDateTime); // Before formatting : 2019-07-19T08:07:32.750522
		
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		String formatedDateTime = myFormatObj.format(myDateTime);
		
		System.out.println("After formatting : " + formatedDateTime); // After formatting : 2019-07-19 08:07:32
	}
}