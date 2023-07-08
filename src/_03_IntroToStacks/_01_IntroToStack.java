package _03_IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> Doubles = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		Random ran = new Random();
		for (int i = 0; i < (100); i++) {
			Doubles.push(ran.nextDouble()*100);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String number1 = JOptionPane.showInputDialog("Enter one number between 0 and 100");
		String number2 = JOptionPane.showInputDialog("Enter another *different* number between 0 and 100");
		
		Double Number1 = Double.parseDouble(number1);
		Double Number2 = Double.parseDouble(number2);
		Double before;
		Double after;
		if(Number1 > Number2) {
			before = Number2;
			after = Number1;
		}
		else {
			before = Number1;
			after = Number2;
		}
		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		System.out.println("Num 1:  "+before);
		System.out.println("num 2:  "+after);
		System.out.println(" ");
		System.out.println("Popping elements off Stack...");
		System.out.println("Elements between "+before+" and "+after+":");
		
		for (int i = 0; i < Doubles.size(); i++) {
			Double d =Doubles.pop();
			if(d> before && d< after) {
				System.out.println(d);
			}
		}
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
