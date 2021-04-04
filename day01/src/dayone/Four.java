package dayone;

public class Four {
	public static void main(String[] args) {
	
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		double c=Double.parseDouble(args[2]);
		double d=Double.parseDouble(args[3]);
		double distance=Math.sqrt(Math.pow(a-b, 2)+Math.pow(c-d, 2));
	    System.out.println(distance);
	}

}
