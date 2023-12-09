package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

	public static void main(String[] args) {
		
		Student s1= new Student();
		s1.setRoll(10);
		s1.setName("Harry");
		s1.setAddr("Lucknow");
		
		try {
			
			FileOutputStream fo = new FileOutputStream("abc.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
	
			oo.writeObject(s1);
				
			oo.close();
			fo.close();
				
			System.out.println("Object is converted into the bytestream...");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// Deserialization
		
		try {
			
			FileInputStream fi = new FileInputStream("abc.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
				
				Student s5 = (Student)oi.readObject();				
				oi.close();
				fi.close();
				
				System.out.println(s5);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException cl) {
			cl.printStackTrace();
		}
		
	}
	
}
