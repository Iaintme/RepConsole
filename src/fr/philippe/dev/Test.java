package fr.philippe.dev;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		Properties properties = new Properties();
		InputStream in = null;
		
		try
		{
			in = new FileInputStream("ressources/config.properties");
			
			properties.load(in);
			
			System.out.print(properties.getProperty("contact.nom"));
			System.out.printf(" %s", properties.getProperty("contact.prenom"));
		}
		catch (Exception e)
		{
			e.printStackTrace();
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
