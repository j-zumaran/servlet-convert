package octal;

public class OctalConvertor {
	
	static String toDecimal(String octal) {
		return String.valueOf(toBaseTen(octal));
	}
	
	static String toBinary(String octal) {
		int quotient = toBaseTen(octal);
		String binary = "";
		
		while (quotient != 0) {
			int bit = quotient % 2; //bit = reminder
			quotient /= 2;
			binary = String.valueOf(bit) + binary; //inserts bit to the left
		}
		return binary;
	}
	
	private static Integer toBaseTen(String octal) {
		int decimal = 0;
		int lastIndex = octal.length() - 1;
		
		for (int i = 0; i <= lastIndex; i++) {
			String strDigit = String.valueOf(octal.charAt(lastIndex - i)); //gets first digit from the right
			int digit = Integer.parseInt(strDigit);
			decimal += digit * Math.pow(8, i);
		}
		return decimal;
	}

}
