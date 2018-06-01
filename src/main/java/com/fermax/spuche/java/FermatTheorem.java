package com.fermax.spuche.java;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class FermatTheorem
{
	
	//Comprueba si un n�mero a es divisible por b
	public static boolean isDivisible(int a, int b)
	{
		if(a%b == 0) {return true;}
		else {return false;}
	}
	
	//Comprueba si el n�mero p es primo siguiendo el Peque�o Teorema de Fermat
	public static boolean isPrime(int a, int p)
	{
		BigInteger bigA = BigInteger.valueOf(a);
		
		BigInteger bigRes = bigA.modPow(BigInteger.valueOf(p-1), BigInteger.valueOf(p));
		int res = bigRes.intValue();
		
		if(res==1) {return true;}
		else {return false;}
	}
	


	public static void main(String args[])
	{
		Scanner keyb = new Scanner(System.in);
		int a, p;
		
		System.out.println("Escriba el n�mero cuya primalidad quiere comprobar:\n");
		p = keyb.nextInt();
		
		a = ThreadLocalRandom.current().nextInt(2, p-1);
		
		
		
		
	}

}
