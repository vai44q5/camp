package day02;

public class CircleOne {
public static void main(String[] args) {
	int year=2008;
	int month=2;
		switch (month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(year+"��"+month+"����31��");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
		    System.out.println(year+"��"+month+"����30��");
		    break;
		case 2:
			if(year%4==0) {
				System.out.println(year+"��"+month+"����29��");
			}
			else {
				System.out.println(year+"��"+month+"����28��");
			}
			break;
		}
}
}
