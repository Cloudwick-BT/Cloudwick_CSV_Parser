package libraryparser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

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

}
