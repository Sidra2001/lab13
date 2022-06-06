package lab13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

	 
	public class exception {

		void readFile() throws FileNotFoundException {
			
			FileInputStream f=new FileInputStream("d:/abc.txt");}
		
	}
		
	class Testthrows{
	public static void main(String[] args) throws FileNotFoundException {
		exception re=new exception();
		re.readFile();
	}
	}

	


