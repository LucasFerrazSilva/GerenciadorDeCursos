package br.com.ferraz.gerenciadordecursos.tests;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		Set<String> alunos = new HashSet<String>();

		alunos.add("Lucas");
		alunos.add("Carina");
		alunos.add("Joao");
		
		System.out.println(alunos);
	}
	
}
