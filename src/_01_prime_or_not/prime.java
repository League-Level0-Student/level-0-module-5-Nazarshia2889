package _01_prime_or_not;

import javax.swing.JOptionPane;

public class prime {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog(null, "Give me a number and I will tell you if the number is prime.");
		int number = Integer.parseInt(answer);
		boolean primefound = true;
		for(int i = 2;i<number;i++) {
            if(number % i == 0) {
				JOptionPane.showMessageDialog(null, "The number is not prime.");
				primefound = false;
				break;
			}			
		}
		if(primefound == true) {
			JOptionPane.showMessageDialog(null, "The number is prime!");
		}
		
	}

}
