package Ted_Heranca;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Lucas Lucena", "01/10/1992", "Avenida Brasil", "3247-2882", "Estudante", 202120222, 50000, "01/01/2020");
        Cliente cliente = new Cliente("Mateus Correia", "08/05/2001", "Avenida Sei lá", "4002-8922", "Dev", "007");

        System.out.println("Dados do Funcionário");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Data de Nascimento: " + funcionario.getDataNascimento());
        System.out.println("Endereço: " + funcionario.getEndereco());
        System.out.println("Telefone para contato: " + funcionario.getTelsContato());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Matrícula: " + funcionario.getMatricula());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("Data de Admissão: " + funcionario.getDataAdmissao());

        System.out.println("\n\nDados do Cliente");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Telefone para contato: " + cliente.getTelsContato());
        System.out.println("Cargo: " + cliente.getCargo());
        System.out.println("Código: " + cliente.getCodigo());
    }
}
