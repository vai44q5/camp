package dayone;

public class Two {
	public static void main(String[] args) {
		double x1=0.3;
		double x2=0.5;
		double y1=0.5;
		double y2=0.9;
		double x=Math.pow(x1-x2,2);
		double y=Math.pow(y1-y2,2);
		double d=Math.sqrt(x+y);
		System.out.println(d);
	}
}
