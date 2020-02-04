package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFileUtil {
	
	
	public static String getValueForKey(String Key) throws Exception{
		
		Properties configProperties=new Properties();
		
		FileInputStream fis=new FileInputStream("D:\\Karunakar\\StockAccounting_Hybrid\\PropertiesFile\\Enviroment.properties");
		
		configProperties.load(fis);
		
		return configProperties.getProperty(Key);
		
	}

}
