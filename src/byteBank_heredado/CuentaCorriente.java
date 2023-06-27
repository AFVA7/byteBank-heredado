package byteBank_heredado;

public class CuentaCorriente extends Cuenta implements Tributacion{

	public CuentaCorriente(int agencia, int número) {
		super(agencia, número);
		// TODO Auto-generated constructor stub
	}
	
//	@Override
//	public boolean retirar(double valor) {
//		double comision = 0.2;
//		return super.retirar(valor + comision);
//	}
	@Override
	public void retirar(double valor) throws SaldoInsuficienteException {
		double comision = 0.2;
		super.retirar(valor + comision);
	}
	
	@Override
	public void depositar(double monto) {
		// TODO Auto-generated method stub
		super.saldo += monto;
	}

	@Override
	public double getValorImpuesto() {
		// TODO Auto-generated method stub
		return super.saldo * 0.01;
	}

}
