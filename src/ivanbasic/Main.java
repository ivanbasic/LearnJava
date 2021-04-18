/*
  	ivan basic, 25.04.2020
  	
	learning java from different books
  	from 2008 until 2020,
  	from java 06 until 14
	
	about lesson's
	java_XX_YY_ZZZ_Name :a class name for every lesson, where..
	java: beloved java
	XX  : the book which I used or just the version of java or 00. see below about the books.
	YY  : a chapter in the book or just an ordinal number
	ZZZ : a part of the chapter, just an ordinal number
	Name: a name, a description of the lesson
	
	about naming:
	Of course, I am familiar with java naming conventions, CamelCase. 
	java_XX_YY_ZZZ_ isn't really a part of lesson's (class's) name.
    Or, I mixed my_beloved_snake_case with CamelCase 

	
	References:
	-book 07:
	 OCA Java SE 7 Programmer I Study Guide (Exam IZO-803)
	 by Edward Finegan, Robert Liguori
	
	-book 08:
	 SE 8 Programmer I Study Guide Exam 1Z0-808
	 by Jeanne Boyarsky, Scott Selikoff
	 
	-book 11 (part 1 and 2):
	 Oracle Certified Professional, Java SE 11 Programmer I, Study Guide, Exam 1Z0-815
	 by Jeanne Boyarsky,  Scott Selikoff
	 Chapters 01-11   
	 
	 OCP Oracle® Certified Professional Java® SE 11 Programmer II Study Guide Exam 1Z0-816 and Exam 1Z0-817
 	 by Jeanne Boyarsky,  Scott Selikoff
	 Chapters 01-11 are renamed as 21-31
	 
	-book 12:
	 Sams Teach Yourself Java in 21 Days (Covers Java 11/12) 
	 by Rogers Cadenhead
 */


package ivanbasic;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(final String[] args) {
		System.out.println("LEARNING JAVA 07-14");		
		
		//callAllStatic();
		callAllDynamic(0);		
		

	}
	
	
	// static call's
	// staticki tj normalan nacin da se pozovu vezbe. Imenovanjem.	
	public static void callAllStatic() {
		new java_11_00_001_HelloWorld().main();
		new java_11_00_002_Version().main();		
	
		new java_11_05_041_ArraysRowsAndCols().main();
		
		// etc...
	}
	
	
	// Calling all dynamically
	// dinamicki poziv svih primera
	public static void callAllDynamic(final int ordinalNumberOfDemo) {
		System.out.println("dynamic call's");
		System.out.println("");
		
		// list of the classes in this package
		// lista svih klasa u ovom projektu
		final List<Class<?>> classes = ClassFinder.find("ivanbasic");
		
		// loop. all classes
		// petlja po svim klasama. trazim klase u kojima je pocetak primera.
		int ii = 1; // counting the lesson's
		for (final Class cl : classes) {
			final String className = cl.getName();
			
			// I need all classes witch name starts width ivanbasic.java_
			if (className.startsWith("ivanbasic.java_") && 
				!className.contains("$")  ) {
				
				// make an instance and call
				// kreiraj i pozovi svaki primer
				try {
					
					Lesson lsn = null;
					Object obj;
					
					// make...
					// kreiraj objekt, kastuj
					obj = Class.forName(className).getConstructor().newInstance();
					lsn = (Lesson) obj;
					
					// calling...
					// poziv primera
					if (ordinalNumberOfDemo == 0 || ordinalNumberOfDemo == ii) {
						// header
						// zaglavlje
						System.out.println("");
						System.out.println("===============================================================");
						System.out.println("Lesson #" + ii + " " + className);
						System.out.println("===============================================================");
						
						//lesson
						lsn.main();
					}
					ii++;
					
				} catch (final Exception e) {
					// not what I'm looking for.
					// nesto drugo je upalo
					
					 e.printStackTrace();
					
				}
				
			} // if
			
		} // for
		
	} // callAllDynamic
	
} // class Main
	
	
//all lessons implement this interface.
//sve vezbe imlementiraju ovaj interface
interface Lesson {
	public void main();
}



//Thank you, sp00m. I found some very complicated solution with 100 and more
//classes.
//This one is nice.

//How to get all classes names in a package? [duplicate]
//Pianist on an AZERTY keyboard
//https:stackoverflow.com/questions/15519626/how-to-get-all-classes-names-in-a-package
//https://stackoverflow.com/users/1225328/sp00m
class ClassFinder {
	
	private static final char PKG_SEPARATOR = '.';
	
	private static final char DIR_SEPARATOR = '/';
	
	private static final String CLASS_FILE_SUFFIX = ".class";
	
	private static final String BAD_PACKAGE_ERROR = "Unable to get resources from path '%s'. Are you sure the package '%s' exists?";
	
	public static List<Class<?>> find(final String scannedPackage) {
		
		final String scannedPath = scannedPackage.replace(PKG_SEPARATOR, DIR_SEPARATOR);
		final URL scannedUrl = Thread.currentThread().getContextClassLoader().getResource(scannedPath);
		
		if (scannedUrl == null) {
			throw new IllegalArgumentException(String.format(BAD_PACKAGE_ERROR, scannedPath, scannedPackage));
		}
		final File scannedDir = new File(scannedUrl.getFile());
		final List<Class<?>> classes = new ArrayList<Class<?>>();
		for (final File file : scannedDir.listFiles()) {
			classes.addAll(find(file, scannedPackage));
		}
		return classes;
	}
	
	private static List<Class<?>> find(final File file, final String scannedPackage) {
		final List<Class<?>> classes = new ArrayList<Class<?>>();
		final String resource = scannedPackage + PKG_SEPARATOR + file.getName();
		
		if (file.isDirectory()) {
			for (final File child : file.listFiles()) {
				classes.addAll(find(child, resource));
			}
		} else if (resource.endsWith(CLASS_FILE_SUFFIX)) {
			final int endIndex = resource.length() - CLASS_FILE_SUFFIX.length();
			final String className = resource.substring(0, endIndex);
			try {
				classes.add(Class.forName(className));
			} catch (final ClassNotFoundException ignore) {
			}
		}
		return classes;
	}
	
}
