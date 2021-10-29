package collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class property_demo {

	public static void main() throws IOException {
	  FileInputStream fis=new FileInputStream("E:\\Software Testing\\Java\\Workspace\\javabasic\\src\\collection\\testdata.properties");
	 Properties prop=new Properties();
	 prop.load(fis);
	 
	  String appUrl = prop.getProperty("appUrl");
	  System.out.println(appUrl);

	}
	
	public String getvalueFromProp(String propLocation, String key) {
		FileInputStream fis;
		Properties prop=new Properties();
		try {
			fis=new FileInputStream(propLocation);
			
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e) {
		e.printStackTrace();	
		}
		return prop.getProperty(key);
		
	}

}
