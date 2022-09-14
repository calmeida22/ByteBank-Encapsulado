
public class TestaValores {

	public static void main(String[] args) {
		//int total = 0; (Já foi colocado no construtor)
		Conta conta = new Conta(1337,24226);
		//total++; Já foi colocado no construtor)
		//conta.setAgencia(-50);
		//conta.setNumero(-330);		
		System.out.println(conta.getAgencia());
		conta.setAgencia(1232123);
		
		Conta conta2 = new Conta (1337,16549);
		
		Conta conta3 = new Conta (2112,14660);
				
		System.out.println(Conta.getTotal());


	}

}
