package _04_HangMan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	
	
	
	
	public static void main(String[] args) {
		HangMan hangman = new HangMan();
		hangman.run();
		
	}
	
	
	
	
	Stack<String> words = new Stack<String>();
	
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	JButton yes = new JButton();
	JButton no = new JButton();
	char letter;
	String currentword;
	String display = "";
	int lives = 15;
	int tries = 0;
	
	
	void newword() {
		display = "";
		for (int i = 0; i < currentword.length(); i++) {
			display = display + "_";
			
			label.setText(display);
			frame.pack();
		}
		
		lives = 15;
		label.setText(display);
		frame.pack();
	}
	
	
	void run(){
		panel.add(label);
		frame.add(panel);
		frame.addKeyListener(this);
		frame.setVisible(true);
		frame.pack();
		
		
		
		
		
	String numberofwords = JOptionPane.showInputDialog(null, "please enter a number between 1 and 266 inclusive");
		
	int Numberofwords = Integer.parseInt(numberofwords);
	
	for (int i = 0; i < Numberofwords; i++) {
		String word = Utilities.readRandomLineFromFile("dictionary.txt");
		words.push(word);
	}
	
	currentword = words.pop();
	
	newword();
	
	
	
	}



	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
		
		letter = e.getKeyChar();
		for (int i = 0; i < currentword.length(); i++) {
			if(letter == currentword.charAt(i)) {
				String p1 = display.substring(0, i);
				String p2 = "";
				if(i+1<currentword.length()) {
				p2 = display.substring(i+1);
				}
				display = p1 + letter + p2;
				label.setText(display);
				frame.pack();
			}
			else {
				tries++;
			}
			
		}
		
		if(tries<currentword.length()) {
			
		}
		else {
			lives --;
		}
		
		
		if(display.equals(currentword)) {
			JOptionPane.showMessageDialog(null, "Congratulations on getting the word");
			display = "";
			currentword = words.pop();
			lives = 15;
			newword();
			
			frame.pack();
			if(words.isEmpty()) {
				JOptionPane.showMessageDialog(null, "You completed all the words!");
			}
		}
		if(lives == 0) {
			String yesno = JOptionPane.showInputDialog("you ran out of guesses, would you like to try again with a new word?(yes or no)");
			if(yesno.equals("yes")) {
				currentword = words.pop();
				display = "";
				lives = 15;
				newword();
			}
			if(yesno.equals("no") ) {
				frame.dispose();
			}
			else {
				currentword = words.pop();
				display = "";
				lives = 15;
				newword();
			}
		}
		
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
}
