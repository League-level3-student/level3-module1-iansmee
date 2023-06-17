package _01_IntroToArrayLists;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
			Song song = new Song("demo.mp3");

		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
				
	}
	JFrame frame = new JFrame();
			JPanel panel = new JPanel();
			JButton button = new JButton();
			ArrayList<Song> songs = new ArrayList<Song>();
	Random ran = new Random();
	
	Song current;
	
	void surprise() {
		
		Song everywhere = new Song("Garfields.mp3");
		Song vampire = new Song("PopBot.mp3");
		Song free = new Song("Standoff.mp3");
			
			current = free;
			
			songs.add(everywhere);
			songs.add(vampire);
			songs.add(free);
			
			
			
			panel.add(button);
			frame.add(panel);
			button.addActionListener(this);
			button.setText("Surprise Me!");
			frame.setVisible(true);
			frame.pack();
			
			
		
	}
	
	
	public static void main(String[] args) {
		_06_IPodShuffle IPodShuffle = new _06_IPodShuffle();
		
		IPodShuffle.surprise();
		
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		current.stop();
		int x = ran.nextInt(3);
		current = songs.get(x);
		current.play();
	}
}