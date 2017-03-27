package homework08;

import java.util.Scanner;


public class StringDemo 
{
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        // Prepare to get input by creating a Scanner that can scan keyboard input

        Scanner in = new Scanner (System.in);

        // Prompt the user to input a word.

        System.out.print ("Enter a word: ");

        // Read one 'word' from the keyboard.

        String firstWord;
        firstWord = in.next();

        // Prompt the user to reenter the word.

        System.out.print ("Enter it again to make sure: ");

        // Read the second word from the keyboard.

        String secondWord = in.next();

        // Compare the words.

        System.out.print ("Comparison #1 results: ");

        if (firstWord == secondWord)
            System.out.println ("The words appear to be equal.");
        else
            System.out.println ("The words appear to be different.");

        System.out.print ("Comparison #2 results: ");

        if (firstWord.equals(secondWord))
            System.out.println ("The words appear to be equal.");
        else
            System.out.println ("The words appear to be different.");
    }
}