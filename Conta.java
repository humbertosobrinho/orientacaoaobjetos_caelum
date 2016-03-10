class Conta{
	//variaveis
	int numero;
	String dono;
	double saldo;
	double limite;

	//metodos
	boolean saca(double valor){
		if(this.saldo < valor){
			return false;
		}else{
			this.saldo = this.saldo - valor;
			return true;
		}
	}

	void deposita(double quantidade){
		double novoSaldo = this.saldo + quantidade;
		this.saldo += quantidade
	}
}