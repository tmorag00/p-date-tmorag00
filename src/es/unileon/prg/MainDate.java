package es.unileon.prg;

public class MainDate {
	
	public static void main (String args []){
	
	
	
		Date today = new Date (27, 03, 2017);
		Date tomorrow = new Date (28, 03, 2017);
		
		System.out.println(today.isSameDay(tomorrow));
		System.out.println(today.isSameMonth(tomorrow));
		System.out.println(today.isSameYear(tomorrow));
		System.out.println(today.isSame(tomorrow));
		System.out.println(today.isSameDay_(tomorrow));
		System.out.println(today.isSameMonth_(tomorrow));
		System.out.println(today.isSameYear_(tomorrow));
		System.out.println(today.monthName());
		System.out.println(today.dayError());
		System.out.println(today.monthSeason());
	}

}