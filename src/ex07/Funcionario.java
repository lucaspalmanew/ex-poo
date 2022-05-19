package ex07;

public abstract class Funcionario {

    private String nome;
    private Integer idade;
    private Double salario;
    private String funcao; //identificar a função

    public Funcionario(String nome, Integer idade, Double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public abstract void bonificacao();

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                " | Idade: " + idade +
                " | Salário + Bonificação: " + salario +
                " | Função: " + funcao;
    }
}