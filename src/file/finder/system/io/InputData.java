package file.finder.system.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputData {
	public static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

	public static String inputData() {
		String str = "";
		try {
			System.out.println("Enter DATA :");
			str = buffer.readLine();
		} catch (IOException e) {
			System.err.println("Cannot input statement !");
		}
		return str;
	}

}
