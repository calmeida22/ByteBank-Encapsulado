public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; // a variavel com static não é vinculada a um objeto, mas visível a toda classe. É requisitada para contabilizar cada conta instaciada.
	
	public void deposita (double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean saca (double valor) { //método que altera o valor do saldo, executando saque.
		if(this.saldo>=valor) {
			this.saldo-=valor;			
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere (Conta destino, double valor) { //método que executa transferência, onde (destino, valor) são variáveis.
		if(this.saldo>=valor) {
			this.saldo-=valor;
			destino.saldo+=valor;			
			return true;
		} else {			
			return false;
		}
	}
	
	public double getSaldo() { //método para apenas acessar o valor do saldo. Para alterar existe o Deposita e Saca.
		return this.saldo;
	}
	
	public int getNumero() { //método que apenas acessa o valor do atributo número.
		return this.numero;
	}
	
	//ESTÁ COMENTADO, POIS O MÉTODO CONSTRUTOR CRIA NÚMERO E NÃO É PRECISO MODIFICAR MAIS.	
	public void setNumero(int numero) { //método que altera o valor do atributo numero com a variável novoNumero, sem retorno. 
		if (numero<=0) {
			System.out.println("Numero Conta: não pode valor menor igual a 0");
			return;
		}
		this.numero = numero; //se não for negativo, nem entra no if e executa esse comando.
	}
	
	public int getAgencia() { //método que acessa o número da agência.
		return this.agencia;
	}
	
	//ESTÁ COMENTADO, POIS O MÉTODO CONSTRUTOR CRIA AGÊNCIA E NÃO É PRECISO MODIFICAR MAIS.	
	public void setAgencia(int agencia) { //método qu altera o número da agência com variável agencia.
		if (agencia <= 0) {
			System.out.println("Agência Conta: não pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia; //se não for negativo, nem entra no if e executa esse comando.
	}
	
	public Cliente getTitular() { //método que acessa o valor do titular.
		return this.titular;
	}
	
	public void setTitular(Cliente titular) {// metodo que altera o valor do titular.
		this.titular = titular;
	}
	
	public Conta(int agencia, int numero) { //criando método construtor
		total++; // a variável total, que é atributo genérico recebe +1 a cada conta instanciada. 
		//System.out.println("O total de conta é " + total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando uma conta " + this.numero);
	}
	
	public static int getTotal() { //Método para exibir o total de contas instanciadas)
		return Conta.total;
	}

}