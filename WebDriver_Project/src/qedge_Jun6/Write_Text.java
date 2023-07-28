package qedge_Jun6;
import java.io.*;
public class Write_Text {

	public static void main(String[] args) throws Throwable {
		// create new file
		File f = new File("D://Selenium.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("I want job in top MNC");
		bw.newLine();
		bw.write("with 16l pkg");
		bw.newLine();
		bw.write("I am Practiseing daily");
		bw.flush();
		bw.close();
		
		
		

	}

}
