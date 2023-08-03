package filemanagement;

import java.io.FileReader;

import com.opencsv.CSVReader;


public class ReadCSVDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readDataLineByLine("data.csv");
	}
	
	// Java code to illustrate reading a
	// CSV file line by line
	public static void readDataLineByLine(String file)
	{

		try {

			// Create an object of filereader
			// class with CSV file as a parameter.
			FileReader filereader = new FileReader(file);

			// create csvReader object passing
			// file reader as a parameter
			CSVReader csvReader = new CSVReader(filereader);
			String[] nextRecord;

			// we are going to read data line by line
			while ((nextRecord = csvReader.readNext()) != null) {
				for (String cell : nextRecord) {
					System.out.print(cell + "\t");
				}
				System.out.println();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}


}
