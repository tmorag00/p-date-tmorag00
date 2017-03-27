package es.unileon.prg

class Date {

	private int _day;    
	private int _month;
	private int _year;
	
	int getDay() {
		return day;
	}
	void setDay (int day){
		this._day  = day;
	}
	
	int getMonth() {
		return month;
	}
	void setMonth (int month){
		this._month = month;
	}
	
	int getYear() {
		return year;
	}
	void setYear (int year){
		this._year = year;
	}
	
	}
	
	boolean isSameDay (Date another){
		
		if (this._day == another.getDay()){
			
			return true;
		}else{
			return false;
		}
	}
	
	boolean isSameMonth (Date another){
		
		if(this._month == another.getMonth()){
			
			return true;
		}else{
			return false;
		}
	}
	
	boolean isSameYear (Date another){
		
		if (this._year == another.getYear()){
			return true;
		}else{
			return false;
		}
	}
	
	
}	