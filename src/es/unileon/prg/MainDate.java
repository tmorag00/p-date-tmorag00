package es.unileon.prg

class MainDate {
	
	public static void main (string args []){
	
	Date today, tomorrow;
	
		today = new Date (27,3,2017);
		tomorrow = new Date (28,3,2017);
		
		System.out.println(today.isSameDay(tomorrow));
		System.out.println(today.isSameMonth(tomrrow));
		System.out.println(today.isSameYear(tomorrow));
		System.out.println(today.isSame(tomorrow));
		today.monthName();
		
	}

}