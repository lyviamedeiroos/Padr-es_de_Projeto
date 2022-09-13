package Ted_Heranca;

public class Pessoa {
    protected String nome;
    protected String dataNascimento;
    protected String endereco;
    protected String telsContato; // adicionar coleção
    protected String cargo;

    public Pessoa(String nome, String dataNascimento, String endereco, String telsContato, String cargo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telsContato = telsContato;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(String telsContato) {
        this.telsContato = telsContato;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void cadastrar(){

    }

    public void obterIdade(){

    }

    public void reajustarSalario(double percentual, double real){
    }

    public void promover(String novoCargo, String cargo){
    }
}
