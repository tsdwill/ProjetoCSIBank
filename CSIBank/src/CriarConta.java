
public class CriarConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.saldo = 150.32;
		conta1.agencia = 268;
		conta1.numeroConta = 124578;
		conta1.titular = "J�o";
		
		Conta conta2 = new Conta();
		conta2.saldo = 150.32;
		conta2.agencia = 268;
		conta2.numeroConta = 124578;
		conta2.titular = "J�o";
		
		
		if (conta1 == conta2) {
			System.out.println("Contas Iguais");
		} else {
			System.out.println("Contas Diferentes");
		}
		System.out.println(conta1);
		System.out.println(conta2);
	}

}
