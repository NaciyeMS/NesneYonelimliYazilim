package haftaaaaa15Exception;

import java.io.FileInputStream;
import java.io.IOException;

public class Exception6 {
//FileNotFoundException<-IOException<-Exception
	public static void main(String[] args) throws IOException {
		FileInputStream fiStream= new FileInputStream("src/main/java/haftaaaaa15Exception/file.txt");
		int k=0;
		while((k=fiStream.read())!=-1) {
			System.out.println("");
		}
	}

}
