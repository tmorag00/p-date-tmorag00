package es.unileon.prg

class Date {

	private int day;    
	private int month;
	private int year;
	
	int getDay() {
		return day;
	}
	void setDay (int day){
		this.day  = day;
	}
	
	boolean isSameDay (Date another){
		
		if (this.day == another.getday(){
			
			return true;
		}else{
			return false;
		}
	}
}	