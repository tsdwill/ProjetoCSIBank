
public class TestaAssociacao {

	public static void main(String[] args) {
		Conta contaDaPaula = new Conta();
		contaDaPaula.agencia = 6532;
		contaDaPaula.numeroConta = 124578;
		contaDaPaula.saldo = 150.00;
		
		Titular paula = new Titular();
		paula.setNome ("Paula Silva");
		paula.setCPF ("123.654.789-00");
		paula.setEmail ("paula@gmail.com");
		
		contaDaPaula.titular = paula;
		
		System.out.println(contaDaPaula.saldo);

	}

}
