package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revistando as Arrays", 20);
		Aula a2 = new Aula("Lista de objetos", 15);
		Aula a3 = new Aula("Relacionamentos de listas e objetos", 30);
		
		ArrayList<Aula> aulas = new ArrayList<>(); // Array de listas
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
	}
}
