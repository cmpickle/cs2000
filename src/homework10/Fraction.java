package homework10;

public class Fraction {
	private long numerator;
	private long denominator;
	/* Fraction constructor:
	 *
	 * This default constructor creates the fraction
	 * representing the number 0.
	 *
	 * (Notice that no return type is specified.  The
	 * function name is the class name for a constructor.)
	 */
	public Fraction ()
	{
	  // Set this object's variables to represent 0.
	  
	  numerator = 0;
	  denominator = 1;
	}

	/* Fraction constructor:
	 *
	 * This constructor creates the fraction
	 * representing the number specified by the numerator
	 * and denominator parameters, i.e. numerator/denominator.
	 *
	 * The denominator is not allowed to be 0.  (No error
	 * checking is done -- you haven't learned exceptions yet.)
	 *
	 * (Notice that no return type is specified.  The
	 * function name is the class name for a constructor.)
	 *
	 * Parameters:
	 *   int _numerator -- some numerator
	 *   int _denominator -- some denominator
	 */
	public Fraction (long _numerator, long _denominator)
	{
	  // Copy the parameter values into this object's variables.
	  
	  numerator = _numerator;
	  denominator = _denominator;

	  // (Students will add statements here for the assignment)
	  if (denominator == 0);
	  else

	  // Reduce the fraction (as required by the class contract).
	  //   We'll just use our private function to help us.
	  
	  reduce();

	  // Ensure the denominator is not negative.

	  if(denominator < 0)
	    {
	      numerator *= -1;
	      denominator *= -1;
	    }
	}

	/* This function reduces this fraction object.  It first
	 * computes the greatest common divisor of the numerator
	 * and denominator.  Then, it divides both the numerator
	 * and denominator by that greatest common divisor.
	 */
	private void reduce ()
	{
	  // Compute the greatest common divisor using a
	  //  well-known algorithm.

	  long gcd = numerator;
	  long remainder = denominator;

	  while (remainder != 0)
	  {
	    long temp = remainder;
	    remainder = gcd % remainder;
	    gcd = temp;
	  }

	  // Divide both the numerator and denominator by the
	  //   greatest common divisor

	  numerator /= gcd;
	  denominator /= gcd;
	}

	/* Returns a string that contains text representing
	 * this fraction in the form "numerator/denominator".
	 *
	 * Returns:
	 *   a string -- the fraction converted to a string
	 */
	public String toString ()
	{
		String buffer;

	  if(denominator == 1)
	    buffer = "" + numerator;
	  else if (denominator == 0)
	    buffer = "This fraction is undefined";
	  else
	    buffer = "" + numerator + "/" + denominator;

	  return buffer;
	}

	/* Returns a double value that is the approximation
	 * of this fraction object.
	 *
	 * Returns:
	 *   a double -- a floating point approximation of
	 *               the number represented by this Fraction
	 */
	public double toDouble ()
	{
	  return numerator/(double)denominator;
	}

	/* Adds this fraction object to the provided fraction
	 * object (without changing this object).  The sum
	 * is returned in a separate fraction object.
	 *
	 * Parameters:
	 *   Fraction right -- some other fraction object
	 *
	 * Returns:
	 *   A Fraction object -- represents the value equal to
	 *                        this object + right object.
	 */
	public Fraction add (Fraction right)
	{
	  // Compute the sum
	  
	  long sum_numerator, sum_denominator;
	  
	  sum_numerator = numerator         * right.denominator +
	                  denominator * right.numerator;
	  
	  sum_denominator = denominator * right.denominator;

	  // Create the resulting fraction.
	  
	  Fraction result = new Fraction(sum_numerator, sum_denominator);

	  // Return it.
	  
	  return result;
	}

	/* Multiplies this fraction object with the provided fraction
	 * object (without changing this object).  The product
	 * is returned in a separate fraction object.
	 *
	 * Parameters:
	 *   Fraction right -- some other fraction object
	 *
	 * Returns:
	 *   A Fraction object -- represents the value equal to
	 *                        this object * right object.
	 */
	public Fraction multiply (Fraction right)
	{
	  // Compute the product
	  
	  long product_numerator, product_denominator;
	  
	  product_numerator   = numerator   * right.numerator;
	  product_denominator = denominator * right.denominator;

	  // Create the resulting fraction.
	  
	  Fraction result = new Fraction(product_numerator, product_denominator);

	  // Return it.
	  
	  return result;
	}

	/* Subtract this fraction object to the provided fraction
	 * object (without changing this object).  The difference
	 * is returned in a separate fraction object.
	 *
	 * Parameters:
	 *   Fraction right -- some other fraction object
	 *
	 * Returns:
	 *   A Fraction object -- represents the value equal to
	 *                        this object + right object.
	 */
	public Fraction subtract (Fraction right)
	{
	  // Compute the difference
	  
	  long sum_numerator, sum_denominator;
	  
	  sum_numerator = numerator   * right.denominator -
	                  denominator * right.numerator;
	  
	  sum_denominator = denominator * right.denominator;

	  // Create the resulting fraction.
	  
	  Fraction result = new Fraction(sum_numerator, sum_denominator);

	  // Return it.
	  
	  return result;
	}

	/* Divides this fraction object with the provided fraction
	 * object (without changing this object).  The product
	 * is returned in a separate fraction object.
	 *
	 * Parameters:
	 *   Fraction right -- some other fraction object
	 *
	 * Returns:
	 *   A Fraction object -- represents the value equal to
	 *                        this object * right object.
	 */
	public Fraction divide (Fraction right)
	{
		Fraction two = new Fraction();
		
		two = right;
	  // Compute the product
	  
	  long product_numerator, product_denominator;
	  
	  product_numerator   = numerator   * two.denominator;
	  product_denominator = denominator * right.numerator;

	  // Create the resulting fraction.
	  
	  Fraction result = new Fraction(product_numerator, product_denominator);

	  // Return it.
	  
	  return result;
	}

}
