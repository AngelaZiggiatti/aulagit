public class Gerente extends Funcionario {
    
    private int nFuncionarios;

    public Gerente(String nome, double salario, int Funcionarios){
        super(nome, salario); //chamada ao construtor da superclasse "Funcionario"
        this.nFuncionarios = nFuncionarios;
    }
        public Gerente(String nome){
        super(nome); //chamada ao construtor da superclasse "Funcionario"
    }

    //@Override //anotação indicando sobreescrita
    public String getDados() {
            return super.getDados() + " : " + nFuncionarios;
    }
    
   

    private int getDados() {
        return this.nFuncionarios = nFuncionarios;
    }
}
