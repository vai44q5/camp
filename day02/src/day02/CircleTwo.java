package day02;

public class CircleTwo {
   public static void main(String[] args) {
	   double a=1.0;
	   double b=-4.0;
	   double c=4.0;
	   double x1,x2;
	   System.out.println("a="+a+" b="+b+" c="+c);
	   double flag=Math.pow(b, 2)-4*a*c;
	   if (flag<0) {
		   System.out.println("方程无解");
	   }else {
		   x1=(-b+Math.sqrt(flag))/(2*a);
		   x2=(-b-Math.sqrt(flag))/(2*a);
		   System.out.println("方程的解为"+x1+","+x2);
	   }
   }
}
