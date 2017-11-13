package intro_to_file_io;

import javax.swing.JOptionPane;

public class TheEncryptonator {
	public static void main(String[] args) {
		encrypt();
	}

	public static void encrypt() {
		String en = JOptionPane.showInputDialog("GIVE DUH MESS AGE:");
		String e = "";
		for (int i = 0; i < en.length(); i++) {
			e += (char)(en.charAt(i) + i^2);
		}
		System.out.println(e);
	}
}
