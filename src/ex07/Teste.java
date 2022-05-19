package ex07;

public class Teste {

    public static void main (String [] args){

        Funcionario gerente = new Gerente("Lucas", 22, 8000.00);
        gerente.bonificacao();
        System.out.println(gerente.toString());

        Funcionario surpevisor = new Supervisor("Gustavo", 30, 4500.00);
        surpevisor.bonificacao();
        System.out.println(surpevisor.toString());

        Funcionario vendedor = new Vendedor("Emerson", 48, 2500.00);
        vendedor.bonificacao();
        System.out.println(vendedor.toString());
    }
}