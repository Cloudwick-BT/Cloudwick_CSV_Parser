package libraryparser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * 
 * @author Bhavin
 * @since 15/03/2016; 10:41
 */

public class ParsingCSV {
	
	public Reader getFileReader(String fileName){
		Reader in = null;
		try{
			in = new FileReader(fileName);
		}
		catch (FileNotFoundException e) {}
		return in;
	}
	
	public String validateFormat(String fileName){
		
		String str = null;
		
		try {
			str = Files.probeContentType(Paths.get(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
		
	}
	
	

}
