package com.alexaitken.oc.fizbuzz;

import static com.alexaitken.oc.fizbuzz.FizzBuzzNumber.fizzBuzzNumberFor;
import static com.alexaitken.oc.fizbuzz.NumberResult.fizzBuzzResultOf;
import static com.alexaitken.oc.fizbuzz.WordResult.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class FizzBuzzTest {

	
	@Test
	public void returns_the_number_when_not_divisible_by_3_and_5() throws Exception {
		assertEquals(fizzBuzzResultOf(fizzBuzzNumberFor(1)), aFizzBuzzFor(1).translate());
		assertEquals(fizzBuzzResultOf(fizzBuzzNumberFor(4)), aFizzBuzzFor(4).translate());
		assertEquals(fizzBuzzResultOf(fizzBuzzNumberFor(11)), aFizzBuzzFor(11).translate());
		assertEquals(fizzBuzzResultOf(fizzBuzzNumberFor(22)), aFizzBuzzFor(22).translate());
	}
	
	
	@Test
	public void returns_fizz_when_divisible_by_3() throws Exception {
		assertEquals(FIZZ, aFizzBuzzFor(3).translate());
	}


	@Test
	public void returns_buzz_when_divisible_by_5() throws Exception {
		assertEquals(BUZZ, aFizzBuzzFor(10).translate());
	}

	@Test
	public void returns_fizzbuzz_when_divisible_by_3_and_5() throws Exception {
		assertEquals(FIZZBUZZ, aFizzBuzzFor(30).translate());
	}
	
	
	@Test
	public void returns_zap_when_divisible_by_7() throws Exception {
		assertEquals(ZAP, aFizzBuzzFor(14).translate());
	}

	
	@Test
	public void returns_fizzzap_when_divisible_by_3_and_7() throws Exception {
		assertEquals(WordResult.FIZZZAP, aFizzBuzzFor(21).translate());
	}

	
	@Test
	public void returns_buzzzap_when_divisible_by_5_and_7() throws Exception {
		assertEquals(BUZZZAP, aFizzBuzzFor(35).translate());
	}


	@Test
	public void returns_fizzbuzzzap_when_divisible_by_3_and_5_and_7() throws Exception {
		assertEquals(FIZZBUZZZAP, aFizzBuzzFor(105).translate());
	}
	public static FizzBuzz aFizzBuzzFor(int number) {
		return new FizzBuzz(fizzBuzzNumberFor(number));
	}
	
	
}
