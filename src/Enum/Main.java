package Enum;

import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		
	
	Week today = null;
	
	Calendar cal= Calendar.getInstance();
	int week = cal.get(Calendar.DAY_OF_WEEK);
	System.out.println(week);
	
	
	switch(week){
	case 1:
		today = Week.SUN;
		break;
	case 2:
		today = Week.MON;
		break;
	case 3:
		today = Week.TUE;
		break;
	case 4:
		today = Week.WEN;
		break;
	case 5:
		today = Week.THUR;
		break;
	case 6:
		today = Week.FRI;
		break;
	case 7:
		today = Week.SAT;
		break;

	}	 
	System.out.println(today);
		
	}
}
