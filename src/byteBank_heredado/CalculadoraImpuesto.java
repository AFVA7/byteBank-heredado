package byteBank_heredado;

public class CalculadoraImpuesto {
	
	private double Totalimpuesto;
	
	public void registra(Tributacion t) {
		double valor = t.getValorImpuesto();
		this.Totalimpuesto += valor;
	}
	
	public double getTotalimpuesto() {
		return Totalimpuesto;
	}

}
