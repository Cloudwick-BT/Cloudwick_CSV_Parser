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
	
	@Test
	public void testFormat(){
		String fileName = "F:\\Cloudwick\\java_Cloudwick\\CSVParser\\data.csv";
		ParsingCSV parser = new ParsingCSV();
        String str = parser.validateFormat(fileName);
        assertEquals("application/vnd.ms-excel", str);

	}
	
	

}
