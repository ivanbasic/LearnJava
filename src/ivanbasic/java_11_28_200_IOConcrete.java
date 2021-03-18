package ivanbasic;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
 
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class java_11_28_200_IOConcrete implements Lesson {

	public void main() {
		String ff = "nofile.not";
		try {

			FileInputStream      f1 = new FileInputStream(ff);
			FileOutputStream     f2 = new FileOutputStream(ff);
			FileReader           f3 = new FileReader(ff);
			FileWriter           f4 = new FileWriter(ff);

			BufferedInputStream  b1 = new BufferedInputStream(f1);
			BufferedOutputStream b2 = new BufferedOutputStream(f2);
			BufferedReader       b3 = new BufferedReader(f3); b3.close();
			BufferedWriter       b4 = new BufferedWriter(f4);

			ObjectInputStream    o1 = new ObjectInputStream(b1); o1.close();
			ObjectOutputStream   o2 = new ObjectOutputStream(b2); o2.close();
			PrintStream          o3 = new PrintStream(f2);  o3.close();
			PrintWriter          o4 = new PrintWriter(b4);  o4.close();

		} catch (Exception ee) {
			//ee.printStackTrace();
		}


		try (var br = new BufferedReader(new FileReader(ff))) {
			   System.out.println(br.readLine());
		} 
		catch (Exception ee) {}

		
		
	}

}
