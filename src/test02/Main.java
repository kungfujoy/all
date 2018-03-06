package test02;

import java.util.Calendar;

import Enum.Week;

public class Main {
	public static void main(String[] args) {
		Week today = null;
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch (week) {
		case 1:
			today=Week.SUN;
			break; 

		case 2:
			today=Week.MON;
			break;
		}
		
		System.out.println(today);
}
		
	

}