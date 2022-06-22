package propoties_files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Intro_1 {
public static void main(String[] args) throws IOException {
	Properties prop=new Properties();
	FileInputStream fis=new FileInputStream("/QAfox_tutorials/Files/Property_Files/data_01.properties") ;
	prop.load(fis);
	System.out.println(prop.getProperty("name"));
	System.out.println(prop.setProperty("result", "pass"));
	FileOutputStream fos=new FileOutputStream("/QAfox_tutorials/Files/Property_Files/data_01.properties");
	prop.store(fos, null);
	
	
	
}
}
