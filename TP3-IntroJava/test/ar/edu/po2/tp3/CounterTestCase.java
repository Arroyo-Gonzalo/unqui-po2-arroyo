package ar.edu.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {
	private Counter counter;
	
	@BeforeEach
	public void setUp() throws Exception {
		counter = new Counter();
		
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
		counter.addNumber(10);
		counter.addNumber(15);
		counter.addNumber(20);
	}
	
	@Test
	public void testImpares() {
		int amount = counter.cantidadDeImpares();
			
		assertEquals(amount, 10);
	}
	
	@Test
	public void testPares() {
		int amount = counter.cantidadDePares();
			
		assertEquals(amount, 3);
	}
	
	@Test
	public void testMultiplosDe() {
		int amount = counter.cantidadDeMultiplosDe(5);
			
		assertEquals(amount, 4);
	}
}
