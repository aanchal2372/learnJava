package Unit_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class P15_FileHandling {
	public static void main(String[] args) throws IOException {
		//@SuppressWarnings("unused")
		abc1 obj=new abc1();
//		obj.takeInputFromAFileNotFromConsole();
//    	obj.saveOutputIntoAFile1();
    	obj.saveLogOfProgram();
		
	}
}

class abc1{
	static int a=10;
	void takeInputFromAFileNotFromConsole() throws IOException {
		String path="C:\\Users\\Aanchal Tiwari\\git\\learnJava\\javaInDepth\\src\\Unit_03\\input.txt";
		File file=new File(path);
		
		BufferedReader br=new BufferedReader(new FileReader(file));        //bufferreader = read file data and filereader = take permission such read,write and execute and give that data to bufferreader.
//		String st;                     //we can't make object of bufferreader.
//		while((st=br.readLine()) != null){                               //read the first line of a string.
//			System.out.println(st);
//		}
		//readLine-> returns till the new line character is found.
		
//		int c;
//		while((c=br.read())!=-1) {
//			System.out.println((char)c);        *In java read() read the string in ASCII value because it will read the string by 2-2 bytes.
//		} 
//		if(br.readLine()==null) {
//			System.out.println("Yes");
//		}
		
		//List that holds string of a file
		List<String> listOfStrings=new ArrayList<String>();
		
		//read entire line as a string
		String line=br.readLine();
		
		while(line!=null) {
			listOfStrings.add(line);
			line=br.readLine();
		}
		
		for(String str : listOfStrings) {
			System.out.println(str);
		}
		System.out.println("\n");
		br.close();
	}

	void saveOutputIntoAFile1() throws IOException {

		FileWriter myObj = null;

		try {
			myObj = new FileWriter("output.txt",true);      //by default->false , true->for append
		} catch (IOException e) {                             
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BufferedWriter f_writer = new BufferedWriter(myObj);

		String text = "Hey this would store in Output file";

		f_writer.write(text);
		f_writer.close();

	}
	
        void saveLogOfProgram() throws IOException {
		
		a++;
		
		//Find current time and Date
		LocalTime ltime = java.time.LocalTime.now();
		LocalDate ldate = java.time.LocalDate.now();
		
		FileWriter myObj = null;

		try {
			myObj = new FileWriter("C:\\Users\\Aanchal Tiwari\\git\\learnJava\\javaInDepth\\src\\Unit_03\\log.txt",true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BufferedWriter f_writer = new BufferedWriter(myObj);

		String text = "The Program executed at: " + ltime.toString() + " " + ldate.toString() + "\n";

		try {
			f_writer.write("Value of a: " + a + ", ");
			f_writer.write(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		f_writer.close();
	}

}