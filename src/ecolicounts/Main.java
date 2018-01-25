package ecolicounts;

import static java.lang.System.*;
import static org.apache.commons.io.FileUtils.*;
import static org.apache.commons.lang3.StringUtils.*;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {

		try {
			@SuppressWarnings("resource")
			String counts = readFileToString((new File((new Scanner(in)).nextLine())));
			out.print("#A = " + countMatches(counts, 'A') + lineSeparator() + "#C = " + countMatches(counts, 'C')
					+ lineSeparator() + "#G = " + countMatches(counts, 'G') + lineSeparator()
					+ "#T = " + countMatches(counts, 'T') + lineSeparator());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
