public class Funcionario {

    // atributos
    private String nome;
    protected double salario;

    // metodos

    // construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;

    }

    // Oversobrecarga de metodos
    public Funcionario(String nome) {
        this.nome = nome;

    }

    //public Funcionario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDados(){
        return nome + ", R$" + salario;
    }

}
