package br.com.ferraz.gerenciadordecursos.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		List<String> aulas = new ArrayList<>();

		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula1);
		
		aulas.forEach(aula -> System.out.println(aula));
		
		System.out.println(aulas);
		
		Collections.sort(aulas);

		System.out.println(aulas);
	}
	
}
