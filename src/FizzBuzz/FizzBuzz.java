package FizzBuzz;

public class FizzBuzz {
	
	private static final int[] numSpe = {3,5};
	private static final String[] trad = {"fizz","buzz"};


	public String fizzbuzz(int num) {
		for (int i = 0; i < numSpe.length; i++) {
			if(num % numSpe[i] == 0) {
				return trad[i];
			}
		}
		return Integer.toString(num);
	}
}
