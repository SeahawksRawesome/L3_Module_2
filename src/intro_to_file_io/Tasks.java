package intro_to_file_io;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tasks {
	JFrame f1;
	JPanel p1;
	JButton load;
	JButton save;
	JButton add;
	JButton remove;
	public static void main(String[] args) {
		Tasks task = new Tasks();
	//	System.out.println("Teswtst");
	}
	Tasks(){
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
	}
}
