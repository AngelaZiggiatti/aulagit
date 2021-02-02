public class Gerente extends Funcionario {
    
    private int nFuncionarios;

    public Gerente(String nome){
        super(nome); //chamada ao construtor da superclasse "Funcionario"
    }

    //@Override //anotação indicando sobreescrita
    public String getDados() {
            return super.getDados() + " : " + nFuncionarios;
    }
    
    //void Exibir(){
      //  System.out.println(salario);
    }
}
