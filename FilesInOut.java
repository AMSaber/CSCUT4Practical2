import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FilesInOut {

    public static void main(String[] args) throws FileNotFoundException {
        // Replace this with statements to set the file name (input) and file name (output).
        // Initially it will be easier to hardcode suitable file names.

        // Set up a new Scanner to read the input file.
        // Processing line by line would be sensible here.
        // Initially, echo the text to System.out to check you are reading correctly.
        // Then add code to modify the text to the output format.

        // Set up a new PrintWriter to write the output file.
        // Add suitable code into the above processing (because you need to do this line by line also.
        // That is, read a line, write a line, loop.

        // Finally, add code to read the filenames as arguments from the command line.

        String inputFile = "";
        String output = "";
        String outputFile ="";
        if (args.length == 2){
            inputFile = args[0];
            outputFile = args[1];
        }
        else if (args.length == 3){
            if(args[0])
        }
        File input1 = new File("input.txt");
        File input2 = new File("inputm.txt");
        Scanner in1 = new Scanner(input1);
        Scanner in2 = new Scanner(input2);
        
        PrintWriter out = new PrintWriter("output.txt");
        
        
        System.out.println("You need to add your own code to do anything");

    } // main

} // FilesInOut
