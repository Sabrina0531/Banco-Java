package br.com.fiap.banco;

public class App {

	public static void main(String[] args) {
		Conta contaUser1 = new Conta("2250");
		contaUser1.toString();
		
		Conta contaUser2 = new Conta("1125")
;		contaUser2.toString();
		
		ContaPoupanca poupanca = new ContaPoupanca("3105");		
		
		try {
			contaUser1.depositar(10);
			contaUser1.sacar(10);
			contaUser1.transferir(-10);
		} catch (DepositoNegativoException e) {
			System.err.println("Um erro aconteceu: " + e.getMessage());
		} catch (ValorInsuficienteException e) {
			System.err.println("Um erro aconteceu: " + e.getMessage());
		}
		
		
		
		
		
		
		
		
	}

}