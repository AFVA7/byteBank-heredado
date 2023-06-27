package byteBank_heredado;

public abstract class Cuenta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int contador = 0;

	public Cuenta(double saldo, int agencia, int numero) {
		// TODO Auto-generated constructor stub
		if (agencia <= 0) {
			System.out.println("No se permite el 0, ni valores negativos");
			return;
		} else {
			this.agencia = agencia;
		}

		this.numero = numero;
		this.saldo = saldo;

		System.out.println("Creando cuenta....");
		System.out.println("Estoy creando la cuenta número: " + this.numero);
		Cuenta.contador++;
		System.out.println("El total de cuentas es: " + Cuenta.contador);
		System.out.println("**************************************************");
	}

	public Cuenta(int agencia, int número) {
		// TODO Auto-generated constructor stub
		this(1000, agencia, número);
	}

	// transacciones
	public abstract void depositar(double monto);

//	public boolean retirar(double valor) {
//		if (saldo >= valor) {
//			saldo -= valor;
//			return true;
//		}
//		return false;
//	}
	// refactor del método anterior
	public void retirar(double valor) throws SaldoInsuficienteException {
		if (saldo < valor) {
			throw new SaldoInsuficienteException("No tiene el saldo suficiente");
		}
		saldo -= valor;
		System.out.print("Ha retirado " + Math.round(valor) + " ");
	}

//	public boolean transferir(double valor, Cuenta cuentaDestino) {
//		if (saldo >= valor) {
//			try {
//				retirar(valor);
//			} catch (SaldoInsuficienteException e) {
//				e.printStackTrace();
//			}
//			cuentaDestino.depositar(valor);
//			return true;
//		}
//		return false;
//	}
	// refactor de meth anterior
	public void transferir(double valor, Cuenta cuentaDestino) throws SaldoInsuficienteException {

		retirar(valor);
		cuentaDestino.depositar(valor);
		System.out.println("y los ha transeferido");
	}

	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	// no se permite setear agencia

	public int getNumero() {
		return numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getContador() {
		return Cuenta.contador;
	}

	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", agencia=" + agencia + ", numero=" + numero + ", titular="
				+ titular.getNombre() + "]";
	}

}
