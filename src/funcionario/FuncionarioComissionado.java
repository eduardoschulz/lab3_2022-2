package funcionario;

public class FuncionarioComissionado extends Funcionario{
    private double taxaCommissao, vendasBrutas;

    public FuncionarioComissionado(String nome, String cpf, double taxaCommissao, double vendasBrutas) {
        super(nome, cpf);
        this.taxaCommissao = taxaCommissao;
        this.vendasBrutas = vendasBrutas;
    }
}
