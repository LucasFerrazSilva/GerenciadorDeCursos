package br.com.ferraz.gerenciadordecursos.tests;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		Collection<Integer> numeros = new ArrayList<Integer>();
		int n = 100000;
		
		long inicio = System.currentTimeMillis();
		
		for(int i = 1; i <= n; i++)
			numeros.add(i);
		
		System.out.println("Tempo para inser��o na lista: " + (System.currentTimeMillis() - inicio));
		
		for(Integer numero: numeros)
			numeros.contains(numero);

		System.out.println("Tempo para verifica��o na lista: " + (System.currentTimeMillis() - inicio));
		
		numeros = new HashSet<Integer>();
		
		inicio = System.currentTimeMillis();
		
		for(int i = 1; i <= n; i++)
			numeros.add(i);
		
		System.out.println("Tempo para inser��o no set: " + (System.currentTimeMillis() - inicio));
		
		for(Integer numero: numeros)
			numeros.contains(numero);

		System.out.println("Tempo para verifica��o no set: " + (System.currentTimeMillis() - inicio));
		
	}
	
}
