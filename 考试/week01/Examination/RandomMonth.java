package Examination;

public class RandomMonth {
	public static void main(String[] args) {
		String[] s= {"一月份","二月份","三月份","四月份","五月份","六月份","七月份","八月份","九月份","十月份","十一月份","十二月份"};
	    int i=0;
	    i=(int)(Math.random()*12+1);
	    System.out.println(i);
	    System.out.println(s[i-1]);
	}
    }


