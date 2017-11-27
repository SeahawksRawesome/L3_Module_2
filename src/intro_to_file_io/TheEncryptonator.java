package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class TheEncryptonator {
	public static void main(String[] args) {
		encrypt();
	}

	public static void encrypt() {
		String en = JOptionPane.showInputDialog("GIVE DUH MESS AGE:");
		String f = "";
		for (int i = 0; i < en.length(); i++) {
			f += (char)(en.charAt(i) + i*i);
		}
		System.out.println(f);
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/test3.txt");
			
			/*
			NOTE: To append to a file that already exists, add true as a second parameter when calling the
			      FileWriter constructor.
			      (e.g. FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt", true);)
			*/
			
			fw.write(f);
				
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
  //Copyright ® 2017 Du Man //Copyright ® 2017 Du Man //Copyright ® 2017 Du Man