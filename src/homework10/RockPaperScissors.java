package homework10;

import java.util.*;

/*
 *RockPaperScissors.java - this program is designed to play rock paper scissors
 * with the user.
 *
 *by Cameron Pickle
 *pickle
 *December 26, 2012
 */
public class RockPaperScissors {
	public static void main (String[] args) 
	{
	  Scanner in = new Scanner (System.in);

	  //welcome to program
	  System.out.println("Welcome to Rock, Paper, Scissors!");
	  System.out.print("Please choose rock, paper, or scissors.");

	  //declare variables
	  String user_choice;
	  int user_output = 0;

	  //user input choice
	  user_choice = in.next();

	  //convert user's choice into integer
	  if (user_choice.equals("rock"))
	    {
	      user_output = 1;
	    }
	  else if (user_choice.equals("paper"))
	    {
	      user_output = 2;
	    }
	  else if (user_choice.equals("scissors"))
	    {
	      user_output = 3;
	    }
	  else
		 System.out.println("That was not a choice. Goodbye!");

	  //randomly decide my choice

	  // initialize random seed:
	  Random generator = new Random();
	  
	// randomly generate my choice
	  int my_output = generator.nextInt(3);
	  my_output++;

	  //regurgitate users choice and my choice along with winner
	  if (user_output == 1 && my_output == 1)
	    {
		  System.out.println ("Your choice was rock. \n My choice was rock. \n It's a tie!");
	    }
	  else if (user_output == 1 && my_output ==2)
	    {
		  System.out.println ("Your choice was rock. \n My choice was paper. \n I win!");
	    }
	  else if (user_output == 1 && my_output ==3)
	    {
		  System.out.println ("Your choice was rock. \n My choice was scissors. \n You win!");
	    }
	  else if (user_output == 2 && my_output ==1)
	    {
		  System.out.println ("Your choice was paper. \n My choice was rock. \n You win!");
	    }
	  else if (user_output == 2 && my_output ==2)
	    {
		  System.out.println ("Your choice was paper. \n My choice was paper. \n It's a tie!");
	    }
	  else if (user_output == 2 && my_output ==3)
	    {
		  System.out.println ("Your choice was paper. \n My choice was scissors. \n I win!");
	    }
	  else if (user_output == 3 && my_output ==1)
	    {
		  System.out.println ("Your choice was scissors. \n My choice was rock. \n I win!");
	    }
	  else if (user_output == 3 && my_output ==2)
	    {
		  System.out.println ("Your choice was scissors. \n My choice was paper. \n You win!");
	    }
	  else if (user_output == 3 && my_output ==3)
	    {
	      System.out.println ("Your choice was scissors. \n My choice was scissors. \n It's a tie!");
	    }

	}
}
