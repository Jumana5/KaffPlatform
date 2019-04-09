package App;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;

class files {
	public static Formatter output;

	public static void openFile() {
		try {
			output = new Formatter("logsFile.txt"); // open the file
			output.format("$$  WELCOME IN KAFF PLATFORM  $$\n");
			System.out.println("file has opened");
		} catch (SecurityException securityException) {
			System.err.println("Write permission denied. Terminating.");
			output.format("SecurityExceptions happened");
		} catch (FileNotFoundException fileNotFoundException) {
			System.err.println("Error opening file. Terminating.");
			System.exit(1); // terminate the program
		}
	}

	public static void closeFile() {
		if (output != null) {
			output.format("\n$$  KAFF PLATFORM HAS CLOSED $$");
			System.out.println("file has closed");
			output.close();
		}
	}

	public static void addRecords(String logMssg) {
		try {
			// output new record to file; assumes valid input
			output.format(logMssg);
		} catch (FormatterClosedException formatterClosedException) {
			System.err.println("Error writing to file. Terminating.");
			output.format("FormatterClosedException happened");
		}

		System.out.print(">> ");
	}
}
