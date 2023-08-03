package filemanagement;

import java.io.File;
import java.io.IOException;
public class CreateFile {
	public static void main(String[] args) {
		//File file1 = new File("test.txt");
		//D:\kaushalya\consultancy\mahendraenggcollege\
		File file1 = new File("D:\\kaushalya\\consultancy\\mahendraenggcollege\\dummy\\test.txt");
		boolean isFileCreated=false;
		try {
			isFileCreated= file1.createNewFile();
			
			if(isFileCreated) {
				System.out.println("File is Created");
			}else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
