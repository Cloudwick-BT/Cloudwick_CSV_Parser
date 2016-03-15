package libraryparser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

/**
 * 
 * @author Bhavin
 * @since 15/03/2016; 10:41
 */

public class ParsingCSV {
	
	public static Reader getFileReader(String fileName){
		Reader in = null;
		try{
			in = new FileReader(fileName);
		}
		catch (FileNotFoundException e) { 			e.printStackTrace();
		e.printStackTrace();
		}
		return in;
	}
	
	public static String validateFormat(String fileName){
		
		String str = null;
		
		try {
			str = Files.probeContentType(Paths.get(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
		
	}
	
	public static Map<String, String> readData(Reader input){
		Map<String, String> dataMap = new HashMap<String, String>(); 
		try {
			Iterable<CSVRecord> records = CSVFormat.EXCEL.withHeader().parse(input);
			
			for(CSVRecord record : records){
				String name = record.get("name");
				String eMail = record.get("email");
				dataMap.put(name, eMail);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return dataMap; 
	}
	
	
	public static void main(String[] args){
		String location =  "F:\\Cloudwick\\java_Cloudwick\\CSVParser\\data.csv";
		Reader input = getFileReader(location);
		Map<String, String> dataMap ; 
		if (input == null){
			System.out.println("File not found !");
			return;
		}
		String str = validateFormat(location);

		if (!str.equals("application/vnd.ms-excel")){
			System.out.println("File is not in CSV file format");
			return;
		}
		dataMap = readData(input);

		for(String str1 : dataMap.keySet()){
			System.out.println(str1 + " : " + dataMap.get(str1));
		}

	}
	

}
