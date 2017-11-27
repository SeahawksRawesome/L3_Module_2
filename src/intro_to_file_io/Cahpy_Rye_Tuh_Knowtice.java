package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

public class Cahpy_Rye_Tuh_Knowtice {
	public static void main(String [] args) {
		addCahpy();
	}
	public static void addCahpy() {
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/TheEncryptonator.java", true);
			FileWriter fw2 = new FileWriter("src/intro_to_file_io/READINGDUHMESSAGE.java", true);
			
			/*
			NOTE: To append to a file that already exists, add true as a second parameter when calling the
			      FileWriter constructor.
			      (e.g. FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt", true);)
			*/
			
			fw.write(" //Copyright ® 2017 Du Man");
			fw2.write(" //Copyright ® 2017 Du Man");
			
			
			fw.close();
			fw2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
}
