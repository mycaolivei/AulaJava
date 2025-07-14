package Membros;

public class usomembros {
	public static void main(String[] args) {
		DataNascimento dt= new DataNascimento();
		DataNascimento dt2= new  DataNascimento();
		dt.dia=13;
		dt.mes=03;
		dt.ano=2000;
		dt2.dia=10;
		dt2.mes=03;
		dt2.ano=2004;
		System.out.printf("A data de nascimento " + "é %d %d %d \n", dt.dia,dt.mes,dt.ano);
		
		
		
		System.out.printf("A data de nascimento " + "é %d %d %d \n", dt2.dia,dt2.mes,dt2.ano);
		
	}

}
