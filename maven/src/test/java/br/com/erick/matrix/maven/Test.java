package br.com.erick.matrix.maven;

import junit.framework.TestCase;

public class Test extends TestCase{
	
	@org.junit.Test
	public void testShouldReturnInitialValue() {
		Matrix matriz = new Matrix(5,5);
		double number = matriz.getElement(2,2);
		assertEquals(number,0.0,0.1);
		
	}
}
