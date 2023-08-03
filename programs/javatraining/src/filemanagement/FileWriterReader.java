package filemanagement;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterReader {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("record.txt");
			writer.write("Java Full Stack Training \n");
			writer.write("1. Java \n");
			writer.write("2. Web Programming \n");
			writer.write("3. Database Programming \n");			
			writer.flush();
			writer.close();
			/**
			FileReader reader = new FileReader("record.txt");
			//System.out.println((char)reader.read());
			
			
			int k;			 
			while((k=reader.read())!=-1) {
				System.out.print((char)k);
			}
			reader.close();
			**/
			
			
			FileReader reader = new FileReader("record.txt");
			//System.out.println((char)reader.read());
			
			BufferedReader buffReader = new BufferedReader(reader);
			int k;			 
			while((k=buffReader.read())!=-1) {
				System.out.print((char)k);
			}
			buffReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
