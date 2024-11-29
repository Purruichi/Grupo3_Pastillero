package Common.Properties;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class properties extends Properties{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static properties prop;
	private static final String PATH = "properties.xml";
	
	
	private properties() {
		try {
			this.loadFromXML(getClass().getClassLoader().getResourceAsStream(PATH));
		} catch (InvalidPropertiesFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
	}
	
	public static properties getInstance() {
		if (prop == null) {
			prop = new properties();
		}
		return prop;
		
	}
	
}