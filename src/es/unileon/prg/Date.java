package es.unileon.prg;

class Date {

	private int _day;    
	private int _month;
	private int _year;
	
	public Date (int day, int month, int year){
		this._day = day;
		this._month = month;
		this._year = year;
	}
	
	int getDay() {
		return _day;
	}
	void setDay (int day){
		this._day  = day;
	}
	
	int getMonth() {
		return _month;
	}
	void setMonth (int month){
		this._month = month;
	}
	
	int getYear() {
		return _year;
	}
	void setYear (int year){
		this._year = year;
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
	
	
	