package file.finder.system.finders;

import java.io.File;
import java.io.FilenameFilter;

public class FinderMask implements FilenameFilter {

	private String mask;

	public FinderMask(String mask) {
		this.mask = mask;
	}

	@Override
	public boolean accept(File dir, String name) {
		if (mask.equals("*"))
			return true;

		else if (mask.equals("*dir"))
			return (new File(dir, name).isDirectory());

		else
			return (name.endsWith(mask));
	}

}
