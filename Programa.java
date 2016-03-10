class Programa{
	public static void main(String args[]){
		Conta minhaConta;
		minhaConta = new Conta();

		minhaConta.dono = "Humberto Alves";
		minhaConta.saldo = 1000.0;
		System.out.println("Saldo atual.: "+minhaConta.saldo);
	}
}