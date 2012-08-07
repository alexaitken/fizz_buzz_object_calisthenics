package com.alexaitken.oc.fizbuzz;

public class WordResult implements Result {
	
	
	public enum Word {
		FIZZ("fizz"), BUZZ("buzz"), ZAP("zap");

		private final String word;
		
		private Word(String word) {
			this.word = word;
		}
		
		public String say() {
			return word;
		}
		
	}

	
	public static final WordResult FIZZ = new WordResult(Word.FIZZ);
	public static final WordResult BUZZ = new WordResult(Word.BUZZ);
	public static final WordResult ZAP = new WordResult(Word.ZAP);
	
	
	private final String number;
	
	public WordResult(Word word) {
		this(word.say());
	}
	
	private WordResult(String number) {
		this.number = number;
	}
	
	
	@Override
	public Result append(WordResult result) {
		return new WordResult(number + result.number);
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	


	@Override
	public String toString() {
		return "WordResult [word=" + number + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof WordResult))
			return false;
		WordResult other = (WordResult) obj;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}
	
	

	
}
