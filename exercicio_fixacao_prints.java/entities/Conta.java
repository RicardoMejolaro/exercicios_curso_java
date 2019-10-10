package entities;

public class Conta {
	
	public static double TAXA = 5.00;

	private int numConta;
	private String nome;
	private double saldo;
	
		public Conta(int numConta, String nome) {

			this.numConta = numConta;
			this.nome = nome;
		}
		
		public Conta(int numConta, String nome, double primeiroDeposito) {
			
			this.numConta = numConta;
			this.nome = nome;
			depositoConta(primeiroDeposito);
	
		}
	
		public int getNumConta() {
			return numConta;
		}
	
		public String getNome() {
			return nome;
		}
	
		public void setNome(String nome) {
			this.nome = nome;
		}
	
		public double getSaldo() {
			return saldo;
		}
	
		public void depositoConta(double quantia) {
		
			saldo += quantia;
			
		}
		
		public void saqueConta(double quantia) {
			
			saldo -= (quantia + TAXA);
			
		}
		
		public String toString() {
			
			return 	"Número da Conta: "
					+ numConta
					+ ", Cliente: "
					+ nome
					+ ", "
					+ String.format("Saldo: $ %.2f ", saldo);
		}
		
}

