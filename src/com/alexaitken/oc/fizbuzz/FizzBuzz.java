package com.alexaitken.oc.fizbuzz;



public class FizzBuzz {

	private final FizzBuzzNumber number;

	
	public FizzBuzz(FizzBuzzNumber number) {
		this.number = number;
	}
	
	
	public Result translate() {
		Result result = new NumberResult(number);
		
		result = number.applyFizz(result);
		result = number.applyBuzz(result);
		result = number.applyZap(result);
		
		return result;
	}

}
