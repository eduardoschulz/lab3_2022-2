package funcionario;

public class FuncionarioHorista extends Funcionario{
    private int horasTrab;
    private double salarioHora;

    public FuncionarioHorista(String nome, String cpf, int horasTrab, double salarioHora){
        super(nome, cpf);
        this.horasTrab = horasTrab;
        this.salarioHora = salarioHora;
    }

    public int getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }

    public double getRendimento(){
        if(horasTrab <= 40)
            return horasTrab * salarioHora;
        else
            return (horasTrab * 40) + ((horasTrab - 40) * 1.5);
    }


}
