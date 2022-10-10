import java.util.Scanner;

public class convert {
	public static void main( String[] args ) {
		String filename;
		Scanner userInput = new Scanner( System.in );
		htmlTranslator translate = new htmlTranslator();

		// Get the filename from the user

		System.out.println( "filename? " );
		filename = userInput.next();
		userInput.close();

		// Ensure that the user provided some input.  Using a scanner,
		// the system should keep asking for input until it gets 
		// something.

		if (filename.length() > 0) {
			translate.translateFile( filename );
		} else {
			System.out.println( "No filename provided." );
		}
	}
}

