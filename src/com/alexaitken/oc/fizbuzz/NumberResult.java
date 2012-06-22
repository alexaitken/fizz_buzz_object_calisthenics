package com.alexaitken.oc.fizbuzz;

public class NumberResult implements Result {

	private final FizzBuzzNumber number;

	public NumberResult(FizzBuzzNumber number) {
		this.number = number;
		
	}

	@Override
	public Result append(WordResult result) {
		return result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof NumberResult))
			return false;
		NumberResult other = (NumberResult) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "NumberResult [number=" + number + "]";
	}

	public static Result fizzBuzzResultOf(FizzBuzzNumber fizzBuzzNumber) {
		return new NumberResult(fizzBuzzNumber);
	}
	
	
	
	
	

}
