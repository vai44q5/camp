package Examination;

public class Sum {
   public static void main(String[] args) {
    long n=270;
    System.out.println(sumDigits(n));
}
   public static int sumDigits (long n) {
	   int sum=0;
	   while(n/10!=0) {
		   sum=sum+(int)n%10;
		   n=n/10;
	   }
	  return sum+(int)n; 
   }
}
