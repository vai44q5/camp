package Examination;

public class MonthDays {
public static void main(String[] args) {
	int year=2013;
	int month=2;
	System.out.print(year+"年"+month+"月有"+getDays(year, month)+"天");
}
public static int getDays(int year, int month) {
	int days=0;
	switch(month) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		days=31;
		break;
	case 4:
	case 6:
	case 9:
	case 11:
		days=30;
		break;
	case 2:	
		if(year%4==0) {
			days=29;
			break;
		}else {
			days=28;
			break;
		}
	}
	return days;
}
}
