import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortSentences {
    public static void main(String[] args) {
       
        // This is a String array that will contain all sentences
        String sentenceArray[] = null; 
        try {
            File file = new File("interview.txt");
            String data = null;

            Scanner myReader = new Scanner(file);
            /**
             * The while loop will return one big line
             */
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
            }
            /**
             * TODO: 
             * 1. break the text into sentences. 
             * 2. do this using the String split(regex) method. 
             * 3. split breaks up the string based on a regular expression. Go research how
             * that works. https://medium.com/factory-mind/regex-tutorial-a-simple-cheatsheet-by-examples-649dc1c3f285
             */
            sentenceArray = data.split(//TODO)

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        ArrayList<Sentence> arr = new ArrayList<Sentence>();

        /**
         * TODO: 
         * loop through the sentenceArray and add a Sentence Object (see Sentence Class)
         * to the ArrayList arr (use arr.add())
         */

        Collections.sort(arr);
        for (Sentence s : arr) {
            System.out.println(s.getLength() + "  " + s.getText());
        }
    }

}