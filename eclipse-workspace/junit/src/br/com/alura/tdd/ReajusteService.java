package br.com.alura.tdd;

import java.math.BigDecimal;

public class ReajusteService<Desempenho> {

	private static final Desempenho Desempenho = null;

	public void concederReajuste(Funcionario funcionario, Desempenho aDesejar) {
		
		if(Desempenho == Desempenho.A_DESEJAR) {
			BigDecimal reajuste = funcionario.getSalario().multiply(new BigDecimal("0.03));"
					+ funcionario.reajusteSalario(reajuste);
		}
		
	}

}
