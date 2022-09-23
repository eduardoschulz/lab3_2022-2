Package Funcionario

public class FuncionarioTeste {

	public static void main(String[] args) {

		FuncionarioComssionadoBaseSalario fca = new FuncionarioComssionadoBaseSalario("Pedro", "1234567890", 120, 30, 5000);
		FuncionarioComissionado fc = new FuncionarioComissionado("Brenno", "1234567880", 240, 50);
		FuncionarioHorista fh = new FuncionarioHorista("Diogo", "1234543210", 50, 30);
		FuncionarioAssalariado fa = new FuncionarioAssalariado("Biel", "9876543210", 1000);
		
		System.out.println(fca.getRendimento());
		System.out.println(fc.getRendimento());
		System.out.println(fh.getRendimento());
		System.out.println(fa.getRendimento());
	}

}
