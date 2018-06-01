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
	
	
	/**
	 * Tests para el método selectA
	 */
	@Test
	public void selectATest1()
	{
		assertTrue(1<FermatTheorem.selectA(10) && FermatTheorem.selectA(10)<10);
	}
	
	/**
	 * Tests para el método specialCases
	 */
	@Test
	public void specialCasesTest1()
	{
		assertEquals(0, FermatTheorem.specialCases(7));
	}
	
	@Test
	public void specialCasesTest2()
	{
		assertEquals(0, FermatTheorem.specialCases(622));
	}
	
	@Test
	public void specialCasesTest3()
	{
		assertEquals(1, FermatTheorem.specialCases(-55));
	}
	
	@Test
	public void specialCasesTest4()
	{
		assertEquals(2, FermatTheorem.specialCases(0));
	}
	
	@Test
	public void specialCasesTest5()
	{
		assertEquals(0, FermatTheorem.specialCases(1));
	}
	
	
	
}
