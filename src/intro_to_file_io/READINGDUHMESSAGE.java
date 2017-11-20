package intro_to_file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class READINGDUHMESSAGE {
	public static void main(String [] args) {
		Reader();
	}
	public static void  Reader() {
		//Read from a file one line at a time
		String fileContent = "";
				try {
					BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/test3.txt"));
					
					String line = br.readLine();
					
					while(line != null){
						fileContent += line;
						System.out.println(line);
						line = br.readLine();
					}
					
					br.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String f = "";
				for(int i = 0; i < fileContent.length(); i++) {

					f += (char)(fileContent.charAt(i) - i*i);
					
				}
				System.out.println(f);
	}
}
