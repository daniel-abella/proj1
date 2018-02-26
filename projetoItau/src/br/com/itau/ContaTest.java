package br.com.itau;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContaTest {

	@Test
	void testDepositar1() throws ValorInvalidoException {

		Conta c = new Conta(1, 1, 0);
		c.depositar(100);

		Assert.assertEquals(100, c.getSaldo(), 0);
	}

	@Test
	void testDepositar2() throws ValorInvalidoException {

		Conta c = new Conta(1, 1, 100);
		c.depositar(100);

		Assert.assertEquals(200, c.getSaldo(), 0);
	}

	@Test
	void testDepositar3() throws ValorInvalidoException {

		Conta c = new Conta(1, 1, 0);

		Assertions.assertThrows(ValorInvalidoException.class, () -> {
			c.depositar(-100);
		});
	}

}
