package br.com.alura.tdd;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Test;

public class ReajusteServiceTest {

	private static final String Desempenho = null;

	@Test
	public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar() {
		@SuppressWarnings("rawtypes")
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Carlos", LocalDate.now(), new BigDecimal("1000"));
		
		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
		
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}
}
