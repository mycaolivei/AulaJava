package listaExercicios1;

public class testeContaBancaria {

	public static void main(String[] args) {
		ContaBancaria minhaConta=new ContaBancaria();
		minhaConta.setNumeroConta("1234565");
		minhaConta.depositoConta(20000);
		minhaConta.saqueConta(1000);
		System.out.println(minhaConta.getSaldo());
	}

}
