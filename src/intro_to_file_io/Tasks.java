package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Tasks implements ActionListener {
	JFrame f1;
	JPanel p1;
	JButton load;
	JButton save;
	JButton add;
	JButton remove;
	static String allTasks = "Add Tasks here \n";
	static ArrayList<String> TASKS = new ArrayList<String>();

	public static void main(String[] args) {
		Tasks task = new Tasks();
		TASKS.add(allTasks);
		// System.out.println("Teswtst");
		// Write to a file
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/.txt");

			/*
			 * NOTE: To append to a file that already exists, add true as a second parameter
			 * when calling the FileWriter constructor. (e.g. FileWriter fw = new
			 * FileWriter("src/intro_to_file_io/test2.txt", true);)
			 */

			fw.write("\nThis is me writing a message");

			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	Tasks() {
		f1 = new JFrame();
		p1 = new JPanel();
		add = new JButton();
		load = new JButton();
		remove = new JButton();
		save = new JButton();
		f1.setSize(500, 500);
		f1.setVisible(true);
		f1.add(p1);
		p1.add(add);
		p1.add(load);
		p1.add(remove);
		p1.add(save);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add.setText("Add Task");
		load.setText("Load");
		remove.setText("Remove");
		save.setText("Save");
		add.addActionListener(this);
		load.addActionListener(this);
		remove.addActionListener(this);
		save.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == add) {
			String s = JOptionPane.showInputDialog("Add a Tersk?");
			allTasks =  s + "\n";
			TASKS.add(allTasks);
		}
		if (e.getSource() == save) {
			if(!TASKS.isEmpty()) {
				try {
					FileWriter FYLE = new FileWriter("src/intro_to_file_io/TaskPane.txt");
					for(int i = 0; i < TASKS.size(); i++) {
						if(TASKS.get(i) != null) {
							FYLE.write(TASKS.get(i));	
						}
						
						
					}
					
					FYLE.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Saving...");
			}
			
		}
		if (e.getSource() == load) {
			try {
				BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/TaskPane.txt"));

				String line = br.readLine();
				allTasks = "";
				TASKS = new ArrayList<String>();
				while (line != null) {
					allTasks += line + "\n";
					line = br.readLine();
					TASKS.add(line);
				}

				br.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, allTasks);
		}
		if (e.getSource() == remove) {
			
			boolean found = false;
			String text = JOptionPane.showInputDialog("What would you like to remove?");
			for (int i = 0; i < TASKS.size(); i++) {
				if (TASKS.get(i).equals(text)) {
					TASKS.remove(i);
					found = true;
					break;
				}
			}
			if (!found) {
				JOptionPane.showMessageDialog(null, "Task NOT Found. Check spelling again and enter it again.");
			}
		}
	}

}
