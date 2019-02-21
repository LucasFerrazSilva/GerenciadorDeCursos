package br.com.ferraz.gerenciadordecursos.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.ferraz.gerenciadordecursos.model.Aula;

public class TestaListaDeAulas {

	public static void main(String[] args) {
		Aula aula1 = new Aula("Revisitando as ArrayLists", 21);
		Aula aula2 = new Aula("Listas de Objetos", 15);
		Aula aula3 = new Aula("Relacionamento de Listas e Objetos", 16);
		
		List<Aula> aulas = new ArrayList<>();

		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
//		Collections.sort(aulas, Comparator.comparing(Aula::getTitulo));
//		aulas.sort(Comparator.comparing(Aula::getTitulo));		
		
		System.out.println(aulas);
	}
	
}
