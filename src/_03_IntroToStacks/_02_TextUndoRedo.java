package _03_IntroToStacks;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */
	public static void main(String[] args) {
		_02_TextUndoRedo textundoredo = new _02_TextUndoRedo();
		textundoredo.run();
	}
	
	

	Stack<Character> stack = new Stack<Character>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char letter;
	int code;
	
	void run(){
		
	frame.addKeyListener(this);
	panel.add(label);
	frame.add(panel);
	frame.setVisible(true);
	frame.setPreferredSize(new Dimension(400,400));
	frame.pack();
	
	
	
}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		code = e.getKeyCode();
		
		
		if(code == 8) {
			int length = label.getText().length();
			String  b = label.getText().substring(0, length -1);
			stack.add(letter);
			label.setText(b);
		}
		if(code == 18 && !stack.isEmpty()) {
			char undo = stack.pop();
			label.setText(label.getText() + undo);
		}
		frame.pack();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
	
	
	if(code != 8 && code != 18) {
		letter = e.getKeyChar();
		label.setText(label.getText() + letter);
	}
	
		
		
		
		
		
		
			frame.pack();
		
		
		}
			
		
		
	}
	
	
	
	
