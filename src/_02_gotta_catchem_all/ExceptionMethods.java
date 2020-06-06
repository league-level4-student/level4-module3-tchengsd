package _02_gotta_catchem_all;

public class ExceptionMethods {
	double divide(double divedend, double divisor) throws IllegalArgumentException {
		if(divisor == 0) {
			throw new IllegalArgumentException();
		}
		double quotient = divedend / divisor;
		return quotient;
	}
	String reverseString(String input) throws IllegalStateException {
		char[] array = input.toCharArray();
		String output = "";
		for (int i = array.length-1; i >= 0; i--) {
			output = output + array[i];
		}
		if (input.equals("")) {
			throw new IllegalStateException();
		}
		System.out.println(output);
		return output;
	}
}
