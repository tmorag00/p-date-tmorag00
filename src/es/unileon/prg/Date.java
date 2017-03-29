package es.unileon.prg;

class Date {

	private int day;    
	private int month;
	private int year;
	
	public Date (int day, int month, int year) throws DateException{
	
		if(month < 1 || month > 12){
			throw new DateException("Mes"+month+" no valido"+"Valores posibles entre 1 y 12");
		}else if(!isValidDay(day, month)){
			throw new DateException("Dia "+day+" no valido"+" para el mes "+month);
			
		}else{
			this.month = month;
			this.day = day;
		}
		
		this.year = year;
	}
	
	int getDay() {
		return day;
	}
	void setDay (int day){
		this.day  = day;
	}
	
	int getMonth() {
		return month;
	}
	void setMonth (int month){
		this.month = month;
	}
	
	int getYear() {
		return year;
	}
	void setYear (int year){
		this.year = year;
	}
	
	
	boolean isSameDay (Date another){
		
		if (this.day == another.getDay()){
			
			return true;
		}else{
			return false;
		}
	}
	
	boolean isSameMonth (Date another){
		
		if(this.month == another.getMonth()){
			
			return true;
		}else{
			return false;
		}
	}
	
	boolean isSameYear (Date another){
		
		if (this.year == another.getYear()){
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
		return this.day == another.getDay();
	}
	
	boolean isSameMonth_ (Date another){
		return this.month == another.getMonth();
	}
	
	boolean isSameYear_ (Date another) {
		return this.year == another.getYear();
	}
	
	public String monthName() {
		String name = null;
		switch (month){
			
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
	
	private boolean isValidDay(int day, int month){
		
		int dom = getNumDays (month);
		if(day > 1 && day < dom ){
			return true;
		}else{
			return false;
		}
	}
	
	String monthSeason (){
		String season = null;
		
		switch (month){
			
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
		
		for (int i = month ; i < 12; i++){
			 cont = cont +1;
		}
		return cont;
	}
	
	public String toString(){
		StringBuffer fecha = new StringBuffer ();
		fecha.append(day+"/");
		fecha.append(month+"/");
		fecha.append(year);
		return fecha.toString();
	}
	
	public String datesUntilEM(){
		
		int day2 = 0;
		int dom = getNumDays(month);
			
		for(int i = day; i <= dom ; i++){
			Date fecha = new Date (i , month, year);
			fecha.append ();
		}	
		return fecha;
		
	}
	
	private int getNumDays (int month){
		
		int dom = 0; 
		
		switch(month){
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
	return dom;
	}
	
	
	
	
	
	
	
	
	
	
	
}

	
	
	