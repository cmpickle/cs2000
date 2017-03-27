package homework10;


public class Pi 
{

	/** Pi - this is a tester designed to calculate an approximation
	 * of pi using the Fraction class.
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int k=0;
		  Fraction z = new Fraction(1, 1);
		  Fraction pi = new Fraction(0, 1);

		  //Couldn't go to 4th, 5th, or 6th summation, overflow occurs causing errors
		  for (int i = 0; i<=3; i++)
		    {
		      Fraction a = new Fraction(1, 8*i+6);
		      Fraction b = new Fraction(1, 8*i+5);
		      Fraction c = new Fraction(2, 8*i+4);
		      Fraction d = new Fraction(4, 8*i+1);
		      Fraction e = new Fraction(1, pwr(16,i));
		      z=d.subtract(c);
		      z=z.subtract(b);
		      z=z.subtract(a);
		      z=z.multiply(e);
		      pi=pi.add(z);
		      if(i==3)
		      {
		    	  k = i;
		    	  break;
		      }
		    }

		  System.out.println("Pi has been approximated to be " + pi.toString()
		      + " as a fraction and " + pi.toDouble() + " as a real number"
		      + " by taking it to the " + k + "rd summation.");
	}

	/*pwr - takes a number and power and gives back the number to the power in
	 * the form of an int. Doesn't support negative powers.
	 *
	 *Parameters 
	 *int num - number to find a power for
	 *int power - the power the number will be taken to
	 *
	 *Returns
	 *int result - the result of the power operation
	 */
	private static int pwr (int num, int power)
	{
	  int result = 1;
	  for (int i = 0; i < power; i++)
	    result *= num;
	  return result;
	}

}
