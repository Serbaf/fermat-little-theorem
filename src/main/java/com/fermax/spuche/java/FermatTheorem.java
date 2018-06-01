package com.fermax.spuche.java;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class FermatTheorem
{

	// Comprueba si un número a es divisible por b
	public static boolean isDivisible(int a, int b)
	{
		if (a % b == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	// Comprueba si el número p es primo siguiendo el Pequeño Teorema de Fermat
	public static boolean isPrime(int a, int p)
	{
		BigInteger bigA = BigInteger.valueOf(a);

		BigInteger bigRes = bigA.modPow(BigInteger.valueOf(p - 1), BigInteger.valueOf(p));
		int res = bigRes.intValue();

		if (res == 1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static int selectA(int p)
	{
		int a;
		
		if(p<4)
		{
			do
			{
				a = ThreadLocalRandom.current().nextInt(2,20);
			}
			while(isDivisible(a,p));
		}
		else
		{
			a = ThreadLocalRandom.current().nextInt(2, p - 1);
		}
		
		return a;
	}

	public static void main(String args[])
	{
		Scanner keyb = new Scanner(System.in);
		int a, p;

		System.out.println("Escriba el numero cuya primalidad quiere comprobar:\n");
		p = keyb.nextInt();
		keyb.close();
		
		a = selectA(p);
		
		if (isPrime(a, p))
		{
			System.out.println("El numero " + p + " es primo");
		}
		else
		{
			System.out.println("Has fracasado como el perro que eres!");
		}
		
		
	}

}
