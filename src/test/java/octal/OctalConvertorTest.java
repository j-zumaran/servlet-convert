package octal;

import junit.framework.TestCase;

public class OctalConvertorTest extends TestCase{
	
	public void testOctal() {
		
		String octal1 = "10";
		
		assertEquals("8", OctalConvertor.toDecimal(octal1));
		assertEquals("1000", OctalConvertor.toBinary(octal1));
		
		String octal2 = "777";
		
		assertEquals("511", OctalConvertor.toDecimal(octal2));
		assertEquals("111111111", OctalConvertor.toBinary(octal2));
	}

}
