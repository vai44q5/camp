package dayone;

public class Three {
	public static void main(String[] args) {
		int day=1;
		double up=1;//初始功力
		double down =1;
		while(day<=365)
		{
			up=up+0.01*up;//上升
			down=down-0.01*down;//下降
			day=day+1;
		}
		System.out.println(up);
		System.out.println(down);
	}

}
