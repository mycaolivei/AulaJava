package listaExercicios1;

public class ContaBancaria {
	private String numeroConta;
	private double saldo;




public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
public void saqueConta(double valor) {
	if (saldo > 0 && saldo >= valor) {
		this.saldo-=valor;
	}else {
		System.out.println("Não há valor na sua conta");
		
		
	}

	}
public void depositoConta(double valor) {
	if ( valor > 0) {
		this.saldo+=valor;
	}else {
		System.out.println("Deposite um valor válido");
} 
}
}