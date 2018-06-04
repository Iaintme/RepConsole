package fr.philippe.dev;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		Properties properties = new Properties();
		OutputStream out = null;
		
		try {
			out = new FileOutputStream("config.properties");

			properties.setProperty("driver", "mysql");
			properties.setProperty("database", "localhost");
			properties.setProperty("port", "3306");
			properties.setProperty("user", "root");
			properties.setProperty("password", "12345");
		
			properties.store(out, null);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if (out != null)
			{
				try {
					out.close();
					out = null;
				}
				catch (IOException i) {
					i.printStackTrace();
				}
			}
		}
	}
}
