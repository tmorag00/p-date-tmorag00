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
	
}boolean isSameDay (Date another){
		
		if (this._day == another.getDay()){
			
			return true;
		}else{
			return false;
		}
	}
	
	
}	