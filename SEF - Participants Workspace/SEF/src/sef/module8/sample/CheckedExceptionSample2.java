package sef.module8.sample;
// Needs to be completed
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionSample2 {

	public static void main(String arg[]) throws FileNotFoundException {
		
		String fileName = "SomeFileThatDoesNotExist.txt";
		

		FileReader reader ;

			reader = new FileReader(fileName);

	}
}
