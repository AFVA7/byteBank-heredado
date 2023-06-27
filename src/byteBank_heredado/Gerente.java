package byteBank_heredado;

public class Gerente extends Funcionario implements Autenticable {
	
	private AutenticacionUtil util;
	
	public Gerente() {
		// TODO Auto-generated constructor stub
		System.out.println("Aquí se inicia un Gerente");
		util = new AutenticacionUtil();
	}
	
	@Override
	public void setClave(String clave) {
		// TODO Auto-generated method stub
		this.util.setClave(clave);
	}
	
	public String getClave() {
		return this.util.getClave();
	}
	
	public boolean iniciarSesion (String clave){
		return this.util.iniciarSesion(clave);
	}
	@Override
	public double getBonificacion(){
		double boni = super.getSalrio() + this.getSalrio()*0.1;
		 System.out.println("EJECUTANDO DESDE EL GERENTE");
		 System.out.print("Bonificación del gerente: " + boni);
		return boni;
	}
	
}
