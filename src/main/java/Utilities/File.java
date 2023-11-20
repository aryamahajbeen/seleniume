package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class File {
	public static String website(String key) throws IOException  {
		Properties prop=new Properties();
		String filepath=System.getProperty("user.dir")+"\\src\\test\\resources\\browser_file\\Browser.property";
		FileInputStream file=new FileInputStream(filepath);
		prop.load(file);
		String value=(prop.getProperty(key));
		return value;
	}
}
