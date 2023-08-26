package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	
	public static void main(String[] args) {
		_02_LogSearch logsearch = new _02_LogSearch();
		logsearch.run();
	}
	
	
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	HashMap<Integer, String> names = new HashMap<Integer, String>();
	
	
	void run() {
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.add(panel);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		frame.setVisible(true);
		button1.setText("Add set");
		button2.setText("Find set");
		button3.setText("View all sets");
		button4.setText("Remove set");
			frame.pack();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1) {
			String ID = JOptionPane.showInputDialog(null, "Please enter an ID");
			String Name = JOptionPane.showInputDialog(null, "Please enter a name corresponding to that ID");
			int id = Integer.parseInt(ID);
			names.put(id, Name);
			
		}
		if(e.getSource() == button2) {
			String Find = JOptionPane.showInputDialog(null, "Please enter an ID to find a name");
			int find = Integer.parseInt(Find);
			String a=names.get(find);
			if(a != null) {
				System.out.println(names.get(find));
			}
			else {
				System.out.println("There is no name attached to that ID");
			}
		}
		if(e.getSource() == button3) {
			for(Integer i : names.keySet()){
				System.out.println("ID:  " +i + " Name: " +names.get(i));
			}
		}
		if(e.getSource() == button4) {
			String Identification = JOptionPane.showInputDialog(null, "Please enter an ID to remove");
			int ident = Integer.parseInt(Identification);
			String b =names.get(ident);
			if(b !=null) {
				names.remove(ident);
			}
			else {
				System.out.println("That ID is not in the list");
			}
		}
	}
	
	
	
	
}
