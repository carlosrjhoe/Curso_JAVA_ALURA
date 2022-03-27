package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	
	public static void main(String[] args) {
		
		String aula0 = "Adicionando conhecimento";
		String aula1 = "Conhecendo listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		// Percorrer uma lista
		for (String aula : aulas) {
			System.out.println(aula);
		}
		
		// Percorrer uma lista
		for(int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}
		
		// Percorrer uma lista
		aulas.forEach(aula -> {
			System.out.println("Percorrendo : " + aula);
		});
		
		// Ordenando lista
		aulas.add(aula0);
		Collections.sort(aulas);
		System.out.println(aulas);
	}
}
