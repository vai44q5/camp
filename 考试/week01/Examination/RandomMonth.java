package Examination;

public class RandomMonth {
	public static void main(String[] args) {
		String[] s= {"һ�·�","���·�","���·�","���·�","���·�","���·�","���·�","���·�","���·�","ʮ�·�","ʮһ�·�","ʮ���·�"};
	    int i=0;
	    i=(int)(Math.random()*12+1);
	    System.out.println(i);
	    System.out.println(s[i-1]);
	}
    }


