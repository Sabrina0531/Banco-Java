package br.com.fiap.banco;

public class App {

	public static void main(String[] args) {
		Conta contaUser1 = new Conta("1211");
		contaUser1.toString();
		
		Conta contaUser2 = new Conta("00588")
;		contaUser2.toString();
		
		ContaPoupanca poupanca = new ContaPoupanca("5652");
		poupanca.sacar(10);
		
		
		try {
			contaUser1.depositar(-2);
		} catch (DepositoNegativoException e) {
			System.err.println("Um erro aconteceu: " + e.getMessage());
		}
		
		
		
		
		
		
		
		
	}

}