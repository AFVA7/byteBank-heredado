package byteBank_heredado;

public class TestTributacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CuentaCorriente cc = new CuentaCorriente(1, 1);
		cc.depositar(100);
		System.out.println(cc.saldo);
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadoraImpuesto calculadora= new CalculadoraImpuesto();
		
		calculadora.registra(cc);
		calculadora.registra(seguro);
		
		System.out.println(calculadora.getTotalimpuesto());

	}

}
