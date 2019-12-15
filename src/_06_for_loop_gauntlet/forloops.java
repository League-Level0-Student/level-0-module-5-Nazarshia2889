package _06_for_loop_gauntlet;

public class forloops {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}
		for (int i = 2; i < 101; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		for (int i = 1; i < 100; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		for (int i = 0; i < 500; i++) {
			if(i%2==0) {
				System.out.println(i + " is even");
			}
			else {
				System.out.println(i + " is odd");
			}
		}
		for (int i = 0; i < 778; i++) {
			if(i % 7 == 0) {
				System.out.println(i);
			}
		}
		int j = 0;
		for (int i = 2006; i < 2020; i++) {
		
			System.out.println("In "+ i + ", I was " + j + " years old");
			j = j + 1;
		}
	}

}
