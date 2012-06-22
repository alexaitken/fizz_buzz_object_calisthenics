package com.alexaitken.oc.fizbuzz;

import static com.alexaitken.oc.fizbuzz.WordResult.*;


public class FizzBuzzNumber {

	private final int number;

	public FizzBuzzNumber(int number) {
		this.number = number;
	}
	

	
	
	public String say() {
		return "" + number;
	}


	public Result applyBuzz(Result result) {
		if (number % 5 == 0)
			return result.append(BUZZ);
		
		return result;
	}


	public Result applyFizz(Result result) {
		if (number % 3 == 0)
			return result.append(FIZZ);
		
		return result;
	}
	
	public Result applyZap(Result result) {
		if (number % 7 == 0)
			result = result.append(ZAP);
		
		return result;
	}
	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof FizzBuzzNumber))
			return false;
		FizzBuzzNumber other = (FizzBuzzNumber) obj;
		if (number != other.number)
			return false;
		return true;
	}

	
	

	public static FizzBuzzNumber fizzBuzzNumberFor(int number) {
		return new FizzBuzzNumber(number);
	}




	@Override
	public String toString() {
		return "FizzBuzzNumber [number=" + number + "]";
	}




	
	
	
}
