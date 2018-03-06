package Enum;

import java.util.Calendar;

public class Main2 {
	public static void main(String[] args) {
		
	
	Week today = Week.SUN;
	String name=today.name();
	System.out.println(name);
		
	int ordinal = today.ordinal();
	System.out.println(ordinal);
	
	Week day1 = Week.MON;
	Week day2 = Week.WEN;
	
	int result  = day2.compareTo(day1);
	System.out.println(result);
	
	Week weekday = Week.valueOf("SUN");
	if(weekday == Week.SUN) {
	System.out.println("주말이군요");
	} 
	
	else {
		System.out.println("평일");
	}
	
	Week[] days = Week.values(); 
	for (Week a :  days) {
		System.out.println(a);
	}
	
}
}