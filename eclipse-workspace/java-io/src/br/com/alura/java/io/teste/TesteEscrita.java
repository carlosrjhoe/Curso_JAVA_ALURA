package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	
	public static void main(String[] args) throws IOException {
		
		//Fluxo de sa�da com Arquivo
		OutputStream fos = new FileOutputStream("lorem1.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Carlos Roberto Concei��o Junior");
		bw.newLine();
		bw.write("Mayara Ramos Cordeiro");
		bw.newLine();
		bw.write("Carlos Roberto Concei��o Neto");
		bw.newLine();
		bw.write("Luna Ramos Concei��o");
		bw.close();
	}
}
