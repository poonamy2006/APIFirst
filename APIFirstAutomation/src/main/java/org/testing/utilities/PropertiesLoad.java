package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

//purpose of this method--------to load any properties file
//input parameter-------------file path
//output parameter: object of properties class

public class PropertiesLoad {

public static Properties handleProperties(String path) throws IOException {
	File f = new File(path);
	FileReader fr = new FileReader(f);
	Properties pr = new Properties();
	pr.load(fr);
	return pr;
	
}
}
