package FizzBuzz;

public class FizzBuzz {
	
	private static final int[] numSpe = {3,5};
	private static final String[] trad = {"fizz","buzz"};


	public String fizzbuzz(int num) {
		StringBuilder res = new StringBuilder();
		for (int i = 0; i < numSpe.length; i++) {
			if(num % numSpe[i] == 0) {
				res.append(trad[i]);
			}
		}
		if (res.length() == 0) return Integer.toString(num);
		
		return res.toString();
	}
}
