package Ted_Heranca;

public class Funcionario extends Pessoa {
    private Integer matricula;
    private double salario;
    private String dataAdmissao;


    public Funcionario(String nome, String dataNascimento, String endereco, String telsContato, String cargo, Integer matricula, double salario, String dataAdmissao) {
        super(nome, dataNascimento, endereco, telsContato, cargo);
        this.matricula = matricula;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public void cadastrar() {
        super.cadastrar();
    }

    @Override
    public void obterIdade() {
        super.obterIdade();
    }

    @Override
    public void reajustarSalario(double percentual, double real) {
        super.reajustarSalario(percentual, real);
    }

    @Override
    public void promover(String novoCargo, String cargo){
        super.promover(novoCargo, cargo);
    }

}
