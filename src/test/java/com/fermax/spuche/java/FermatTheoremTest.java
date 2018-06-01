package com.fermax.spuche.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class FermatTheoremTest
{
	/**
	 * Tests para el método isDivisible
	 */

	@Test
	public void  isDivisibleTest1()
	{
		assertTrue(FermatTheorem.isDivisible(8,4));
	}
	
	@Test
	public void  isDivisibleTest2()
	{
		assertTrue(FermatTheorem.isDivisible(-8,4));
	}
	
	@Test
	public void  isDivisibleTest3()
	{
		assertTrue(FermatTheorem.isDivisible(8,-4));
	}
	
	@Test
	public void  isDivisibleTest4()
	{
		assertTrue(FermatTheorem.isDivisible(-8,-4));
	}
	
	@Test
	public void  isDivisibleTest5()
	{
		assertFalse(FermatTheorem.isDivisible(5,3));
	}
	
	@Test
	public void  isDivisibleTest6()
	{
		assertFalse(FermatTheorem.isDivisible(5,15));
	}

	
	/**
	 * Tests para el método isPrime
	 */
	@Test
	public void isPrimeTest1()
	{
		assertTrue(FermatTheorem.isPrime(5, 7));
	}
	
	@Test
	public void isPrimeTest2()
	{
		assertTrue(FermatTheorem.isPrime(4, 7));
	}
	
	@Test
	public void isPrimeTest3()
	{
		assertFalse(FermatTheorem.isPrime(5, 10));
	}
	
	@Test
	public void isPrimeTest4()
	{
		assertFalse(FermatTheorem.isPrime(4, 10));
	}
	
	@Test
	public void selectATest1()
	{
		assertTrue(1<FermatTheorem.selectA(10) && FermatTheorem.selectA(10)<10);
	}
	
}
