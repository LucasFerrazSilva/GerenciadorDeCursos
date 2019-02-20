package br.com.ferraz.gerenciadordecursos.model;

public class Aula implements Comparable<Aula> {

	private String titulo;
	private int tempo;
	
	
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}


	@Override
	public String toString() {
		return "Aula [titulo=" + titulo + ", tempo=" + tempo + "]";
	}


	@Override
	public int compareTo(Aula obj) {
		return this.getTitulo().compareTo(obj.getTitulo());
	}
	
}
