package ex06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int maiorIdade;

        Pessoa joao = new Pessoa("João", 15);
        Pessoa leandro = new Pessoa("Leandro", 21);
        Pessoa paulo = new Pessoa("Paulo", 17);
        Pessoa jessica = new Pessoa("Jéssica", 18);

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(joao);
        pessoas.add(leandro);
        pessoas.add(paulo);
        pessoas.add(jessica);

        maiorIdade = pessoas.stream().mapToInt(Pessoa::getIdade).max().getAsInt();
        pessoas.stream()
        
                .filter(x -> x.getIdade() == maiorIdade)
                .forEach(x -> System.out.println("Pessoa mais velha: " + x.getNome()));

        System.out.println("----------------------------------------------");
        System.out.println("Quantidade de pessoas antes da exclusão: " + pessoas.size());

        pessoas = pessoas.stream().filter(x -> x.getIdade() >= 18).collect(Collectors.toList());

        System.out.println("Quantidade de pessoas após a exclusão: " + pessoas.size());
        System.out.println("----------------------------------------------");

        if (pessoas.contains(jessica)){
            System.out.println("Jessica na está presente na lista! \nIdade: " + jessica.getIdade());
        } System.out.println("----------------------------------------------");
    }
}