package es.unileon.prg;

public class MainDate {
	
	public static void main (String args []){
	
	
		try{
			Date today = new Date (27, 03, 2017);
			System.out.println(today);
		}catch (DateException e){
			System.out.println(e.getMessage());
		}
		try{
			Date tomorrow = new Date (28, 03, 2017);
			System.out.println(today);
		}catch (DateException e){
			System.out.println(e.getMessage());
		}
		
		
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
		System.out.println(today.monthsLeft());
		System.out.println(today.toString());
		System.out.println(today.datesUntilEM());
	}

}