package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Curso {
	private String nome;
	private int alunos;
	
	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}
	
		
}

public class Streams {

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
//Usando o metodo lambda
		cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		
//Usando o methodo reference
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));		
		cursos.forEach(c -> System.out.println(c.getNome()));
		
//Utilizando a API stream para não precisar fazer if
			
		cursos.stream()
		.filter(c -> c.getAlunos() > 50)
		.forEach(c -> System.out.println(c.getNome()));
		
//Utilizando o mthodo map
		Stream<String> nomes = cursos.stream().map(Curso::getNome);
		System.out.println(nomes);
		
		
//Outro exemplo de otimização de codigo
//		cursos.stream()
//		   .filter(c -> c.getAlunos() > 50)
//		   .map(c -> c.getAlunos())
//		   .forEach(x -> System.out.println(x));
//
//		cursos.stream()
//		   .filter(c -> c.getAlunos() > 50)
//		   .map(Curso::getAlunos)
//		   .forEach(System.out::println);
//		
		
	}

}
