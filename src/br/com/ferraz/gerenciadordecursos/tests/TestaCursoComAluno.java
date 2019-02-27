package br.com.ferraz.gerenciadordecursos.tests;

import br.com.ferraz.gerenciadordecursos.model.Aluno;
import br.com.ferraz.gerenciadordecursos.model.Aula;
import br.com.ferraz.gerenciadordecursos.model.Curso;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		Curso curso = new Curso("Curso de Java", "Silveira");

		curso.adiciona(new Aula("Trabalhando com ArrayList2", 21));
		curso.adiciona(new Aula("Trabalhando com ArrayList", 21));

		Aluno a1 = new Aluno("Lucas", 1);
		Aluno a2 = new Aluno("Carina", 2);
		Aluno a12 = new Aluno("Lucas", 1);
		
		curso.matricula(a1);
		curso.matricula(a2);
		
		curso.getAlunos().forEach(System.out::println);

		System.out.println(curso.estaMatriculado(a1));
		System.out.println(curso.estaMatriculado(a12));
	}
	
}
