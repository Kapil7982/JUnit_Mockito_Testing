package com.junit5.junit_mockito;

public class MathUtils {

	
	/**
	 * This method to find the question of two integer numbers.
	 * @param a numerator
	 * @param b denominator
	 * @return quotient
	 */
	public int divisionInt(int a, int b) {
		return (a/b);
	}
	
	/**
	 * This method to find the question of two double numbers.
	 * @param a numerator
	 * @param b denominator
	 * @return quotient
	 */
	public double divisionDouble (double a, double b)
	{
		return (a/b);
	}
	
	public boolean isPrime(int number)
	{
		if(number < 2)
		{
			return false;
		}
		
		if(number <= 3)
		{
			return true;
		}
		
		int count = 2;
		
		while(count < number)
		{
			if(number % count == 0)
				return false;
				count++;
			
		}
		return true;
	}
}
