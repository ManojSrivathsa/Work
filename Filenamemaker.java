package File;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Filenamemaker {

	public String filenamelogging(String u,String p) {
		
		String filename;
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Before Formatting" + now);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm:ss");
		filename = u + "-" + p + "-" now.format(format) + ".jpg";
		
		return (filename);
		

	}

}
