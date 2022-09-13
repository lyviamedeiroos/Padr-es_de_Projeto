package Ted_Heranca;

public class Cliente extends Pessoa{
    private String codigo;

    public Cliente(String nome, String dataNascimento, String endereco, String telsContato, String cargo, String codigo) {
        super(nome, dataNascimento, endereco, telsContato, cargo);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
