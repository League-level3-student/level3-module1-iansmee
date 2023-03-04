package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addname = new JButton();
	JButton viewnames = new JButton();
	ArrayList<String> Names = new ArrayList();
	
	public static void main(String[] args) {
		_02_GuestBook guestbook = new _02_GuestBook();
		guestbook.run();
		}
	
		void run() {
			
		
		
	
	
	frame.setVisible(true);
	panel.add(addname);
	panel.add(viewnames);
	frame.add(panel);
	frame.pack();
	addname.addActionListener(this);
	viewnames.addActionListener(this);
	addname.setText("Add Name");
	viewnames.setText("View Names");
	
	
	}
	
	void AddName() {
		String s = JOptionPane.showInputDialog("Enter a name");
	Names.add(s);
	}
	void ViewNames() {
		for (int i = 0; i < Names.size(); i++) {
			String n = Names.get(i);
			int e = i+1;
		System.out.println("Guest#" + e + ": " + n); 
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==addname) {
			AddName();
		}
		if(e.getSource()==viewnames) {
			ViewNames();
		}
	}
	
	
	
	
	
}
