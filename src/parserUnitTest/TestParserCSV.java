package parserUnitTest;

import java.io.Reader;
import libraryparser.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * @author Bhavin
 * @since 15/03/2016; 11:00
 */

public class TestParserCSV {
	
	@Test
	public void testInput(){
		ParsingCSV parser = new ParsingCSV();
		String fileName = "F:\\Cloudwick\\java_Cloudwick\\CSVParser\\data.csv";
		Reader test = parser.getFileReader(fileName);
		assertNotNull(test);
	}

}
