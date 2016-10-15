package file.finder.system.main;

import java.io.File;

import file.finder.system.finders.Finder;
import file.finder.system.io.InputData;

public class Main {

	public static void main(String[] args) {
		Finder finder = new Finder();
		String path = finder.findFile(InputData.inputData(), InputData.inputData());
        
		System.out.println(path);
	}

}
