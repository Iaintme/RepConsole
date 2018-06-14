package fr.philippe.dev;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public class Test {

	
	
	public static void main(String[] args) {
		Properties properties = new Properties();
		InputStream in = null;
		
		final Logger logger = Logger.getLogger(Test.class);
		
		logger.info("test info ;)");
		
		try
		{
			in = new FileInputStream("ressources/config.properties");
			
			properties.load(in);
			
			System.out.print(properties.getProperty("contact.nom"));
			System.out.printf(" %s", properties.getProperty("contact.prenom"));
		}
		catch (Exception e)
		{
			logger.debug(e.getMessage());
		}
		finally
		{
			if (in != null)
			{
				try 
				{
					in.close();
					in = null;
				}
				catch (IOException io)
				{
					io.printStackTrace();
				}
			}
		}
		
		
	}
}
