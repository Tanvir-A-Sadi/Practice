package myCodes;

public class PrintPrintlnComments {

// Comment is a note or reference to a work that may come in handy later on for the programmer	
// This is a single line comment.
// A single line comment starts with two forward slashes (//)
// You can write only a single line of comment on a single line comment format

/*
 * This is a multi-line comment. This format starts with a forward slash and an astrick (/*) a
 * and ends with an ashtrick and a forward slash.
*/
	
//Using println prints the message on screen and moves the cursor to the next line 
//so that any subsequent print starts from the following line.
//while using print also prints the current message on screen and keeps the cursor 
//where the message ends. Any subsequent message to be printed starts from where 
//the previous message ended. 
	
	public static void main(String[] args) {
		System.out.println("This is the first output to be printed on screen!");
		System.out.print("This output is being printed by using print only!");
		System.out.print("This is the third output on screen! Notice the difference!");
	}

}
