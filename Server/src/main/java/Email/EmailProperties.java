/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Email;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

/**
 *
 * @author purru
 */
public class EmailProperties extends Properties {
    
    private static final long serialVersionUID = 1L;
    private static EmailProperties prop;
    private static final String PATH = "EmailProperties.xml";
    
    private EmailProperties() {
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
        }
    }
    
    public static EmailProperties getInstance() {
        if (prop == null) {
            prop = new EmailProperties();
            prop.getProperty("mail.smtp.auth");
            prop.getProperty("mail.smtp.starttls.enable");
            prop.getProperty("mail.smtp.host");
            prop.getProperty("mail.smtp.port");
        }
        System.out.println(prop);
        return prop;
    }
    
}
