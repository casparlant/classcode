import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in);

	/*
	  System.out.print("Enter your name: ");
	String name = sc.nextLine();
	System.out.println("Welcome, "+name);
	System.out.print("Enter a number: ");
	int i = sc.nextInt();
	System.out.println("you entered: "+i);
	*/
	/*
	String s = sc.next() ;
	System.out.println(s);
	 s = sc.next() ;
	System.out.println(s);
	s = sc.next() ;
	System.out.println(s);
	s = sc.next() ;
	System.out.println(s);
	*/
	Scanner stringscanner = new Scanner("One Two Three Four Five sox");
	while (stringscanner.hasNext() ) {
	    System.out.println(stringscanner.next());
	    // To pause use the code from here:
	    try {
		Thread.sleep(2000); // pause for that many milliseconds
	    } catch (Exception e) {
		// this should never run so you can leave it blank
	    }
	    // to here - change the parameter to Thread.sleep as needed
	}
	System.out.println("Done");
    }

}
