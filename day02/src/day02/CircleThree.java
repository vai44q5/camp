package day02;

public class CircleThree {
   public static void main(String[] args) {
	   int a=36;
	   int b=20;
	   int c=0;
	   int min=Math.min(a, b);
	   for (int i=1;i<=min;i++) {
		   if(a%i==0&&b%i==0) {
			   c=i;
		   }
	   }
	   System.out.println(a+"和"+b+"的最大公约数是"+c);
   }
}
