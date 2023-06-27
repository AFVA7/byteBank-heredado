package byteBank_heredado;

public class CuentaAhorros extends Cuenta implements Tributacion{

	public CuentaAhorros(int agencia, int número) {
		super(agencia, número);
	}

	@Override
	public void depositar(double monto) {
		// TODO Auto-generated method stub
		super.saldo += monto;
	}

	@Override
	public double getValorImpuesto() {
		// TODO Auto-generated method stub
		return 0;
	}

}
