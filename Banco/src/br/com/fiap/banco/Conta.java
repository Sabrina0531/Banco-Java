package br.com.fiap.banco;

public class Conta {
	
	private String numero;
	private double saldo = 1000;
	
	public Conta (String numero) {
		this.numero = numero;
	}
	
	public void depositar(double valor) throws DepositoNegativoException {
		if (valor < 0) {
			throw new DepositoNegativoException("Não é possível fazer o depósito! Valor negativo!");
		}
		saldo+=valor;
	}
	
	public void sacar (double valor) throws ValorInsuficienteException{
		if (valor > saldo) {
			throw new ValorInsuficienteException("Não é possível fazer o saque! Saldo insuficiente");
		}
		saldo-=valor;
	}
	
	public void transferir(double valor) throws ValorInsuficienteException{
		if (valor > saldo) {
			throw new ValorInsuficienteException("Não é possível fazer a transferência! Saldo insuficiente");
		}else if (valor < 0) {
			throw new ValorInsuficienteException("Não é possível fazer a transferência! Valor negativo");
		}
		saldo-=valor;
	}
	
	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}	
	
}