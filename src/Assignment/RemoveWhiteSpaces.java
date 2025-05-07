package Assignment;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
	
		String s = "He llo\tWo\nrld \rGood\fDay";

        System.out.println("Original String:");
        System.out.println(s);

        // 1️ Remove all whitespace characters (space, tab, newline, etc.)
        String noWhitespace = s.replaceAll("\\s", "");
        System.out.println("\n1. Removed ALL whitespace (\\s):");
        System.out.println(noWhitespace);

        // 2️ Replace multiple whitespace characters with a single space
        String singleSpace = s.replaceAll("\\s+", " ");
        System.out.println("\n2. Replaced multiple whitespace with a single space (\\s+):");
        System.out.println(singleSpace);

        // 3️ Remove only SPACE characters (' '), keep tabs/newlines
        String removeSpacesOnly = s.replace(" ", "");
        System.out.println("\n3. Removed only spaces (\" \"):");
        System.out.println(removeSpacesOnly);
	}

}

/*
Escape Sequences in Java:
Escape Code	Meaning	Visual Effect
\t	Tab	Adds a horizontal tab (like pressing TAB key)
\n	New Line (Line Feed)	Moves to the next line
\r	Carriage Return	Moves cursor to the start of the line
\f	Form Feed	Old printer page break (has little effect in console)
*/