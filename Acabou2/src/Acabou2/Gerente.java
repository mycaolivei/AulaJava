package Acabou2;

public class Gerente  extends Funcionario implements Bonificavel{
	double bonus,salario;
	public Gerente(String nome, double salario) {
		super(nome, salario);
	
	}

	@Override
	public double calcularBonus() {
		bonus=this.salario=salario*0.2;
		return bonus;
		
	}

	@Override
	public double calcularSalario(double bonus) {
		
		return salario+bonus;
	}
		
	
	
}
