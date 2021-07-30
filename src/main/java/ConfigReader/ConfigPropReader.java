package ConfigReader;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigPropReader {

	private Properties prop;
	private FileInputStream ip;

	public Properties initLangProp() {
		
		//mvn clean install -Dlang="french"
		
		String language = System.getProperty("lang");
		
		System.out.println("lang is : " + language);
		prop = new Properties();
		try {
			switch (language.toLowerCase()) {
			case "english":
				ip = new FileInputStream("./src/main/resources/lang.eng.properties");
				break;
			case "french":
				ip = new FileInputStream("./src/main/resources/lang.french.properties");
				break;
			case "russian":
				ip = new FileInputStream("./src/main/resources/lang.russian.properties");
				break;

			default:
				System.out.println("lang not found..." + language);
				break;
			}
			prop.load(ip);
		} catch (Exception e) {
			System.out.println(language + " : properties file not found");
		}
		return prop;
	}
}
