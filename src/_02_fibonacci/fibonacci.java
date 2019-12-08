package _02_fibonacci;

public class fibonacci {
	public static void main(String[] args) {
		int one = 0;
		int two = 1;
		System.out.println(one);
		System.out.println(two);
		//code
		for(int i = 0;i<10;i++) {
			int third  = one + two;
			System.out.println(third);
			one = two;
			two = third;
		}
	}

}
