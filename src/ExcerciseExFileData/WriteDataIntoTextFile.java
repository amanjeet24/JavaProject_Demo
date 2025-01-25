package ExcerciseExFileData;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {


		FileWriter fw=new FileWriter("C:\\file test\\test1234.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		
		bw.write("Java Programming");
		bw.write("Welcome to Java");
		
		System.out.println("Finished..!!");
		
		bw.close();

	}

}
