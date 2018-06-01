package com.fermax.spuche.java;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 
 * @author serbaf
 * @version 1.0
 * 
 * Pequeño programa de consola que permite comprobar si un número es primo o no mediante la 
 * aplicación del Pequeño Teorema de Fermat.
 *
 */

public class FermatTheorem
{

	/**
	 * Devuelve un valor booleano según "a" sea o no divisible por "b"
	 * 
	 * @param a dividendo
	 * @param b divisor
	 * @return true si b es divisor de a, false en otro caso
	 */
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

	/**
	 * Aplica el Pequeño Teorema de Fermat. Si se cumple:
	 * a^(p-1)=1 (mod p)
	 * Devuelve true, en otro caso false.
	 * 
	 * @param a número obtenido al azar
	 * @param p número cuya primalidad se está comprobando
	 * @return true si p es primo, false en otro caso
	 */
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
	
	/**
	 * Se selecciona un número "a" al azar siempre que cumpla ciertas condiciones, concretamente 
	 * no ser divisible por "p" (aunque aquí no se ha implementado así exactamente)
	 * 
	 * @param p número cuya primalidad se está comprobando
	 * @return Un número "a" entero que cumpla las condiciones deseadas
	 */
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
	
	/**
	 * 
	 * @param p número cuya primalidad se quiere comprobar
	 * @return 0-sin problema, 1-p es un entero negativo, 2-p es 0, 3-p es 1
	 * 
	 */
	public static int specialCases(int p)
	{
		int flag = 0;
		if(p<0) {flag=1;}
		else if (p==0) {flag=2;}
		else if(p==1) {flag=3;}
		
		return flag;
	}

	
	/**
	 * Método main que ejecuta el cuerpo del programa:
	 * 1. Pide un número al usuario
	 * 2. Calcula su primalidad 
	 * 3. Muestra un mensaje por pantalla dando el resultado
	 * 
	 */
	public static void main(String args[])
	{
		Scanner keyb = new Scanner(System.in);
		int a = 0;
		int p = 0;
		int flag = 0;

		System.out.println("Escriba el numero cuya primalidad quiere comprobar:\n");
		p = keyb.nextInt();
		keyb.close();
		
		flag = specialCases(p);
		
		if(flag==0) {a = selectA(p);}
		
		if (flag == 1)
		{
			System.out.println("Bastardo! Metiste un numero negativo");
			System.exit(0);
		}
		else if (flag == 2)
		{
			System.out.println("Has introducido un 0, te voy a matar!");
			System.exit(0);
		}
		else if(flag == 3)
		{
			System.out.println("Jajajaja, imbecil, el 1 no es primo");
			System.exit(0);
		}
		else if (isPrime(a, p))
		{
			System.out.println("El numero " + p + " es primo");
			System.exit(0);
		}
		else
		{
			System.out.println("Ese numero no es primo. Has fracasado como el perro que eres!");
			System.exit(0);
		}
			
	}

}
