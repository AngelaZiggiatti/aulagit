/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Funcionario f = new Funcionario("Angela", 3000);
        Gerente g = new Gerente("Alexandre", 4000);

      
        System.out.println(f.getDados());
        System.out.println(g.getDados());

        //g.setNome("Alexandre");
        //System.out.println(f.salario);
        //System.out.println("Gerente: " + g.getNome());
    }
}
