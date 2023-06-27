package byteBank_heredado;

public abstract class Funcionario {
	
	private String nombre;
	private String documento;
	private double salario;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public double getSalrio() {
		return salario;
	}

	public void setSalrio(double salrio) {
		this.salario = salrio;
	}
	

	public abstract double getBonificacion();

}
