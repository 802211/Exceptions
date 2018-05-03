package _02_gotta_catchem_all;

public class ExceptionMethods extends Exception {

	public double divide(double d1, double d2) throws IllegalArgumentException {
		if (d2 == 0) {
			throw new IllegalArgumentException();
		}
		double d1and2 = d1 / d2;
		return d1and2;
	}

	public String reverseString(String s) throws IllegalStateException {
		String revS = "";
		if (s.length() == 0) {
			throw new IllegalStateException("werty");
		}
		for (int i = s.length() - 1; i >= 0; i--) {
			revS = revS + s.charAt(i);
		}

		return revS;
	}

}
