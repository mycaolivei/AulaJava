package Acabou2;


public class TesteFuncionario {
	public static void main(String[] args) {
	Gerente g1=new Gerente("Pholly", 5000);
	Programador p1= new Programador("Gustavo", 5000);
	
	double salarioProgramador= p1.calcularSalario(p1.calcularBonus());
	System.out.printf("O salário de %s é %f", p1.nome, salarioProgramador);
	}
		
	}


