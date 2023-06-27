package byteBank_heredado;

public class TestSaldoInsuficiente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaAhorros c = new CuentaAhorros(1, 2);
		c.depositar(1000);
		CuentaAhorros c2 = new CuentaAhorros(2,3);
		try {
			c.transferir(2000, c2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println();
		System.out.println("-------------vuelva pronto-------------");
	}

}
