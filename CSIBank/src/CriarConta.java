
public class CriarConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.saldo = 1500;
		conta1.agencia = 268;
		conta1.numeroConta = 124578;
		conta1.titular = "J�o";
		conta1.deposita(100);
		conta1.deposita(50);
		System.out.println(conta1.saldo);
		
		
		Conta conta2 = new Conta();
		conta2.saldo = 150;
		conta2.agencia = 268;
		conta2.numeroConta = 14578;
		conta2.titular = "J�o";
		System.out.println(conta2.saldo);
		
		
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
