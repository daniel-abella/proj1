package br.com.itau;

public class Conta {

	private int agencia;
	private int conta;
	private double saldo;

	public Conta(int agencia, int conta, double saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
	}

	public void depositar(double montante) throws ValorInvalidoException {
		
		if(montante < 0) {
			throw new ValorInvalidoException();
		}
		
		saldo += montante;
	}
	
	public void sacar(double montante) {
		saldo -= montante;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
