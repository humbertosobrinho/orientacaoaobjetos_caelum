class Conta{
	//variaveis
	int numero;
	Cliente titular;
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

	void transfere(Conta destino, double valor){
		this.saldo = this.saldo - valor;
		destino.saldo = destino.saldo + valor;
	}
}