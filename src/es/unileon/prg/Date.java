package es.unileon.prg;

class Date {

	private int _day;    
	private int _month;
	private int _year;
	
	public Date (int day, int month, int year) throws DateException{
		this._day = day;
		if(_month >= 1 && _month <= 12){
			this._month = month;
		}else{
			throw new DateException("Mes"+_month+" no valido"+"Valores posibles entre 1 y 12");
		}
		
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
	
	boolean isSame (Date another){
		
		if (this.isSameYear(another) && this.isSameMonth(another) && this.isSameDay(another)){
			return true;
		}else{
			return false;
		}
	}
	
	boolean isSameDay_ (Date another){
		return this._day == another.getDay();
	}
	
	boolean isSameMonth_ (Date another){
		return this._month == another.getMonth();
	}
	
	boolean isSameYear_ (Date another) {
		return this._year == another.getYear();
	}
	
	public String monthName() {
		String name = null;
		switch (_month){
			
			case 1: 
				name = "January";
				break;
			case 2:
				name = "February";
				break;
			case 3:
				name = "March";
				break;
			case 4:
				name = "April";
				break;
			case 5:
				name = "May";
				break;
			case 6:
				name = "June";
				break;
			case 7:
				name = "July";
				break;
			case 8:
				name = "August";
				break;
			case 9:
				name = "September";
				break;
			case 10:
				name = "October";
				break;
			case 11:
				name = "November";
				break;
			case 12:
				name = "December";
				break;
		}
	return name;
	}
	
	public String dayError(){
		
		String sentencia = null;
		String error = "dia equivocado";
		String acierto = "dia correcto";
		
		switch (_month){
			
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(this._day > 1 || this._day < 31){
					sentencia =  acierto;
				}else{
					sentencia = error;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if(this._day > 1 || this._day < 30){
					sentencia = acierto;
				}else{
					sentencia = error;
				}
				break;
			case 2:
				if(this._day > 1 || this._day < 28){
					sentencia = acierto;
				}else{
					sentencia = error;
				}
				break;
		}
		return sentencia;
	}
	
	String monthSeason (){
		String season = null;
		
		switch (_month){
			
			case 1:
			case 2:
			case 3:
			case 12:
			 season = "Winter";
			 break;
			
			case 4:
			case 5:
			case 6:
				season = "Spring";
				break;
				
			case 7:
			case 8:
			case 9:
				season = "Summer";
				break;
			case 10:
			case 11:
				season = "Autumn";
				break;
		}
		return season;
	}
	
	public int monthsLeft() {
		
		int cont = 0;
		
		for (int i = _month ; i < 12; i++){
			 cont = cont +1;
		}
		return cont;
	}
	
	public String toString(){
		
		return this._day+ " / " + this._month + "/" this._year;
	}
	
	public String datesUntilEM(){
		
		int dom = 0;
		
		switch(_month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				dom = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				dom = 30;
				break;
			case 2:
				dom = 28;
				break;
		}
		
		do{
			this._day = this._day + 1;
			return this._day+ " / " + this._month + "/" this._year;
		}while(int i = this._day; i < dom; i++ )	
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

	
	
	