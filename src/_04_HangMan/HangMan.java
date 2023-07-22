package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener{
	
	Stack<String> words = new Stack<String>();
	
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	
	
	
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
	
	String currentword = words.pop();
	
	
	
	
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
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
