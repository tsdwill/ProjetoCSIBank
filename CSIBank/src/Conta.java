
public class Conta {
double saldo;
int agencia;
int numeroConta;
Titular titular;
	public void deposita(double valor) {
			saldo +=valor;
	}

	public boolean saca(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public boolean transfere(double valor, Conta destino) {
		if(saca(valor)) {
			destino.deposita(valor);
			return true;
		} {
			return false;
		}
	}
}