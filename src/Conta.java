public abstract class Conta{
	private double saldo;
	private int agencia;
	private int numero;
	Cliente titular;
	private static int total = 0;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Conta " + this.numero + " criada");
	}
	
	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			System.out.println("Operação concluida");
			return true;
		} else {
			System.out.println("Operação não concluida");
			return false;
		}
	}
	public void transfere(double valor, Conta destino) {
		saca(valor);
		destino.deposita(valor);
		
		}
	public double getSaldo() {
		return this.saldo;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero){
		this.numero = numero;
	}
	public int getAgencia() {
		return this.agencia;

	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public int getTotal() {
		return total;
	}
	}

