package _07_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class skill {
	
		public static void main(String[] args) {
			skill skills = new skill();
          	skills.skill1();
          	skills.skill2();
          	skills.skill3();
          	skills.skill4();
          	skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have
String dimes = JOptionPane.showInputDialog(null, "How many dimes do you have?");
int x = Integer.parseInt(dimes);
int next = x * 10;
JOptionPane.showMessageDialog(null, "You have " + next + " cents");

// Tell them how many cents they have (hint multiply by 10)

String height = JOptionPane.showInputDialog(null, "How tall are you (in inches)?:");
int y = Integer.parseInt(height);
if(y < 36) {
	JOptionPane.showMessageDialog(null, "Eat your Wheaties");
}


// Ask the user how tall they are (inches)




// If they are shorter than 36 inches, tell them to eat their Wheaties




}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console 
for(int i = 0; i<31;i++) {
	if(i%3 == 0) {
		System.out.println(i);
	}
}






}

void skill3() { // Get a random number that is less than 20 and print it to the console 
Random ran = new Random();

int z = ran.nextInt(20);
System.out.println(z);
// Get another random number that is less than 10 and print it to the console 
int number = ran.nextInt(10);
System.out.println(number);

int difference = z - number;

JOptionPane.showMessageDialog(null, "The difference is " +  difference);

// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 



}

void skill4() { // In a pop-up, ask the user for the city they live in 

String city = JOptionPane.showInputDialog(null, "What city do you live in?");

// If they answered "San Diego", tell them they live in America's Finest City 
if(city.equalsIgnoreCase("San Diego")) {
	JOptionPane.showMessageDialog(null, "You live in America's Finest City");
}
else {
	JOptionPane.showMessageDialog(null, "You should move to San Diego");
	
}


// Otherwise, tell them to move to San Diego 

int cars = 2;
if(cars == 0) {
	JOptionPane.showMessageDialog(null, "I bet you use public transportation");
}
else if(cars == 1) {
	JOptionPane.showMessageDialog(null, "Toyota");
}
else if(cars >=2) {
	JOptionPane.showMessageDialog(null, "4");
}

// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 



// If there is 1 car, use a pop-up to display the make/model of the car 



// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 



}

void skill5() { // In a pop-up, ask the user for the name of their school 
	String school = JOptionPane.showInputDialog(null, "What is the name of your school?");

JOptionPane.showMessageDialog(null, school + " is a fantastic school!");

// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 



}
}
		

		



