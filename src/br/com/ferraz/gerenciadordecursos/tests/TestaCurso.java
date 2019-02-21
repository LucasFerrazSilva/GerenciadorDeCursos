package br.com.ferraz.gerenciadordecursos.tests;

import java.util.List;

import br.com.ferraz.gerenciadordecursos.model.Aula;
import br.com.ferraz.gerenciadordecursos.model.Curso;

public class TestaCurso {
	
	public static void main(String[] args) {
		Curso curso = new Curso("Dominando as coleções Java", "Paulo Silveira");
		
		List<Aula> aulas = curso.getAulas();
		
		System.out.println(aulas);
		
		// aulas.add(new Aula("Trabalhando com ArrayList", 21)); java.lang.UnsupportedOperationException
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));

		System.out.println(aulas);
		System.out.println(curso.getAulas());
	}

}
