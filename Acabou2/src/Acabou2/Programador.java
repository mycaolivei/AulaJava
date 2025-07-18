package Acabou2;

public class Programador extends Funcionario implements Bonificavel {
			double bonus, salario;
	public Programador(String nome, double salario) {
		super(nome, salario);
		
	}

	@Override
	public double calcularBonus() {
		bonus=this.salario*0.1;
		return bonus;
		
		
	}

	@Override
	public double calcularSalario(double bonus) {
		
		return salario=this.salario+bonus;
	}
	
	

}
