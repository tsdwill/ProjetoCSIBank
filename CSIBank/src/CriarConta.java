
public class CriarConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.saldo = 1500;
		conta1.agencia = 268;
		conta1.numeroConta = 124578;
		Titular maria = new Titular();
		maria.setNome ("MAria Silva");
		maria.setCPF ("123.654.789-00");
		maria.setEmail ("maria@gmail.com");
		conta1.deposita(100);
		conta1.deposita(50);
		System.out.println(conta1.saldo);
		
		
		Conta conta2 = new Conta();
		conta2.saldo = 150;
		conta2.agencia = 268;
		conta2.numeroConta = 14578;
		Titular jao = new Titular();
		jao.setNome ("J�o");
		jao.setCPF ("123.654.789-00");
		jao.setEmail ("jao@gmail.com");
	
		
		
		if(conta1.saca(100)) {
		System.out.println(conta1.saldo);
		}else {
		System.out.println("Saldo Insuficiente");
		}
		
		conta1.transfere(500, conta2);
		System.out.println(conta1.saldo);
		System.out.println(conta2.saldo);
	}
	
}
