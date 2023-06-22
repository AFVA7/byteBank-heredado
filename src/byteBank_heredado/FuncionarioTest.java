package byteBank_heredado;

public class FuncionarioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario funcionario = new Funcionario();
		Gerente gerente = new Gerente();
		
		funcionario.setNombre("Andrés");
		funcionario.setDocumento("13473895");
		funcionario.setSalrio(2000);
	
		gerente.setNombre("Jorge");
		gerente.setDocumento("112");
		gerente.setSalrio(5000);
		gerente.setClave("AluraCursos");
		
		System.out.println(funcionario.getSalrio());
		System.out.println(funcionario.getBonificación());
		System.out.println(gerente.getSalrio());
		System.out.println(gerente.getBonificación());
		System.out.println(gerente.iniciarSesion("AluraCursos"));

	}

}
