package sn.niit.divisiblechecker;

import java.util.Scanner;

public class DivisibleChecker {

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int nombre1, nombre2;
		
		System.out.println("Entrer le premier nombre: ");
		nombre1 = scanner.nextInt();
		System.out.println("Entrer le deuxi�me nombre: ");
		nombre2 = scanner.nextInt();
		if(nombre2 == 0)
		{
			System.out.println("Le deuxi�me nombre ne doit pas �gal � z�ro ");
		}
		else
		{
			if(nombre1 % nombre2 == 0)
			{
				System.out.println(nombre1 + " est divisible par " + nombre2);
			}
			else
			{
				System.out.println(nombre1 + " n'est pas divisible par " + nombre2);
			}
		}
		
		

	}

}
