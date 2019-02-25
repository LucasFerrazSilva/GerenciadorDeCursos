package br.com.ferraz.gerenciadordecursos.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.ferraz.gerenciadordecursos.model.Aula;
import br.com.ferraz.gerenciadordecursos.model.Curso;

public class TestaCurso {
	
	public static void main(String[] args) {
		Curso curso = new Curso("Dominando as coleções Java", "Paulo Silveira");
		
		System.out.println(curso.getTempoTotal());
		
		List<Aula> aulasImutaveis = curso.getAulas();
		
		System.out.println(aulasImutaveis);
		
		// aulas.add(new Aula("Trabalhando com ArrayList", 21)); java.lang.UnsupportedOperationException
		curso.adiciona(new Aula("Trabalhando com ArrayList2", 21));
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));

		aulasImutaveis.forEach(System.out::println);
		
		System.out.println(aulasImutaveis);
		System.out.println(curso.getAulas());
		
		List<Aula> aulasMutaveis = new ArrayList<Aula>(aulasImutaveis);
		
		Collections.sort(aulasMutaveis);
		
		System.out.println(aulasMutaveis);
		
		System.out.println(curso.getTempoTotal());
	}

}
