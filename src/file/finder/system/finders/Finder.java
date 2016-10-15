package file.finder.system.finders;

import java.io.File;
import java.io.IOException;

import file.finder.system.io.InputData;

public class Finder {

	public String findFile(String startPath, String fileNameToFind) {

		String path = "";
		File startCatalog = new File(startPath);

		File[] listFiles = startCatalog.listFiles();

		for (File fileInCatalog : listFiles) {
			if (fileInCatalog.isDirectory()) {
				findFile(fileInCatalog.getAbsolutePath(), fileNameToFind); // recursive
			} else {
				if (fileNameToFind.equals(fileInCatalog.getName())) {
					try {
						path = fileInCatalog.getCanonicalPath();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

		}

		return path;
	}

	public String findMask(String mask, String startPath) {
		System.out.println("Enter mask");
		FinderMask maskFinder = new FinderMask(InputData.inputData());
		String path = "";
		File startCatalog = new File(startPath);

		File[] listFiles = startCatalog.listFiles();
        if (maskFinder.accept(startCatalog, mask)){
        	
        }
		for (File fileInCatalog : listFiles) {
			if (fileInCatalog.isDirectory()) {
				findFile(fileInCatalog.getAbsolutePath(), startPath); // recursive
			} else {
				if (startPath.equals(fileInCatalog.getName())) {
					try {
						path = fileInCatalog.getCanonicalPath();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

		}
		return path;
	}
}